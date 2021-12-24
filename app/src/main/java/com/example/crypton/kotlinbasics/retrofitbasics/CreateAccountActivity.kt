package com.example.crypton.kotlinbasics.retrofitbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.crypton.R
import kotlinx.android.synthetic.main.activity_create_account.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.Dispatcher
import retrofit2.await


/*
sending object in post request retrofit
 */
class CreateAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)
        onClick()
    }

    private fun sendNetworkRequest(user: User) {
        CoroutineScope(Dispatchers.IO).launch {
            var retrofit = RetrofitInstance.service.createAccount(user).await()
            CoroutineScope(Dispatchers.Main).launch {

                tvData.text=retrofit.text +retrofit.title +retrofit.userID

            }


        }
    }

    private fun onClick() {
        btnSubmit.setOnClickListener {
            var user = User(5, "New Addition", "Add it please, do it no"
            )
            sendNetworkRequest(user)

        }
    }
}