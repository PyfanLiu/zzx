package com.hxzn.zzx.ui.view

import android.util.Log
import android.view.View
import com.hxzn.zzx.R
import com.hxzn.zzx.core.App
import com.hxzn.zzx.di.component.DaggerViewComponent
import com.hxzn.zzx.pojo.TourIndex
import com.hxzn.zzx.ui.mvpview.MainMvpView
import com.hxzn.zzx.ui.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*
import top.horsttop.appcore.extention.startActivity
import top.horsttop.appcore.ui.base.BaseActivity
import top.horsttop.appcore.util.net.NetworkStateReceiver
import javax.inject.Inject

class MainActivity : BaseActivity(), MainMvpView {
    override fun initIndex(index: TourIndex?) {
        Log.e("-------------", index?.guides!![0]?.avatar)
    }

    @Inject
    lateinit var mPresenter: MainPresenter

    override val contentViewId: Int = R.layout.activity_main

    override fun initViews() {
        btn_1.setOnClickListener(this)
        mPresenter.test()
    }

    override fun onActivityInject() {
        DaggerViewComponent.builder()
                .appComponent(App.appComponent)
                .build()
                .inject(this)
        mPresenter.attachView(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_1 ->{
                startActivity(btn_1,RecyclerActivity::class.java)
            }
        }
    }



    override fun onStart() {
        super.onStart()
        NetworkStateReceiver.registerNetworkStateReceiver(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        NetworkStateReceiver.unRegisterNetworkStateReceiver(this)
    }
}
