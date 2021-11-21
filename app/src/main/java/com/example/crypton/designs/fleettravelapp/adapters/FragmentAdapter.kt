package com.example.crypton.designs.fleettravelapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.crypton.designs.fleettravelapp.fragments.CarsFragment
import com.example.crypton.designs.fleettravelapp.fragments.FlightsFragments
import com.example.crypton.designs.fleettravelapp.fragments.StayFragment
import com.example.crypton.designs.fleettravelapp.fragments.ThingsFragment

class FragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        //how many fragments
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                StayFragment()
            }
            1 -> {
                FlightsFragments()
            }
            2 -> {
                CarsFragment()

            }
            3 -> {
                ThingsFragment()
            }
            else -> Fragment()
        }


    }


}