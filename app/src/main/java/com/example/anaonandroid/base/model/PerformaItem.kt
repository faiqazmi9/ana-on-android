package com.example.anaonandroid.base.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class PerformaItem(
    @field:SerializedName("performaPj") val performaPj: Int? = null,
    @field:SerializedName("performaPd") val performaPd: Int? = null,
    @field:SerializedName("performaPw") val performaPw: Int? = null,
    @field:SerializedName("performaPc") val performaPc: Int? = null,
    @field:SerializedName("jmlAnggota") val jmlAnggota: Int? = null,
    @field:SerializedName("jmlUser") val jmlUser: Int? = null
): Parcelable