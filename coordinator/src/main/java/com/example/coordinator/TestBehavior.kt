package com.example.coordinator

import android.content.Context
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.appbar.AppBarLayout

public open class TestBehavior() :
    com.google.android.material.appbar.AppBarLayout.Behavior() {

    constructor(ctx: Context, attrs: AttributeSet) : this()
    // 构造生成layoutParams调用
    override fun onAttachedToLayoutParams(params: CoordinatorLayout.LayoutParams) {
        super.onAttachedToLayoutParams(params)
    }

    override fun onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams()
    }

    override fun getScrimColor(parent: CoordinatorLayout, child: AppBarLayout): Int {
        return super.getScrimColor(parent, child)
    }

//    override fun getScrimOpacity(parent: CoordinatorLayout, child: AppBarLayout): Float {
//        return super.getScrimOpacity(parent, child)
//    }

//    override fun blocksInteractionBelow(parent: CoordinatorLayout, child: AppBarLayout): Boolean {
//        return super.blocksInteractionBelow(parent, child)
//    }

    // measure过程中确定，添加到一个依赖图里面
    override fun layoutDependsOn(
        parent: CoordinatorLayout,
        child: AppBarLayout,
        dependency: View
    ): Boolean {
        return super.layoutDependsOn(parent, child, dependency)
    }

    override fun onDependentViewChanged(
        parent: CoordinatorLayout,
        child: AppBarLayout,
        dependency: View
    ): Boolean {
        return super.onDependentViewChanged(parent, child, dependency)
    }

    override fun onDependentViewRemoved(
        parent: CoordinatorLayout,
        child: AppBarLayout,
        dependency: View
    ) {
        super.onDependentViewRemoved(parent, child, dependency)
    }

    override fun onStartNestedScroll(
        coordinatorLayout: CoordinatorLayout,
        child: AppBarLayout,
        directTargetChild: View,
        target: View,
        axes: Int
    ): Boolean {
        return super.onStartNestedScroll(coordinatorLayout, child, directTargetChild, target, axes)
    }

    // 子布局的嵌套滑动被同意的时候的

    override fun onNestedScrollAccepted(
        coordinatorLayout: CoordinatorLayout,
        child: AppBarLayout,
        directTargetChild: View,
        target: View,
        axes: Int
    ) {
        super.onNestedScrollAccepted(coordinatorLayout, child, directTargetChild, target, axes)
    }

    override fun onNestedScrollAccepted(
        coordinatorLayout: CoordinatorLayout,
        child: AppBarLayout,
        directTargetChild: View,
        target: View,
        axes: Int,
        type: Int
    ) {
        super.onNestedScrollAccepted(
            coordinatorLayout,
            child,
            directTargetChild,
            target,
            axes,
            type
        )
    }

    override fun onStopNestedScroll(
        coordinatorLayout: CoordinatorLayout,
        child: AppBarLayout,
        target: View
    ) {
        super.onStopNestedScroll(coordinatorLayout, child, target)
    }

    override fun onNestedScroll(
        coordinatorLayout: CoordinatorLayout,
        child: AppBarLayout,
        target: View,
        dxConsumed: Int,
        dyConsumed: Int,
        dxUnconsumed: Int,
        dyUnconsumed: Int
    ) {
        super.onNestedScroll(
            coordinatorLayout,
            child,
            target,
            dxConsumed,
            dyConsumed,
            dxUnconsumed,
            dyUnconsumed
        )
    }

    override fun onNestedScroll(
        coordinatorLayout: CoordinatorLayout,
        child: AppBarLayout,
        target: View,
        dxConsumed: Int,
        dyConsumed: Int,
        dxUnconsumed: Int,
        dyUnconsumed: Int,
        type: Int
    ) {
        super.onNestedScroll(
            coordinatorLayout,
            child,
            target,
            dxConsumed,
            dyConsumed,
            dxUnconsumed,
            dyUnconsumed,
            type
        )
    }

    override fun onNestedPreScroll(
        coordinatorLayout: CoordinatorLayout,
        child: AppBarLayout,
        target: View,
        dx: Int,
        dy: Int,
        consumed: IntArray
    ) {
        super.onNestedPreScroll(coordinatorLayout, child, target, dx, dy, consumed)
    }

    override fun onNestedFling(
        coordinatorLayout: CoordinatorLayout,
        child: AppBarLayout,
        target: View,
        velocityX: Float,
        velocityY: Float,
        consumed: Boolean
    ): Boolean {
        return super.onNestedFling(coordinatorLayout, child, target, velocityX, velocityY, consumed)
    }

    override fun onNestedPreFling(
        coordinatorLayout: CoordinatorLayout,
        child: AppBarLayout,
        target: View,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        return super.onNestedPreFling(coordinatorLayout, child, target, velocityX, velocityY)
    }

    override fun onApplyWindowInsets(
        coordinatorLayout: CoordinatorLayout,
        child: AppBarLayout,
        insets: WindowInsetsCompat
    ): WindowInsetsCompat {
        return super.onApplyWindowInsets(coordinatorLayout, child, insets)
    }

    override fun onRequestChildRectangleOnScreen(
        coordinatorLayout: CoordinatorLayout,
        child: AppBarLayout,
        rectangle: Rect,
        immediate: Boolean
    ): Boolean {
        return super.onRequestChildRectangleOnScreen(coordinatorLayout, child, rectangle, immediate)
    }

    override fun getInsetDodgeRect(
        parent: CoordinatorLayout,
        child: AppBarLayout,
        rect: Rect
    ): Boolean {
        return super.getInsetDodgeRect(parent, child, rect)
    }
}