package com.hxzn.zzx.ui.mvpview

import com.hxzn.zzx.pojo.TourIndex
import top.horsttop.appcore.ui.base.MvpView

interface MainMvpView : MvpView{

    fun initIndex(index: TourIndex?)
}