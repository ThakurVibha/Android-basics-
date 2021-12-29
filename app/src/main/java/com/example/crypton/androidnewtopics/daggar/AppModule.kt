package com.example.crypton.androidnewtopics.daggar

import androidx.navigation.Navigator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    @Named("string1")
    fun provideTestString1()="This is a String we want to inject"

    @Singleton
    @Provides
    @Named("string2")
    fun providesTestString2()="This is a String2 We want to inject"


}