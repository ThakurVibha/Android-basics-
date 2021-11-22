package com.example.crypton.fragmentsbasics

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.crypton.R
import kotlinx.android.synthetic.main.fragment_demo2.*

class DemoFragment2 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_demo2, container, false)

    }

    fun displayOutput(demoModel: DemoModel){
//       tvOutput.text= demoModel.toString()
        Log.e("pass", "displayOutput: "+demoModel.toString() )

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}