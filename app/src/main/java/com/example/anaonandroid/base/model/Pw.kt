package com.example.anaonandroid.base.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Pw(
    @field:SerializedName("kdPw") val kdPw: String? = null,
    @field:SerializedName("namaWilayah") val namaWilayah: String? = null,
    @field:SerializedName("diresmikan") val diresmikan: String? = null,
): Parcelable