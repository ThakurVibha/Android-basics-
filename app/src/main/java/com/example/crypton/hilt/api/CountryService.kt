package com.example.crypton.hilt.api

import com.example.snowflakestest.data.CountryResponse
import retrofit2.Call
import retrofit2.http.GET

interface CountryService {

    @GET("all")
    suspend fun getCountryData(): Call<CountryResponse>
}