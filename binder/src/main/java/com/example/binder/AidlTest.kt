package com.example.binder

import android.util.Log


/**
 *@author ZhiQiang Tu
 *@time 2023/4/11  23:47
 *@signature There are no stars in the hills.
 *@mail  2623036785@qq.com
 */

private const val TAG = "basicTypes"

class AidlTest : IMyAidlInterface.Stub() {
    override fun basicTypes(
        anInt: Int, aLong: Long, aBoolean: Boolean, aFloat: Float, aDouble: Double, aString: String?
    ) {
        Log.e(TAG, "${anInt}:${aLong}:${aBoolean}:${aFloat}:${aDouble}:${aString}")
    }
}