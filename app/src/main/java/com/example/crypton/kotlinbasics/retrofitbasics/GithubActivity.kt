package com.example.crypton.kotlinbasics.retrofitbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.crypton.R
import kotlinx.android.synthetic.main.activity_github.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.await

/**
 * ..simple  GET request and sending dynamic parameter
 */
class GithubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_github)
        fetchRepos()
    }

    private fun fetchRepos() {
        CoroutineScope(Dispatchers.IO).launch {
            val response = RetrofitInstance.service.getRepos("ThakurVibha").await()

            CoroutineScope(Dispatchers.Main).launch {
                var repos: ArrayList<GithubRepoModel> = response as ArrayList<GithubRepoModel>
                rvList.adapter = GithubRepoAdapter(this@GithubActivity, repos)
                rvList.layoutManager = LinearLayoutManager(this@GithubActivity)

            }

        }

    }
}