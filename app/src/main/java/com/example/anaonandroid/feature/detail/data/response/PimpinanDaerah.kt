package com.example.anaonandroid.feature.detail.data.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class PimpinanDaerah(

    @field:SerializedName("kdPw")
    val kodePd: String? = null,

    @field:SerializedName("namaPd")
    val namaPimpipnanDaerah: String? = null,

    @field:SerializedName("diresmikan")
    val diresmikan: String? = null
) : Parcelable