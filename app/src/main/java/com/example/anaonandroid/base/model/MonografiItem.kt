package com.example.anaonandroid.base.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class MonografiItem(
    @field:SerializedName("monografiPJ") val monografiPj: Int? = null,
    @field:SerializedName("monografiPd") val monografiPd: Int? = null,
    @field:SerializedName("monografiPw") val monografiPw: Int? = null,
    @field:SerializedName("monografiPc") val monografiPc: Int? = null
): Parcelable