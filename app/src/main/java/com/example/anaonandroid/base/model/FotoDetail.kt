package com.example.anaonandroid.base.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class FotoDetail(
    @field:SerializedName("name") val name: String? = null,
    @field:SerializedName("imgScr") val imgScr: String? = null
): Parcelable