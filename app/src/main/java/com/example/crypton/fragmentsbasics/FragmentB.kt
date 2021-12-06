package com.example.crypton.fragmentsbasics

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.crypton.R
import com.example.crypton.fragmentsbasics.callback.ToolbarInterface
import kotlinx.android.synthetic.main.fragment_b.*


class FragmentB : Fragment() {
    lateinit var toolbarInterface: ToolbarInterface
    var incomingMessage = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var bundle: Bundle? = this.arguments
        if (bundle != null) {
            incomingMessage= bundle.get("incomingMessage").toString()

        }

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        toolbarInterface = context as ToolbarInterface
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false)
    }



    fun handleMessage(){
        if (!incomingMessage.equals("")){
            fragmentB.text=incomingMessage
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        handleMessage()
    }
}