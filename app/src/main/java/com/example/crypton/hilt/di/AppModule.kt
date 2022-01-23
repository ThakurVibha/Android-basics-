package com.example.crypton.hilt.di

import com.example.crypton.hilt.api.CountryService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun providesURl()="https://restcountries.com/v2/"

    @Provides
    fun providesAPIService(url:String) : CountryService = Retrofit.Builder().baseUrl(url).addConverterFactory(
        GsonConverterFactory.create()).build().create(CountryService::class.java)

}