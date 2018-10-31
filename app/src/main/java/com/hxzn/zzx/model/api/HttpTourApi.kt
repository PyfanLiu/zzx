package com.hxzn.zzx.model.api


import com.hxzn.zzx.pojo.BaseResult
import com.hxzn.zzx.pojo.TourIndex
import io.reactivex.Flowable
import retrofit2.http.*

interface HttpTourApi {


    @GET("app/index")
    fun fetchTravelIndex(): Flowable<BaseResult<TourIndex>>




}