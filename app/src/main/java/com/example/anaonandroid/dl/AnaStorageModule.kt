package com.example.anaonandroid.dl

import android.content.Context
import android.content.SharedPreferences
import com.example.anaonandroid.base.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AnaStorageModule {

    @Provides
    @Singleton
    fun provideSharedPreferences(
        @ApplicationContext context: Context
    ): SharedPreferences = context.getSharedPreferences(Constants.SHARED_NAME, Context.MODE_PRIVATE)
}