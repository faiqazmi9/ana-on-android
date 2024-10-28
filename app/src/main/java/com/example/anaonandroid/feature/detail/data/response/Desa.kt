package com.example.anaonandroid.feature.detail.data.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Desa(
    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("nama")
    val nama: String? = null
) : Parcelable