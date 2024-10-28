package com.example.anaonandroid.feature.detail.data.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class PimpinanWilayah(

    @field:SerializedName("kdPw")
    var kodePw: String? = null,

    @field:SerializedName("namaWilayah")
    var namaWilayah: String? = null,

    @field:SerializedName("diresmikan")
    var diresmikan: String? = null
) : Parcelable