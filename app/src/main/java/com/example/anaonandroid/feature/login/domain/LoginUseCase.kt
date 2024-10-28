package com.example.anaonandroid.feature.login.domain

import com.example.anaonandroid.feature.login.data.LoginResponse
import io.reactivex.Single
import javax.inject.Inject

interface LoginUseCase {
    fun postLogin(npa: String, password: String): Single<LoginResponse>
}

class LoginUseCaseImpl @Inject constructor(private val repository: LoginRepository): LoginUseCase {
    override fun postLogin(npa: String, password: String): Single<LoginResponse> {
        return repository.postLogin(npa, password)
    }
}