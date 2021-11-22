package com.example.crypton.fragmentsbasics

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.crypton.R
import androidx.annotation.NonNull
import kotlinx.android.synthetic.main.fragment_demo.*


class DemoFragment : Fragment() {
    lateinit var commnunicator: DemoFragment.Commnunicator
    lateinit var tv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_demo, container, false)
        return view

    }

    private fun done() {
        var demoModel = DemoModel()
        demoModel.name = edtName.text.toString()
        demoModel.age = edtAge.text.toString()
        commnunicator.onSendData(demoModel)

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Commnunicator) {
            commnunicator = context as Commnunicator
        }
    }


    interface Commnunicator {
        fun onSendData(demoModel: DemoModel)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var bundle = arguments;
        if (bundle != null) {
            var message = bundle!!.getString("key")
            Log.e("data", "onCreateView: $message")
        }
        btnDone.setOnClickListener {
            done()
        }

    }
}
