package com.example.crypton.fragmentsbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.crypton.R
import com.example.crypton.fragmentsbasics.callback.ToolbarInterface
import kotlinx.android.synthetic.main.activity_demo.*

class DemoActivity : AppCompatActivity(), ToolbarInterface {

    //Fragment to activity communication
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)
        init()

    }


    private fun init() {
        var selectorFragment = SelectorFragment()
        doFragmentTransaction(selectorFragment, "SelectorFragment", false, "")
    }

    private fun doFragmentTransaction(
        fragment: Fragment,
        tag: String,
        addToBackStack: Boolean,
        message: String
    ) {
        if (!message.equals("")) {
            var bundle = Bundle()
            bundle.putString("incomingMessage", message)
            fragment.arguments = bundle
        }
        var transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.flContainer, fragment, tag)
        if (addToBackStack) {
            transaction.addToBackStack(tag)

        }
        transaction.commit()

    }

    override fun setToolbar(fragmentTag: String) {
        tvToolbar.text = fragmentTag
    }

    override fun inflateFragments(fragmentTag: String, message: String) {
        if (fragmentTag.equals("fragmentA")) {
            var fragmentA = FragmentA()

            doFragmentTransaction(fragmentA, fragmentTag, true, message)
        } else if (fragmentTag.equals("fragmentB")) {
            var fragmentB=FragmentB()
            doFragmentTransaction(fragmentB, fragmentTag, true, message)


        } else if (fragmentTag.equals("fragmentC")) {

        }
    }

}