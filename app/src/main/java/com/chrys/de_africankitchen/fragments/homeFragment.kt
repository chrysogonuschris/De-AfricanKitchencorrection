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
import com.chrys.de_africankitchen.adapters.homeAdapter
import com.chrys.de_africankitchen.models.mostpopularmodel
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import java.util.Locale

class homeFragment : Fragment() {

    lateinit var search : SearchView
    lateinit var loading : TextView
    lateinit var recycler : RecyclerView
    lateinit var mprecipie : ArrayList<mostpopularmodel>
    lateinit var hadapter : homeAdapter
    lateinit var filteredList : ArrayList<mostpopularmodel>


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.home_fragment, container, false)

          loading = view.findViewById(R.id.load)
          recycler = view.findViewById(R.id.homeRecycler)
          search = view.findViewById(R.id.homeSearch)


        mprecipie = arrayListOf<mostpopularmodel>()
        filteredList = ArrayList<mostpopularmodel>()

        recycler.visibility = View.GONE
        loading.visibility = View.VISIBLE

        var database = FirebaseDatabase.getInstance()
        val recipieRef = database.getReference("recipies/mostpopularRecipies")

        recipieRef.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                mprecipie.clear()
                filteredList.clear()
                for (childsnap in snapshot.children){
                    var recipie = childsnap.getValue(mostpopularmodel::class.java)
                    mprecipie.add(recipie!!)
                }

                hadapter = homeAdapter(mprecipie, filteredList)
                recycler.adapter = hadapter
                recycler.layoutManager = LinearLayoutManager(activity)

                hadapter.setOnOriginalItemClickListener(object : homeAdapter.onItemClickListener{
                    override fun onItemClick(position: Int) {
                        val bundle = Bundle()
                        bundle.putString("name", mprecipie[position].name)
                        bundle.putString("country", mprecipie[position].region)
                        bundle.putString("duration", mprecipie[position].duration.toString())
                        bundle.putString("ingredients", mprecipie[position].ingredients)
                        bundle.putString("methods", mprecipie[position].methods)
                        bundle.putString("fimage", mprecipie[position].images)
                        bundle.putString("cimage", mprecipie[position].countryImg)

                        val recipieDetailsFragment = recipieDetailsFragment()
                        recipieDetailsFragment.arguments = bundle

                        var fragmentManager = requireActivity().supportFragmentManager
                        fragmentManager.popBackStack()
                        val fragmentTransaction = fragmentManager.beginTransaction()
                        fragmentTransaction.replace(R.id.frame, recipieDetailsFragment)
                        fragmentTransaction.addToBackStack(null)
                        fragmentTransaction.commit()

                    }

                })

                hadapter.setOnFilteredItemClickListener(object : homeAdapter.onItemClickListener{
                    override fun onItemClick(position: Int) {
                        val bundle = Bundle()
                        bundle.putString("name", filteredList[position].name)
                        bundle.putString("country", filteredList[position].region)
                        bundle.putString("duration", filteredList[position].duration.toString())
                        bundle.putString("ingredients", filteredList[position].ingredients)
                        bundle.putString("methods", filteredList[position].methods)
                        bundle.putString("fimage", filteredList[position].images)
                        bundle.putString("cimage", filteredList[position].countryImg)

                        val recipieDetailsFragment = recipieDetailsFragment()
                        recipieDetailsFragment.arguments = bundle

                        var fragmentManager = requireActivity().supportFragmentManager
                        fragmentManager.popBackStack()
                        val fragmentTransaction = fragmentManager.beginTransaction()
                        fragmentTransaction.replace(R.id.frame, recipieDetailsFragment)
                        fragmentTransaction.addToBackStack(null)
                        fragmentTransaction.commit()
                    }

                })


                recycler.visibility = View.VISIBLE
                loading.visibility = View.GONE

            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        search.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
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
            val lowerCaseQuery = newText.lowercase(Locale.getDefault())
            filteredList.addAll(mprecipie.filter { recipe ->
                recipe.region.lowercase(Locale.getDefault()).contains(lowerCaseQuery)
            })
        } else {
            filteredList.addAll(mprecipie)
        }

        hadapter.notifyDataSetChanged()

//        if (newText != null){
//             filteredList.clear()
//            for (i in mprecipie){
//                if (i.region.lowercase(Locale.ROOT).contains(newText)){
//                    filteredList.add(i)
//                }
//            }
//
//            if (filteredList.isEmpty()){
//
//               Toast.makeText(activity, "Data not found", Toast.LENGTH_LONG).show()
//
//            }else{
//                hadapter.setfilteredList(filteredList)
//
//            }
//
//            if (newText == null){
//                filteredList.clear()
//            }
//
//        }
//        else {
//            filteredList.clear()
//        }



    }

    override fun onPause() {
        super.onPause()
        search.clearFocus()
        hadapter.setfilteredList(mprecipie)
    }

    override fun onResume() {
        super.onResume()
        filteredList.clear()
    }

}

