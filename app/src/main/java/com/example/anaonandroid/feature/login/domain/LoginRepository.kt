package com.example.anaonandroid.feature.login.domain

import com.example.anaonandroid.base.network.AnaService
import com.example.anaonandroid.feature.login.data.LoginResponse
import io.reactivex.Single
import javax.inject.Inject

interface LoginRepository {
    fun postLogin(npa: String, password: String): Single<LoginResponse>
}

class LoginRepositoryImpl @Inject constructor(private val service: AnaService) : LoginRepository {
    override fun postLogin(npa: String, password: String): Single<LoginResponse> {
        return service.login(npa, password, grantType = "password")
    }
}