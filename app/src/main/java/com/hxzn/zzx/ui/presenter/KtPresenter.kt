package com.hxzn.zzx.ui.presenter

import com.hxzn.zzx.model.api.HttpApi
import com.hxzn.zzx.ui.mvpview.KtMvpView
import top.horsttop.appcore.ui.base.BasePresenter
import javax.inject.Inject

/**
 * Created by horsttop on 2018/4/26.
 */
class KtPresenter @Inject constructor(var aip: HttpApi): BasePresenter<KtMvpView>()