package com.example.crypton.fragmentsbasics

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.crypton.R
import com.example.crypton.fragmentsbasics.callback.ToolbarInterface
import kotlinx.android.synthetic.main.fragment_a.*

class FragmentA : Fragment() {
    lateinit var toobarInterface: ToolbarInterface
    var incomingMessage = ""

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        toobarInterface.setToolbar(tag!!)
        var bundle: Bundle = arguments!!
        if (bundle != null) {
            incomingMessage = bundle.getString("incomingMessage")!!


        }


    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        toobarInterface = context as ToolbarInterface
    }

    private fun handleMessage() {

        if (!incomingMessage.equals("")) {
            fragmentA.text = incomingMessage

        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        handleMessage()

    }

}