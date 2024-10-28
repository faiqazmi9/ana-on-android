package com.example.anaonandroid.feature.detail.data.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class DetailKeluarga(
    @field:SerializedName("idKeluarga")
    val idKeluarga: Int? = null,

    @field:SerializedName("namaKeluarga")
    val namaKeluarga: String? = null,

    @field:SerializedName("hubungan")
    val hubungan: String? = null,

    @field:SerializedName("jumlahAnak")
    val jumlahAnak: String? = null,

    @field:SerializedName("alamat")
    val alamat: String? = null,

    @field:SerializedName("otonom")
    val otonom: String? = null,

    @field:SerializedName("keterangan")
    val keterangan: String? = null,

    @field:SerializedName("statusAnggota")
    val statusAnggota: String? = null
) : Parcelable
