package com.example.crypton.fragmentsbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.crypton.R
import kotlinx.android.synthetic.main.activity_demo.*


//Demo to pass data between activities and fragments
//Basic communication between activities and fragments

class DemoActivity : AppCompatActivity(), DemoFragment.Commnunicator {
    var fragment_tag="fragment_tag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)
        var demoFragment=DemoFragment()
        var demoFragment2=DemoFragment2()
        supportFragmentManager.beginTransaction().add(R.id.flContainer, demoFragment).commit()
        supportFragmentManager.beginTransaction().add(R.id.flContainer2, demoFragment2, fragment_tag).commit()

    }
    override fun onSendData(demoModel: DemoModel) {
        var fragment2=DemoFragment2()
        fragment2.displayOutput(demoModel)


    }
}