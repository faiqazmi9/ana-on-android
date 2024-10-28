package com.example.anaonandroid.feature.detail.data.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class DetailPendidikan(
    @field:SerializedName("idPendidikan")
    val idPendidikan: Int? = null,

    @field:SerializedName("jenjangPendidikan")
    val jenjangPendidikan: JenjangPendidikan? = null,

    @field:SerializedName("instansi")
    val instansi: String? = null,

    @field:SerializedName("jurusan")
    val jurusan: String? = null,

    @field:SerializedName("tahunMasuk")
    val tahunMasuk: Int? = null,

    @field:SerializedName("tahunKeluar")
    val tahunKeluar: Int? = null,

    @field:SerializedName("jenisPendidikan")
    val jenisPendidikan: String? = null
) : Parcelable