package com.example.anaonandroid.feature.ceknpa.data

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CheckNpaRequest(
    @field:SerializedName("npa") val npa: String? = null,
): Parcelable
