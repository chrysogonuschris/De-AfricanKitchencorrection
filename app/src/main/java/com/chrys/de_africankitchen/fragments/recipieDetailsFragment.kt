package com.chrys.de_africankitchen.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.chrys.de_africankitchen.R
import com.squareup.picasso.Picasso

class recipieDetailsFragment : Fragment() {

    lateinit var foodName : TextView
    lateinit var cooktime : TextView
    lateinit var foodImg : ImageView
    lateinit var countryImg : ImageView
    lateinit var country : TextView
    lateinit var ingredients : TextView
    lateinit var methods : TextView


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.recipie_details, container, false)

        foodName = view.findViewById(R.id.name)
        cooktime = view.findViewById(R.id.duration)
        foodImg = view.findViewById(R.id.foodimg)
        countryImg = view.findViewById(R.id.countryimg)
        country = view.findViewById(R.id.countrys)
        ingredients = view.findViewById(R.id.ingredients)
        methods = view.findViewById(R.id.methods)

        val foodname = arguments?.getString("name")
        val Country = arguments?.getString("country")
        val dura = arguments?.getString("duration")
        val ingre = arguments?.getString("ingredients")
        val howto = arguments?.getString("methods")
        val foodimg = arguments?.getString("fimage")
        val countryimg = arguments?.getString("cimage")


        foodName.text = foodname
        cooktime.text = dura
        Picasso.get().load(foodimg).into(foodImg)
        Picasso.get().load(countryimg).into(countryImg)
        country.text = Country
        ingredients.text = ingre.toString()
        methods.text = howto.toString()

        return view
    }

}