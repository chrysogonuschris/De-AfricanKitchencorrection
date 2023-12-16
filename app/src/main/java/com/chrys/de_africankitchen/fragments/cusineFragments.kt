package com.chrys.de_africankitchen.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chrys.de_africankitchen.R
import com.chrys.de_africankitchen.adapters.cusineAdapter
import com.chrys.de_africankitchen.models.generalrecipiemodel
import com.chrys.de_africankitchen.models.mostpopularmodel
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import java.util.Locale

class cusineFragments : Fragment() {

    lateinit var loading : TextView
    lateinit var search : SearchView
    lateinit var cRecycler : RecyclerView
    lateinit var gnrecipies : ArrayList<generalrecipiemodel>
    lateinit var cAdapter : cusineAdapter
    lateinit var filteredList : ArrayList<generalrecipiemodel>

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.cusine_fragment, container, false)

        loading = view.findViewById(R.id.load)
        cRecycler = view.findViewById(R.id.cusineRecycler)
        search = view.findViewById(R.id.cusineSearch)

        gnrecipies = arrayListOf<generalrecipiemodel>()
        filteredList = ArrayList<generalrecipiemodel>()

        cRecycler.visibility = View.GONE
        loading.visibility = View.VISIBLE


        val database = FirebaseDatabase.getInstance()
        var gnrecipieref = database.getReference("recipies/generalRecipies")

        gnrecipieref.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                gnrecipies.clear()
                for (childsnap in snapshot.children){
                    val recipies = childsnap.getValue(generalrecipiemodel::class.java)
                    recipies?.let { gnrecipies.add(it) }
                }

                cAdapter = cusineAdapter(gnrecipies, filteredList)
                cRecycler.adapter = cAdapter
                cRecycler.layoutManager = LinearLayoutManager(activity)



                cAdapter.setOnOriginalItemClickistener(object  : cusineAdapter.onItemClickListener{
                    override fun onItemClick(position: Int) {
                        val bundle = Bundle()
                      bundle.putString("name", gnrecipies[position].name)
                        bundle.putString("country", gnrecipies[position].country)
                        bundle.putString("duration", gnrecipies[position].duration.toString())
                        bundle.putString("ingredients", gnrecipies[position].ingredients)
                        bundle.putString("methods", gnrecipies[position].methods)
                        bundle.putString("fimage", gnrecipies[position].images)
                        bundle.putString("cimage", gnrecipies[position].countryImg)

                        val recipieDetailsFragment = recipieDetailsFragment()
                        recipieDetailsFragment.arguments = bundle

                        var fragmentManager = requireActivity().supportFragmentManager
                        fragmentManager.popBackStack()
                        val fragmentTransaction = fragmentManager.beginTransaction()
                        fragmentTransaction.replace(R.id.frame, recipieDetailsFragment)
                        fragmentTransaction.addToBackStack(null)
                        fragmentTransaction.commit()

                        search.clearFocus()
                    }

                })

                cAdapter.setOnfilteredItemClickistener(object  : cusineAdapter.onItemClickListener{
                    override fun onItemClick(position: Int) {
                        val bundle = Bundle()
                        bundle.putString("name", filteredList[position].name)
                        bundle.putString("country",  filteredList[position].country)
                        bundle.putString("duration",  filteredList[position].duration.toString())
                        bundle.putString("ingredients",  filteredList[position].ingredients)
                        bundle.putString("methods",  filteredList[position].methods)
                        bundle.putString("fimage",  filteredList[position].images)
                        bundle.putString("cimage",  filteredList[position].countryImg)

                        val recipieDetailsFragment = recipieDetailsFragment()
                        recipieDetailsFragment.arguments = bundle

                        var fragmentManager = requireActivity().supportFragmentManager
                        fragmentManager.popBackStack()
                        val fragmentTransaction = fragmentManager.beginTransaction()
                        fragmentTransaction.replace(R.id.frame, recipieDetailsFragment)
                        fragmentTransaction.addToBackStack(null)
                        fragmentTransaction.commit()

                        search.clearFocus()

                    }

                })

                cRecycler.visibility = View.VISIBLE
                loading.visibility = View.GONE

            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })

        search.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true
            }

        })

        return view
    }



    private fun filterList(newText: String?) {

        filteredList.clear()

        if (newText!!.isNotEmpty()) {
            val lowerCaseQuery = newText.lowercase(Locale.ROOT)
            filteredList.addAll(gnrecipies.filter { recipe ->
                recipe.country.lowercase(Locale.ROOT).contains(lowerCaseQuery)
            })
        } else {
            filteredList.addAll(gnrecipies)
        }

        cAdapter.notifyDataSetChanged()

//        if (newText != null){
//
//
//        }
//             filteredList.clear()
//            for (i in gnrecipies){
//                if (i.country.lowercase(Locale.ROOT).contains(newText)){
//                    filteredList.add(i)
//                }
//            }
//
//            if (filteredList.isEmpty()){
//
//                Toast.makeText(activity, "Data not found", Toast.LENGTH_LONG).show()
//
//            }else{
//
//                cAdapter.setfilteredList(filteredList)
//
//            }
//
//
//
//        }else {
//            search.clearFocus()
//            filteredList.clear()
//        }

    }


}