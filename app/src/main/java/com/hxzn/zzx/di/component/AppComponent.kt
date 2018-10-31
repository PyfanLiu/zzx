package com.hxzn.zzx.di.component

import com.hxzn.zzx.core.App
import com.hxzn.zzx.di.module.ApiModule
import com.hxzn.zzx.model.api.HttpApi
import com.hxzn.zzx.model.api.HttpTourApi
import com.hxzn.zzx.model.api.HttpTourNewApi
import dagger.Component
import top.horsttop.appcore.dagger.component.CoreComponent
import top.horsttop.appcore.dagger.runtime.PerApplication
import javax.inject.Singleton


@PerApplication
@Component(dependencies = arrayOf(CoreComponent::class),modules = arrayOf(ApiModule::class))
interface AppComponent {

    fun httpApi(): HttpApi

    fun httpTourApi(): HttpTourApi

    fun httpNewTourApi(): HttpTourNewApi


    fun inject(app: App)


}