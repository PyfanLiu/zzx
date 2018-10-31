package com.hxzn.zzx.ui.presenter

import com.hxzn.zzx.model.api.HttpApi
import com.hxzn.zzx.model.api.HttpTourApi
import com.hxzn.zzx.ui.mvpview.MainMvpView
import io.reactivex.functions.Consumer
import timber.log.Timber
import top.horsttop.appcore.extention.runOnMainThread
import top.horsttop.appcore.extention.subscribeX
import javax.inject.Inject
import top.horsttop.appcore.ui.base.BasePresenter


class MainPresenter @Inject constructor(var api: HttpTourApi

                                            ) : BasePresenter<MainMvpView>() {

    fun test(){

        api.fetchTravelIndex()
                .runOnMainThread()
                .subscribeX(Consumer{ it ->
                    Timber.d(it.toString())
                    mvpView?.initIndex(it.cnt)

                },mvpView)


    }
}