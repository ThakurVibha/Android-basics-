package com.example.crypton.hilt.simpledemo

import android.util.Log
import javax.inject.Inject

class Coffee @Inject constructor( private val coffeePowder: CoffeePowder, private val warmWater: WarmWater){


    fun brewCoffee(){
        coffeePowder.getCoffeePowder()
        warmWater.pourWarmWater()
        Log.e("coffee", "Coffee is ready" )
    }



}