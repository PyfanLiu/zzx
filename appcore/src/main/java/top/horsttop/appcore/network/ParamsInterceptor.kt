package top.horsttop.appcore.network

import android.content.Context
import android.util.Base64
import okhttp3.*


import java.io.IOException

import top.horsttop.appcore.BuildConfig
import top.horsttop.appcore.core.GenApp
import top.horsttop.appcore.model.constant.GlobalVal
import top.horsttop.appcore.util.net.NetWorkUtil
import top.horsttop.core.exception.ExceptionCode
import top.horsttop.core.exception.QuitException
import java.lang.RuntimeException

/**
 * Created by horsttop on 2018/4/13.
 * Interceptor for Retrofit to add auth key to header
 */

class ParamsInterceptor(var context:Context) : Interceptor {

//@Query("region") region: Int = GenApp.region, @Query("lang")lang:String=GenApp.lang, @Query("version")version:String=GenApp.version)

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response ?{


        if(!NetWorkUtil.isNetworkConnected(context)){
            throw NetworkErrorException()
        }
        var request = chain.request()

        val newUrl = request.url().newBuilder()
//                .addQueryParameter("region","${GenApp.region}")
//                .addQueryParameter("lang",GenApp.lang)
//                .addQueryParameter("version",GenApp.version)
                .build()



            request = request.newBuilder().url(newUrl).build()

        val response = chain.proceed(request)



        when(response.code()){
            401 ->{
                throw QuitException(ExceptionCode.ACCESS_EXCEPTION.message,ExceptionCode.ACCESS_EXCEPTION.code)
            }
            500 ->{
                throw QuitException(ExceptionCode.SERVER_EXCEPTION.message,ExceptionCode.SERVER_EXCEPTION.code)
            }
        }

        return response
    }


//    Authorization


    class NetworkErrorException() : RuntimeException()
}
