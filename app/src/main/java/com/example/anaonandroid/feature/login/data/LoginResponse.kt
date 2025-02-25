package com.example.anaonandroid.feature.login.data

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LoginResponse(
    @field:SerializedName("access_token") val accessToken: String? = null,
    @field:SerializedName("token_type") val tokenType: String? = null,
    @field:SerializedName("refresh_token") val refreshToken: String? = null,
    @field:SerializedName("expires_in") val expiresIn: Int? = null
): Parcelable