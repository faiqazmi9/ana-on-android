package com.example.anaonandroid.base.network

import com.example.anaonandroid.base.model.Anggota
import com.example.anaonandroid.base.model.BaseResponse
import com.example.anaonandroid.base.model.FotoDetail
import com.example.anaonandroid.base.model.MonografiItem
import com.example.anaonandroid.base.model.PerformaItem
import com.example.anaonandroid.base.model.StatusKeanggotaan
import com.example.anaonandroid.feature.ceknpa.data.CheckNpaRequest
import com.example.anaonandroid.feature.ceknpa.data.CheckNpaResponse
import com.example.anaonandroid.feature.ceknpa.data.SendEmailRequest
import com.example.anaonandroid.feature.detail.data.response.DetailAnggotaResponse
import com.example.anaonandroid.feature.login.data.LoginResponse
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface AnaService {
    @FormUrlEncoded
    @POST("/oauth/login")
    fun login(@Field("username") npa: String,
              @Field("password") password: String,
              @Field("grant_type") grantType: String): Single<LoginResponse>

    @POST("/v1/api/anggota/check")
    fun checkNpa(@Body npa: CheckNpaRequest): Single<BaseResponse<CheckNpaResponse>>

    @POST("/v1/api/anggota/sendEmail")
    fun sendEmail(@Body npa: SendEmailRequest): Single<BaseResponse<String>>

    @GET("api/anggota/profile")
    fun fetchAnggota(): Single<BaseResponse<Anggota>>

    @GET("api/summaries/monografi")
    fun fetchSummariesMonografi(): Single<BaseResponse<MonografiItem>>

    @GET("api/summaries/performa")
    fun fetchSummariesPerforma(): Single<BaseResponse<PerformaItem>>

    @GET("api/summaries/status-keanggotaan")
    fun fetchStatusKeanggotaan(): Single<BaseResponse<StatusKeanggotaan>>

    @GET("api/anggota/profile/foto/detail")
    fun fetchFotoDetail(): Single<BaseResponse<FotoDetail>>

    @GET("api/anggota/profile")
    fun fetchDetailAnggota(): Single<BaseResponse<DetailAnggotaResponse>>
}