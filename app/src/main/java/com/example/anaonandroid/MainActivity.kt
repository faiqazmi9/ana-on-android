package com.example.anaonandroid

import androidx.multidex.MultiDexApplication
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class MainActivity : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            // https://ayusch.com/timber-for-android/
            Timber.plant(object : Timber.DebugTree() {
                override fun createStackElementTag(element: StackTraceElement): String {
                    return String.format(
                        "#Class:%s, #Method:%s, #Line:%s ->",
                        super.createStackElementTag(element),
                        element.methodName,
                        element.lineNumber
                    )
                }
            })
        }
    }
}