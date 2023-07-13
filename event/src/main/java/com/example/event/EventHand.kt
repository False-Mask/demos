package com.example.event

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View


/**
 *@author ZhiQiang Tu
 *@time 2023/3/17  17:42
 *@signature There are no stars in the hills.
 *@mail  2623036785@qq.com
 */

class EventHand @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return true
    }



}