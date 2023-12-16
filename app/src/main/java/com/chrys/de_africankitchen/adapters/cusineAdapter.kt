package com.chrys.de_africankitchen.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.chrys.de_africankitchen.R
import com.chrys.de_africankitchen.models.generalrecipiemodel
import com.squareup.picasso.Picasso

class cusineAdapter (var gnrecipies : ArrayList<generalrecipiemodel>, var filteredList : ArrayList<generalrecipiemodel>) : RecyclerView.Adapter<cusineAdapter.gnViewholder>() {

    class gnViewholder(itemview : View) : RecyclerView.ViewHolder(itemview){

        val foodimg : ImageView = itemview.findViewById(R.id.foodImg)
        val countryimg : ImageView = itemview.findViewById(R.id.countryImg)
        val country : TextView = itemview.findViewById(R.id.country)
        val foodName : TextView = itemview.findViewById(R.id.food)


    }

    private lateinit var originalClickListener: onItemClickListener
    private lateinit var filteredClickListener: onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnOriginalItemClickistener(listener: onItemClickListener){
        originalClickListener = listener
    }

    fun setOnfilteredItemClickistener(listener: onItemClickListener){
        filteredClickListener = listener
    }

    fun setfilteredList(gnrecipies: ArrayList<generalrecipiemodel>){
        this.gnrecipies = gnrecipies
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): gnViewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)

        return gnViewholder(view)
    }

    override fun getItemCount(): Int {
        return if (filteredList.isEmpty()) {
            gnrecipies.size
        }else{
            filteredList.size
        }
    }

    override fun onBindViewHolder(holder: gnViewholder, position: Int) {

        val item = if (filteredList.isEmpty()){
            gnrecipies[position]
        }else{
            filteredList[position]
        }

        Picasso.get().load(item.images).into(holder.foodimg)
        Picasso.get().load(item.countryImg).into(holder.countryimg)
        holder.foodName.text = item.name
        holder.country.text = item.country

        holder.itemView.setOnClickListener {
            if (filteredList.isNotEmpty()){
                filteredClickListener.onItemClick(position)
            }else {
                originalClickListener.onItemClick(position)
            }
        }

    }

}