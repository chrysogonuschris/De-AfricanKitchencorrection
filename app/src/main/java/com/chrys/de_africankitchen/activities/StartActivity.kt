package com.chrys.de_africankitchen.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.chrys.de_africankitchen.R
import com.chrys.de_africankitchen.fragments.addToKitchen
import com.chrys.de_africankitchen.fragments.cusineFragments
import com.chrys.de_africankitchen.fragments.homeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class StartActivity : AppCompatActivity() {

    lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        bottomNav = findViewById(R.id.bottomNavigationView)

        bottomNav.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId) {

                R.id.home ->  getFragments(homeFragment())

                R.id.kitchen ->  getFragments(cusineFragments())

                R.id.add ->  getFragments(addToKitchen())

                else -> {}

            }

            true
        }

        getFragments(homeFragment())
    }

    private fun getFragments(fragments : Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame, fragments)
        fragmentTransaction.commit()

    }
}