package com.example.anaonandroid.feature.login.ui

import android.content.SharedPreferences
import com.example.anaonandroid.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val useCase: LoginUseCase,
    private val sharedPreferences: SharedPreferences
) : BaseViewModel<LoginViewModel.LoginState>() {

    fun postLogin(npa: String, password: String) {
        addDisposable.add(
            useCase.postLogin(npa, password)
                .doOnSubscribe { _state.postValue(LoginState.SHowLoading) }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    if (it.accessToken?.isNotEmpty() == true) {
                        with(sharedPreferences.edit()) {
                            putString(Constants.ACCESS_TOKEN, it.accessToken.orEmpty())
                            apply()
                        }
                        _state.postValue(LoginState.LoginSuccess)
                    }
                }, {
                    //error
                    with(sharedPreferences.edit()) {
                        remove(Constants.ACCESS_TOKEN)
                        apply()
                    }
                    _state.postValue(LoginState.LoginFailed(it))
                })
        )
    }

    sealed class LoginState {
        object SHowLoading : LoginState()
        object HideLoading : LoginState()
        object LoginSuccess : LoginState()

        data class LoginFailed(val error: Throwable) : LoginState()
    }
}