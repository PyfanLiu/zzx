package com.hxzn.zzx.model.api


import com.hxzn.zzx.pojo.BaseResult
import com.hxzn.zzx.pojo.TourIndex
import io.reactivex.Flowable
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.*

interface HttpTourNewApi {


    @GET("app/index/")
    fun fetchTravelIndex(): Flowable<BaseResult<TourIndex>>

//    @GET("comment")

    //es_id=1& res_name=guide& content=很好玩，真的好玩&parent_id=0



}