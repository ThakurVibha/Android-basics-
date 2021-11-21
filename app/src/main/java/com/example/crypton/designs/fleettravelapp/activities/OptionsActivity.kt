package com.example.crypton.designs.fleettravelapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.crypton.R
import com.example.crypton.designs.fleettravelapp.adapters.SearchAdapter
import com.example.crypton.designs.fleettravelapp.models.FleetModel

class OptionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)
        setAdapter()
    }

    private fun setAdapter() {
        var imageList:ArrayList<FleetModel> = ArrayList()
        var fleetModel1=FleetModel()
        fleetModel1.image=R.drawable.pexel
        imageList.add(fleetModel1)

        var fleetModel2=FleetModel()
        fleetModel2.image=R.drawable.pexel1
        imageList.add(fleetModel2)

        var fleetModel3=FleetModel()
        fleetModel3.image=R.drawable.pexel3
        imageList.add(fleetModel3)

        var fleetModel4=FleetModel()
        fleetModel4.image=R.drawable.pexel4
        imageList.add(fleetModel4)

        var fleetModel5=FleetModel()
        fleetModel5.image=R.drawable.pexel5
        imageList.add(fleetModel5)

        var fleetModel6=FleetModel()
        fleetModel6.image=R.drawable.pexel
        imageList.add(fleetModel6)

        var fleetModel=FleetModel()
        fleetModel.image=R.drawable.pexel1
        imageList.add(fleetModel)

        var adapter=SearchAdapter(imageList)
        var rvSearch=findViewById<RecyclerView>(R.id.rvSearch)
        rvSearch.layoutManager=LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvSearch.adapter=adapter

    }
}