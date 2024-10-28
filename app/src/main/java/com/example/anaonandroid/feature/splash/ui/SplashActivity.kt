package com.example.anaonandroid.feature.splash.ui

import android.view.LayoutInflater
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.FragmentActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity : BaseActivity<ActivitySplashBinding>() {

    private val viewModel by viewModels<SplashViewModel>()

    override val bindingInflater: (LayoutInflater) -> ActivitySplashBinding
        get() = ActivitySplashBinding::inflate

    override fun setupView(binding: ActivitySplashBinding) {
        setupObserver()
    }

    override fun setData() {
        return viewModel.checkAuth()
    }

    override fun setObserver(): FragmentActivity = this

    private fun setupObserver() {
        viewModel.state.observe(this) { state ->
            when (state) {
                is SplashViewModel.SplashViewState.ShowSplash -> Timber.d("showing splash")
                is SplashViewModel.SplashViewState.HideSplash -> Timber.d("hide splash")
                is SplashViewModel.SplashViewState.LoadLoginPage -> {
                    Timber.d("load login page")
                    startActivity(Intent(this, LoginActivity::class.java))
                    finish()

                }
                is SplashViewModel.SplashViewState.LoadMainPage -> {
                    Timber.d("load main page")
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                }
            }
        }
    }
}