package com.example.crypton.kotlinbasics.retrofitbasics

import android.os.Build
import android.util.Log
import com.example.crypton.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

var BASE_URL = "https://api.github.com/"
var BASE_URL_GITHUB = ""

interface TaskService {

    @GET("users/{user}/repos")
    fun getRepos(@Path("user") user: String): Call<List<GithubRepoModel>>

    @POST("posts")
    fun createAccount(@Body user: User): Call<User>

}

object RetrofitInstance {

    var service: TaskService

    init {
        //create okhttp client
        val okHttpClient = OkHttpClient.Builder()
        //create interceptor
        var httpLoggingInterceptor = HttpLoggingInterceptor()
        if (BuildConfig.DEBUG) {
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
            //add to okhttpClient
            okHttpClient.addInterceptor(httpLoggingInterceptor)
        }


        var builder =
            Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create()).client(okHttpClient.build())
                .build()

        service = builder.create(TaskService::class.java)


    }
}