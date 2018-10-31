package com.hxzn.zzx.ui.view

import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.hxzn.zzx.R
import com.hxzn.zzx.core.App
import com.hxzn.zzx.di.component.DaggerViewComponent
import com.hxzn.zzx.ui.adapter.RecyclerAdapter
import com.hxzn.zzx.ui.mvpview.RecyclerMvpView
import com.hxzn.zzx.ui.presenter.RecyclerPresenter
import kotlinx.android.synthetic.main.activity_recycler.*
import top.horsttop.appcore.model.constant.GlobalVal
import top.horsttop.appcore.ui.base.BaseActivity
import top.horsttop.appcore.ui.recyclerview.ProgressStyle
import top.horsttop.appcore.ui.recyclerview.XRecyclerView
import javax.inject.Inject

class RecyclerActivity: BaseActivity(), RecyclerMvpView, XRecyclerView.LoadingListener {
    override fun onRefresh() {
        mPage = 0
        recycler.postDelayed({
            recycler.refreshComplete()
        },1000)
    }

    override fun onLoadMore() {
        mPage++
        recycler.postDelayed({
            setUpData()
            mAdapter.notifyDataSetChanged()
            recycler.loadMoreComplete()
        },1000)
    }

    @Inject
    lateinit var mPresenter: RecyclerPresenter

    override val contentViewId: Int = R.layout.activity_recycler

    lateinit var mAdapter: RecyclerAdapter

    private val  strList = arrayListOf<String>()

    private var mPage = 0


    override fun initViews() {
        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener { onBackPressed() }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setUpData()
        mAdapter = RecyclerAdapter(strList)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.setRefreshProgressStyle(ProgressStyle.BallSpinFadeLoader)
        recycler.setLoadingMoreProgressStyle(ProgressStyle.BallRotate)
        recycler.adapter = mAdapter
        recycler.setLoadingListener(this)
    }

    override fun onClick(v: View?) {

    }


    private fun setUpData(){

        for (i in mPage*GlobalVal.PAGE_LIMIT..(mPage+1)* GlobalVal.PAGE_LIMIT){
            strList.add("这是第${i}个元素")
        }
    }

    override fun onActivityInject() {
        DaggerViewComponent.builder()
                .appComponent(App.appComponent)
                .build()
                .inject(this)
        mPresenter.attachView(this)
    }


}
