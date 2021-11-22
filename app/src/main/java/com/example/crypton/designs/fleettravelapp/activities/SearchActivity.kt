package com.example.crypton.designs.fleettravelapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.example.crypton.R
import com.example.crypton.designs.fleettravelapp.adapters.FragmentAdapter
import com.example.crypton.fragmentsbasics.DemoFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class SearchActivity : AppCompatActivity() {
    var demoFragment= DemoFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location)
        setAdapter()
        onClick()
        passData()
        supportFragmentManager.beginTransaction().add(R.id.container, demoFragment).commit()

    }

    private fun passData() {
        var bundle:Bundle=Bundle()
        bundle.putString("key", "This is the data that i want to pass")
        var fragment= DemoFragment()
        fragment.arguments=bundle
    }

    private fun onClick() {
        var search = findViewById<TextView>(R.id.tvSearch)
        search.setOnClickListener {
            var optionsIntent = Intent(this, OptionsActivity::class.java)
            startActivity(optionsIntent)
        }
    }

    private fun setAdapter() {
        var tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        var viewpager = findViewById<ViewPager2>(R.id.viewpager2)
        var adapter = FragmentAdapter(supportFragmentManager, lifecycle)
        viewpager.adapter = adapter
        TabLayoutMediator(tabLayout, viewpager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Stay"
                }
                1 -> {
                    tab.text = "Flight"
                }
                2 -> {
                    tab.text = "Cabs"
                }
                3 -> {
                    tab.text = "Demo"
                }

            }
        }.attach()
    }
}