package com.example.crypton.hilt.simpledemo

import android.util.Log
import javax.inject.Inject

class CoffeePowder @Inject constructor()
{
    fun getCoffeePowder(){
        Log.e("TAG", "two spoons of coffee powder: ", )
    }

}