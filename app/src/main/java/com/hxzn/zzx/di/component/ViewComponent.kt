package com.hxzn.zzx.di.component


import com.hxzn.zzx.ui.view.MainActivity
import com.hxzn.zzx.ui.view.RecyclerActivity
import dagger.Component
import top.horsttop.appcore.dagger.runtime.PerView

@PerView
@Component(dependencies = arrayOf(AppComponent::class))
interface ViewComponent {

    fun inject(testActivity: RecyclerActivity)
//    fun inject(testActivity: KtActivity)
    fun inject(testActivity: MainActivity)

}