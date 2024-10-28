package com.example.anaonandroid.feature.splash.ui

import android.content.SharedPreferences
import com.example.anaonandroid.base.BaseViewModel
import com.example.anaonandroid.base.util.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val sharedPreferences: SharedPreferences
) : BaseViewModel<SplashViewModel.SplashViewState>() {

    fun checkAuth() {
        _state.value = SplashViewState.ShowSplash
        val accessToken = sharedPreferences.getString(Constants.ACCESS_TOKEN, "")
        if (accessToken.isNullOrEmpty()) {
            _state.value = SplashViewState.LoadLoginPage
        } else {
            _state.value = SplashViewState.LoadMainPage
        }
        _state.value = SplashViewState.HideSplash
    }

    sealed class SplashViewState {
        object ShowSplash : SplashViewState()
        object HideSplash : SplashViewState()
        object LoadLoginPage : SplashViewState()
        object LoadMainPage : SplashViewState()
    }
}