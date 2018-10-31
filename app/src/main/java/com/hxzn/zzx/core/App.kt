package com.hxzn.zzx.core

import com.hxzn.zzx.di.component.AppComponent
import com.hxzn.zzx.di.component.DaggerAppComponent
import timber.log.Timber
import top.horsttop.appcore.core.GenApp
import top.horsttop.appcore.network.RetrofitInterceptor

/**
 * Created by horsttop on 2018/4/13.
 */
class App : GenApp(){


    override fun onCreate() {
        super.onCreate()

        Timber.d("to inject")
        appComponent = DaggerAppComponent.builder()
                .coreComponent(coreComponent)
                .build()
        appComponent.inject(this)

        val token = GenApp.preferencesHelper.getStringConfig(Constant.TOKEN)
        if (!token.isEmpty())
            RetrofitInterceptor.token = token

    }

    companion object {

        @JvmStatic lateinit var appComponent: AppComponent
    }

}