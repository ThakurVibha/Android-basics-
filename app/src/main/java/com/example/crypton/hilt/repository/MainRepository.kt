package com.example.crypton.hilt.repository

import android.app.Application
import com.example.crypton.hilt.api.CountryServiceImpl
import javax.inject.Inject

class MainRepository @Inject constructor(private val countryServiceImpl: CountryServiceImpl){
}