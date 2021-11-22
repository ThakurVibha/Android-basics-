package com.example.crypton.designs.furnitureapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.crypton.R
import com.example.crypton.designs.furnitureapp.fragments.CartFragment
import com.example.crypton.designs.furnitureapp.fragments.NewArrivalFragment
import com.example.crypton.designs.furnitureapp.models.NewArrivalModel
import com.google.android.material.bottomnavigation.BottomNavigationView

class NavigationActivity : AppCompatActivity() {
    var newArrivalFragment = NewArrivalFragment()
    var cartFragment = CartFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)
        selectFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, newArrivalFragment)
            .commit()
    }



    //sending data from activity to fragment



    private fun selectFragment() {


        var nav_view = findViewById<BottomNavigationView>(R.id.nav_view)
        nav_view.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_newarrival ->
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, newArrivalFragment)
                        .commit()

                R.id.navigation_cart -> supportFragmentManager.beginTransaction()
                    .replace(R.id.frameLayout, cartFragment)
                    .commit()
            }
            true
        }
    }

}



