package com.example.anaonandroid.feature.ceknpa.data

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CheckNpaResponse(
    @field:SerializedName("npa") val npa: String? = null,
    @field:SerializedName("nama") val nama: String? = null,
    @field:SerializedName("email") val email: String? = null,
): Parcelable