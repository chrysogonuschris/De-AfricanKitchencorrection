package com.chrys.de_africankitchen.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.chrys.de_africankitchen.R
import com.chrys.de_africankitchen.models.mostpopularmodel
import com.squareup.picasso.Picasso

class homeAdapter(var mprecipie : ArrayList<mostpopularmodel>, var filteredList : ArrayList<mostpopularmodel>) : RecyclerView.Adapter<homeAdapter.mpViewholder>() {

    class mpViewholder(itemview : View) : RecyclerView.ViewHolder(itemview){

        val foodimg : ImageView = itemview.findViewById(R.id.foodImg)
        val countryimg : ImageView = itemview.findViewById(R.id.countryImg)
        val country : TextView = itemview.findViewById(R.id.country)
        val foodName : TextView = itemview.findViewById(R.id.food)



    }

    private lateinit var  originalClickListener : onItemClickListener
    private lateinit var  filteredClickListener : onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnOriginalItemClickListener(listener : onItemClickListener){
         originalClickListener = listener
    }

    fun setOnFilteredItemClickListener(listener : onItemClickListener){
       filteredClickListener = listener
    }

    fun setfilteredList(mprecipie: ArrayList<mostpopularmodel>){
        this.mprecipie = mprecipie
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mpViewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return mpViewholder(view)
    }

    override fun getItemCount(): Int {
        return if (filteredList.isEmpty()){
            mprecipie.size
        }else{
            filteredList.size
        }
    }

    override fun onBindViewHolder(holder: mpViewholder, position: Int) {

        val item = if (filteredList.isEmpty()){
            mprecipie[position]
        }else{
            filteredList[position]
        }
        Picasso.get().load(item.images).into(holder.foodimg)
        Picasso.get().load(item.countryImg).into(holder.countryimg)
        holder.foodName.text = item.name
        holder.country.text = item.region

        holder.itemView.setOnClickListener {
            if (filteredList.isNotEmpty()){
                filteredClickListener.onItemClick(position)
            }else{
                originalClickListener.onItemClick(position)
            }
        }

    }

}