package com.example.crypton.hilt.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

var BASE_URL = " https://restcountries.com/v2/"

object RetrofitInstance {

        var countryService: CountryService

        init {
            val retrofit =
                Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(
                    GsonConverterFactory.create())
                    .build()
            //interface for implementation
            countryService = retrofit.create(CountryService::class.java)
        }


}