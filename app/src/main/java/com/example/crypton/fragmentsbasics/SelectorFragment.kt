package com.example.crypton.fragmentsbasics

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.crypton.R
import com.example.crypton.fragmentsbasics.callback.ToolbarInterface
import kotlinx.android.synthetic.main.fragment_selector.*

class SelectorFragment : Fragment(), View.OnClickListener {
    lateinit var toolbarInterface: ToolbarInterface
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view =
            LayoutInflater.from(context).inflate(R.layout.fragment_selector, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_fragment_a.setOnClickListener(this)
        btn_fragment_b.setOnClickListener(this)
        btn_fragment_c.setOnClickListener(this)

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        toolbarInterface = context as ToolbarInterface
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        toolbarInterface.setToolbar(tag!!)

    }

    override fun onClick(v: View?) {

        var message = message.text.toString()
        when (v!!.id) {
            R.id.btn_fragment_a -> toolbarInterface.inflateFragments("fragmentA", message)
            R.id.btn_fragment_b -> toolbarInterface.inflateFragments("fragmentB", message)


        }
    }
}