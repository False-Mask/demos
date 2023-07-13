package com.example.nestedscroll.nested

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.core.view.NestedScrollingParent3
import androidx.core.widget.NestedScrollView


/**
 *@author ZhiQiang Tu
 *@time 2023/3/19  20:55
 *@signature There are no stars in the hills.
 *@mail  2623036785@qq.com
 */

private const val TAG ="MyNestedScroller"

class MyNestedScroller @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : NestedScrollView(context, attrs), NestedScrollingParent3 {
    override fun onStartNestedScroll(child: View, target: View, axes: Int, type: Int): Boolean {
        Log.e(TAG, "onStartNestedScroll: ")
        return super.onStartNestedScroll(child, target, axes, type)
    }

    override fun onNestedScrollAccepted(child: View, target: View, axes: Int, type: Int) {
        Log.e(TAG, "onNestedScrollAccepted: ")
        return super.onNestedScrollAccepted(child, target, axes, type)
    }

    override fun onStopNestedScroll(target: View, type: Int) {
        Log.e(TAG, "onStopNestedScroll: ")
        return super.onStopNestedScroll(target, type)
    }

    override fun onNestedScroll(
        target: View,
        dxConsumed: Int,
        dyConsumed: Int,
        dxUnconsumed: Int,
        dyUnconsumed: Int,
        type: Int,
        consumed: IntArray
    ) {

        Log.e(TAG, "onNestedScroll: ")
        return super.onNestedScroll(
            target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type, consumed
        )
    }

    override fun onNestedScroll(
        target: View,
        dxConsumed: Int,
        dyConsumed: Int,
        dxUnconsumed: Int,
        dyUnconsumed: Int,
        type: Int
    ) {
        Log.e(TAG, "onNestedScroll: ")
        return super.onNestedScroll(
            target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type
        )
    }

    override fun onNestedPreScroll(target: View, dx: Int, dy: Int, consumed: IntArray, type: Int) {
        Log.e(TAG, "onNestedPreScroll: ")
        return super.onNestedPreScroll(target, dx, dy, consumed, type)
    }
}