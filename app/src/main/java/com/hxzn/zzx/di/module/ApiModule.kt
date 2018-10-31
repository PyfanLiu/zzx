package com.hxzn.zzx.di.module

import com.hxzn.zzx.model.api.HttpApi
import com.hxzn.zzx.model.api.HttpTourApi
import com.hxzn.zzx.model.api.HttpTourNewApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import timber.log.Timber
import top.horsttop.appcore.network.RetrofitWrapper
import javax.inject.Singleton

/**
 * Created by horsttop on 2018/4/19.
 */
@Singleton
@Module
class ApiModule {

    @Provides
    fun ofRetrofit(retrofit: RetrofitWrapper): HttpApi {
        Timber.i("to HttpApi")
       return retrofit.retrofit1.create(HttpApi::class.java)
    }

    @Provides
    fun ofTourRetrofit(retrofit: RetrofitWrapper): HttpTourApi {
        Timber.i("to HttpApi")
        return retrofit.retrofitNew.create(HttpTourApi::class.java)
    }

    @Provides
    fun ofTourNewRetrofit(retrofit: RetrofitWrapper): HttpTourNewApi {
        return retrofit.retrofitNew.create(HttpTourNewApi::class.java)
    }

}