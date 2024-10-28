package com.example.anaonandroid.feature.detail.data.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class DetailAnggotaResponse(
    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("npa")
    val npa: String? = null,

    @field:SerializedName("nama")
    val nama: String? = null,

    @field:SerializedName("tempat")
    val tempat: String? = null,

    @field:SerializedName("tanggalLahir")
    val tanggalLahir: String? = null,

    @field:SerializedName("statusMerital")
    val statusMerital: String? = null,

    @field:SerializedName("pekerjaan")
    val pekerjaan: String? = null,

    @field:SerializedName("pw")
    val pimpinanWilayah: PimpinanWilayah? = null,

    @field:SerializedName("pd")
    val pimpinanDaerah: PimpinanDaerah? = null,

    @field:SerializedName("pc")
    val pimpinanCabang: PimpinanCabang? = null,

    @field:SerializedName("pj")
    val pj: String? = null,

    @field:SerializedName("namaPj")
    val namaPj: String? = null,

    @field:SerializedName("desa")
    val desa: Desa? = null,

    @field:SerializedName("provinsi")
    val provinsi: Provinsi? = null,

    @field:SerializedName("kabupaten")
    val kabupaten: Kabupaten? = null,

    @field:SerializedName("kecamatan")
    val kecamatan: Kecamatan? = null,

    @field:SerializedName("golDarah")
    val golDarah: String? = null,

    @field:SerializedName("email")
    val email: String? = null,

    @field:SerializedName("noTelpon")
    val noTelpon: String? = null,

    @field:SerializedName("alamat")
    val alamat: String? = null,

    @field:SerializedName("jenisKeanggotaan")
    val jenisKeanggotaan: String? = null,

    @field:SerializedName("statusAktif")
    val statusAktif: String? = null,

    @field:SerializedName("foto")
    val foto: String? = null,

    @field:SerializedName("idOtonom")
    val idOtonom: Int? = null,

    @field:SerializedName("jenjangPendidikan")
    val jenjangPendidikan: JenjangPendidikan? = null,

    @field:SerializedName("masaAktifKta")
    val masaAktifKta: String? = null,

    @field:SerializedName("regDate")
    val regDate: String? = null,

    @field:SerializedName("levelTafiq")
    val levelTafiq: String? = null,

    @field:SerializedName("detailPendidikan")
    val detailPendidikan: List<DetailPendidikan>? = null,

    @field:SerializedName("detailKeluarga")
    val detailKeluarga: List<DetailKeluarga>? = null,

    @field:SerializedName("lastUpdated")
    val lastUpdated: String? = null,

    @field:SerializedName("createdBy")
    val createdBy: String? = null,

    @field:SerializedName("createdDate")
    val createdDate: String? = null
) : Parcelable