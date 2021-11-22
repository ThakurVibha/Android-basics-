package com.example.crypton.designs.furnitureapp.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.crypton.R
import com.example.crypton.designs.furnitureapp.adpters.CollectionsAdapter
import com.example.crypton.designs.furnitureapp.adpters.NewArrivalAdapter
import com.example.crypton.designs.furnitureapp.models.NewArrivalModel


class NewArrivalFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_new_arrival, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setNewArrivalAdapter()
        setCollectionAdapter()
    }
    private fun setCollectionAdapter() {
        var collectionList:ArrayList<NewArrivalModel> = ArrayList()
        val newArrivalModel= NewArrivalModel()
        newArrivalModel.image=R.drawable.shoes3
        collectionList.add(newArrivalModel)
        val newArrivalModel1= NewArrivalModel()
        newArrivalModel1.image=R.drawable.shoes1
        collectionList.add(newArrivalModel1)
        val newArrivalModel2= NewArrivalModel()
        newArrivalModel2.image=R.drawable.shoes
        collectionList.add(newArrivalModel2)

        var collectionsAdapter= CollectionsAdapter(collectionList)
        var rv=requireActivity().findViewById<RecyclerView>(R.id.rvCollection)
        rv.adapter=collectionsAdapter
        rv.layoutManager= LinearLayoutManager(activity)
    }

    private fun setNewArrivalAdapter() {
        var newArrivalList:ArrayList<NewArrivalModel> = ArrayList()
        val newArrivalModel= NewArrivalModel()
        newArrivalModel.image=R.drawable.shoes1
        newArrivalModel.category= "Anchor"
        newArrivalModel.title="New"
        var usd="$"
        newArrivalModel.price="345 {$usd}"
        newArrivalModel.name="New Anchor"
        newArrivalModel.ratingBar=3
        newArrivalList.add(newArrivalModel)

        val newArrivalModel1= NewArrivalModel()
        newArrivalModel1.image=R.drawable.shoes
        newArrivalModel1.category= "Comfu"
        newArrivalModel1.title="Old"
        newArrivalModel1.price="353"
        newArrivalModel1.name="Classic Comfu"
        newArrivalModel1.ratingBar=3
        newArrivalList.add(newArrivalModel1)

        val newArrivalModel2= NewArrivalModel()
        newArrivalModel2.image=R.drawable.shoes3
        newArrivalModel2.category= "Cult classic"
        newArrivalModel2.title="Classic"
        newArrivalModel2.price="108"
        newArrivalModel2.name=R.string.chair_name.toString()
        newArrivalModel2.ratingBar=3
        newArrivalList.add(newArrivalModel2)


        val adapter= NewArrivalAdapter(newArrivalList, requireActivity())
        val rv=requireActivity().findViewById<RecyclerView>(R.id.rvNewArrival)
        rv.adapter=adapter
        rv.layoutManager= LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)



    }
}