package com.example.crypton.hilt.api

import com.example.snowflakestest.data.CountryResponse
import retrofit2.Call
import javax.inject.Inject

class CountryServiceImpl @Inject constructor(private val countryService: CountryService){

   suspend fun getCountryData(): Call<CountryResponse> = countryService.getCountryData()
}