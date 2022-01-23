package com.example.crypton.hilt.simpledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.crypton.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class Developer : AppCompatActivity() {
    @Inject
    lateinit var coffee: Coffee

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_developer)
        coffee.brewCoffee()
    }
}