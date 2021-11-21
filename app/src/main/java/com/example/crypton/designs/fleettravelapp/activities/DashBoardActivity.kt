package com.example.crypton.designs.fleettravelapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.crypton.R
import com.example.crypton.designs.fleettravelapp.adapters.DashboardAdapter
import com.example.crypton.designs.fleettravelapp.models.FleetModel

class DashBoardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_design)
        setAdapter()
        onClick()
    }

    private fun onClick() {
        var email=findViewById<EditText>(R.id.edtEmail)
        email.setOnClickListener {
            var locationIntent=Intent(this, SearchActivity::class.java)
            startActivity(locationIntent)
        }
    }

    private fun setAdapter() {
        var imageList: ArrayList<FleetModel> = ArrayList()
        var dashBoardModel1 = FleetModel()
        dashBoardModel1.image = R.drawable.homeimage
        imageList.add(dashBoardModel1)
        var dashBoardModel2 = FleetModel()
        dashBoardModel2.image = R.drawable.home
        imageList.add(dashBoardModel2)
        var dashBoardModel3 = FleetModel()
        dashBoardModel3.image = R.drawable.interior
        imageList.add(dashBoardModel3)
        var dashBoardModel4 = FleetModel()
        dashBoardModel4.image = R.drawable.home
        imageList.add(dashBoardModel4)
        var dashBoardModel5 = FleetModel()
        dashBoardModel5.image = R.drawable.interior
        imageList.add(dashBoardModel5)
        var dashBoardModel6 = FleetModel()
        dashBoardModel6.image = R.drawable.homeimage
        imageList.add(dashBoardModel6)
        var dashBoardModel7 = FleetModel()
        dashBoardModel7.image = R.drawable.home
        imageList.add(dashBoardModel7)
        var dashBoardModel8= FleetModel()
        dashBoardModel8.image = R.drawable.interior
        imageList.add(dashBoardModel8)
        var dashBoardModel9 = FleetModel()
        dashBoardModel9.image = R.drawable.homeimage
        imageList.add(dashBoardModel9)

        var rv=findViewById<RecyclerView>(R.id.rvDashboard)
        rv.adapter=DashboardAdapter(imageList)
//        rv.layoutManager=GridLayoutManager(this, 2)
        rv.layoutManager=LinearLayoutManager(this)

    }


}