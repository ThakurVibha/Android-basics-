package com.example.crypton.designs.furnitureapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.crypton.R
import com.example.crypton.designs.furnitureapp.fragments.NewArrivalFragment

class OnBoardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)
        onClick()
    }

    private fun onClick() {

        var btnStart = findViewById<TextView>(R.id.btnStart)
        btnStart.setOnClickListener {

            var dashboardIntent = Intent(this, NavigationActivity::class.java)
            startActivity(dashboardIntent)
        }
    }
}