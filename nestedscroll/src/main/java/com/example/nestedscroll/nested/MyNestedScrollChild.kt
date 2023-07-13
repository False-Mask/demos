package com.example.nestedscroll.nested

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import androidx.core.view.NestedScrollingChild3
import androidx.core.widget.NestedScrollView


/**
 *@author ZhiQiang Tu
 *@time 2023/3/19  20:57
 *@signature There are no stars in the hills.
 *@mail  2623036785@qq.com
 */

private const val TAG = "MyNestedScrollChild"

class MyNestedScrollChild @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : NestedScrollView(context, attrs), NestedScrollingChild3 {


    override fun startNestedScroll(axes: Int, type: Int): Boolean {
        Log.e(TAG, "startNestedScroll: ")
        return super.startNestedScroll(axes, type)
    }

    override fun stopNestedScroll(type: Int) {
        Log.e(TAG, "stopNestedScroll: ")
        return super.stopNestedScroll(type)
    }

    override fun hasNestedScrollingParent(type: Int): Boolean {
        Log.e(TAG, "hasNestedScrollingParent: ")
        return super.hasNestedScrollingParent(type)
    }

    override fun dispatchNestedScroll(
        dxConsumed: Int,
        dyConsumed: Int,
        dxUnconsumed: Int,
        dyUnconsumed: Int,
        offsetInWindow: IntArray?,
        type: Int,
        consumed: IntArray
    ) {
        Log.e(TAG, "dispatchNestedScroll: ")
        return super.dispatchNestedScroll(
            dxConsumed,
            dyConsumed,
            dxUnconsumed,
            dyUnconsumed,
            offsetInWindow,
            type,
            consumed
        )
    }

    override fun dispatchNestedScroll(
        dxConsumed: Int,
        dyConsumed: Int,
        dxUnconsumed: Int,
        dyUnconsumed: Int,
        offsetInWindow: IntArray?,
        type: Int
    ): Boolean {
        Log.e(TAG, "dispatchNestedScroll: ")
        return super.dispatchNestedScroll(
            dxConsumed,
            dyConsumed,
            dxUnconsumed,
            dyUnconsumed,
            offsetInWindow,
            type
        )
    }

    override fun dispatchNestedPreScroll(
        dx: Int,
        dy: Int,
        consumed: IntArray?,
        offsetInWindow: IntArray?,
        type: Int
    ): Boolean {
        Log.e(TAG, "dispatchNestedPreScroll: ")
        return super.dispatchNestedPreScroll(dx, dy, consumed, offsetInWindow, type)
    }


}