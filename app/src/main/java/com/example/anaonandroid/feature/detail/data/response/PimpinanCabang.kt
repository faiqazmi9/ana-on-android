package com.example.anaonandroid.feature.detail.data.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class PimpinanCabang(

    @field:SerializedName("kdPc")
    val kodePc: String? = null,

    @field:SerializedName("namaPc")
    val namaPimpinanCabang: String? = null,

    @field:SerializedName("diresmikan")
    val diresmikan: String? = null
) : Parcelable