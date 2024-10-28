package com.example.anaonandroid.feature.main.data

import com.example.anaonandroid.base.model.Anggota
import com.example.anaonandroid.base.model.BaseResponse
import com.example.anaonandroid.base.model.FotoDetail
import com.example.anaonandroid.base.model.MonografiItem
import com.example.anaonandroid.base.model.PerformaItem
import com.example.anaonandroid.base.model.StatusKeanggotaan
import com.example.anaonandroid.base.network.AnaService
import io.reactivex.Single
import javax.inject.Inject

interface MainRepository {
    fun fetchAnggota(): Single<BaseResponse<Anggota>>
    fun fetchSummariesMonografi(): Single<BaseResponse<MonografiItem>>
    fun fetchSummariesPerforma(): Single<BaseResponse<PerformaItem>>
    fun fetchSummariesStatusKeanggotaan(): Single<BaseResponse<StatusKeanggotaan>>
    fun fetchFotoDetail(): Single<BaseResponse<FotoDetail>>
}

class MainRepositoryImpl @Inject constructor(private val anaService: AnaService) : MainRepository {
    override fun fetchAnggota(): Single<BaseResponse<Anggota>> {
        return anaService.fetchAnggota()
    }

    override fun fetchSummariesMonografi(): Single<BaseResponse<MonografiItem>> {
        return anaService.fetchSummariesMonografi()
    }

    override fun fetchSummariesPerforma(): Single<BaseResponse<PerformaItem>> {
        return anaService.fetchSummariesPerforma()
    }

    override fun fetchSummariesStatusKeanggotaan(): Single<BaseResponse<StatusKeanggotaan>> {
        return anaService.fetchStatusKeanggotaan()
    }

    override fun fetchFotoDetail(): Single<BaseResponse<FotoDetail>> {
        return anaService.fetchFotoDetail()
    }
}