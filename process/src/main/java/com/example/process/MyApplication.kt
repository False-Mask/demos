package com.example.process

import android.app.Application


/**
 *@author ZhiQiang Tu
 *@time 2023/3/1  19:36
 *@signature There are no stars in the hills.
 *@mail  2623036785@qq.com
 */

class MyApplication : Application() {

    companion object {
        @JvmStatic
        lateinit var application:Application
    }

    override fun onCreate() {
        super.onCreate()
        application = this
    }
}