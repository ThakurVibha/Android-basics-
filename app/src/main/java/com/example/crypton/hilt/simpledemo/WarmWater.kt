package com.example.crypton.hilt.simpledemo

import android.util.Log
import javax.inject.Inject

class WarmWater @Inject constructor()
{
    fun pourWarmWater(){
        Log.e("di", "pour some warm water: ", )
    }
}