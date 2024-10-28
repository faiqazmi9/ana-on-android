package com.example.anaonandroid.base.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class DetailStatus(
    @field:SerializedName("status") val status: String? = null,
    @field:SerializedName("jumlah") val jumlah: Int? = null
): Parcelable