package com.example.anaonandroid.base.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class StatusKeanggotaan(
    @field:SerializedName("detailStatusList") val detailStatusList: List<DetailStatus>? = emptyList(),
    @field:SerializedName("jumlahTotal") val jumlahTotal: Int? = null
): Parcelable