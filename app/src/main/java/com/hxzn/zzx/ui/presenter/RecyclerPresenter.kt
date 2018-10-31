package com.hxzn.zzx.ui.presenter

import com.hxzn.zzx.model.api.HttpApi
import com.hxzn.zzx.ui.mvpview.RecyclerMvpView
import javax.inject.Inject
import top.horsttop.appcore.ui.base.BasePresenter

/**
 * Created by horsttop on 2018/5/23.
 */
class RecyclerPresenter @Inject constructor(var api: HttpApi) : BasePresenter<RecyclerMvpView>() {
}