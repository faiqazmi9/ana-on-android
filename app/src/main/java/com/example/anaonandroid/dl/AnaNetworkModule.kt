package com.example.anaonandroid.dl

import android.content.SharedPreferences
import com.example.anaonandroid.base.network.AnaService
import com.example.anaonandroid.base.util.Constants
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException
import java.util.concurrent.TimeUnit
import javax.inject.Singleton
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory

@Module
@InstallIn(SingletonComponent::class)
class AnaNetworkModule {

    @Provides
    @Singleton
    fun provideHttpClient(sharedPreferences: SharedPreferences): OkHttpClient = okHttpClientFactory(sharedPreferences)

    private fun retrofitFactory(okHttpClient: OkHttpClient, baseUrl: String): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .client(okHttpClient)
            .baseUrl(baseUrl)
            .build()
    }

    private fun okHttpClientFactory(sharedPreferences: SharedPreferences): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(defaultHTTPClient(sharedPreferences))
            .addInterceptor(serviceHTTPClient())
            .addInterceptor(httpLoggingInterceptor())
            .readTimeout(25, TimeUnit.SECONDS)
            .connectTimeout(25, TimeUnit.SECONDS)
            .build()
    }

    @Throws(IOException::class)
    private fun defaultHTTPClient(sharedPreferences: SharedPreferences): Interceptor {
        return Interceptor { chain ->
            val basicAuth = Credentials.basic(BuildConfig.BASIC_USERNAME, BuildConfig.BASIC_PASSWORD)
            val accessToken = sharedPreferences.getString(Constants.ACCESS_TOKEN, "")
            val request = if (accessToken.isNullOrEmpty()) {
                chain.request()
                    .newBuilder()
                    .addHeader("Authorization", basicAuth)
                    .build()
            } else {
                chain.request()
                    .newBuilder()
                    .addHeader("Authorization", "Bearer $accessToken")
                    .build()
            }
            return@Interceptor chain.proceed(request)
        }
    }

    @Throws(IOException::class)
    private fun serviceHTTPClient(): Interceptor {
        return Interceptor { chain ->
            val original = chain.request()
            val requestUrl = original
                .url
                .newBuilder()
                .build()

            val requestBuilder = original.newBuilder().url(requestUrl)
                .build()
            return@Interceptor chain.proceed(requestBuilder)
        }
    }

    private fun httpLoggingInterceptor(): HttpLoggingInterceptor {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        return logging
    }

    @Provides
    @Singleton
    fun provideGson(): Gson = GsonBuilder().create()

    @Provides
    @Singleton
    fun providesRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return retrofitFactory(okHttpClient, BuildConfig.HOST_BASE_URL)
    }

    @Provides
    @Singleton
    fun provideAnaService(retrofit: Retrofit): AnaService {
        return retrofit.create(AnaService::class.java)
    }
}