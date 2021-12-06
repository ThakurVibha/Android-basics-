package com.example.crypton.fragmentsbasics.callback

interface ToolbarInterface {
    fun setToolbar(fragmentTag:String)
    fun inflateFragments(fragmentTag: String, message: String)
}