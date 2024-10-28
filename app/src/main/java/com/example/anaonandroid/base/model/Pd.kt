package com.example.anaonandroid.base.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Pd(
    @field:SerializedName("kdPd") val kdPd: String? = null,
    @field:SerializedName("namaPd") val namaPd: String? = null,
    @field:SerializedName("diresmikan") val diresmikan: String? = null

): Parcelable