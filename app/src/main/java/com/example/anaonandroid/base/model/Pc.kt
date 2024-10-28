package com.example.anaonandroid.base.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Pc(
    @field:SerializedName("kdPc") val kdPc: String? = null,
    @field:SerializedName("namaPc") val namaPc: String? = null,
    @field:SerializedName("diresmikan") val diresmikan: String? = null
): Parcelable