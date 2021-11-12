package com.example.crypton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setAdapter()
    }

    private fun setAdapter() {
        val songList= mutableListOf<DemoAdapterModel>()
        var demoAdapterModel1=DemoAdapterModel()
        demoAdapterModel1.title="this is title"
        demoAdapterModel1.desc="this is description"
        songList.add(demoAdapterModel1)
        var demoAdapterModel2=DemoAdapterModel()
        demoAdapterModel2.title="this is title"
        demoAdapterModel2.desc="this is description"
        songList.add(demoAdapterModel2)
        var demoAdapterModel3=DemoAdapterModel()
        demoAdapterModel3.title="this is title"
        demoAdapterModel3.desc="this is description"
        songList.add(demoAdapterModel3)
        var demoAdapterModel4=DemoAdapterModel()
        demoAdapterModel4.title="this is title"
        demoAdapterModel4.desc="this is description"
        songList.add(demoAdapterModel4)
        var demoAdapterModel5=DemoAdapterModel()
        demoAdapterModel5.title="this is title"
        demoAdapterModel5.desc="this is description"
        songList.add(demoAdapterModel5)
        var demoAdapterModel6=DemoAdapterModel()
        demoAdapterModel6.title="this is title"
        demoAdapterModel6.desc="this is description"
        songList.add(demoAdapterModel6)
        var demoAdapterModel7=DemoAdapterModel()
        demoAdapterModel7.title="this is title"
        demoAdapterModel7.desc="this is description"
        songList.add(demoAdapterModel7)

        var rv=findViewById<RecyclerView>(R.id.recyclerview)
        rv.adapter=DemoAdapter(songList)
        rv.layoutManager=LinearLayoutManager(this)

    }
}