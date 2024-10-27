package com.example.anaonandroid.feature.login.di

import com.example.anaonandroid.feature.login.domain.LoginRepository
import com.example.anaonandroid.feature.login.domain.LoginRepositoryImpl
import com.example.anaonandroid.feature.main.data.MainRepository
import com.example.anaonandroid.feature.main.data.MainRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindsLoginRepository(
        loginRepositoryImpl: LoginRepositoryImpl
    ): LoginRepository

    @Binds
    @Singleton
    abstract fun bindsMainRepository(mainRepositoryImpl: MainRepositoryImpl): MainRepository
}