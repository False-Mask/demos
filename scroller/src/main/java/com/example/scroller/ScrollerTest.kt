package com.example.scroller

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Scroller


/**
 *@author ZhiQiang Tu
 *@time 2023/3/24  19:09
 *@signature There are no stars in the hills.
 *@mail  2623036785@qq.com
 */

private const val TAG = "ScrollerTest"

class ScrollerTest @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val helper = Scroller(context)

    private var xPosition: Float = 0f
    private var yPosition: Float = 0f

    override fun onTouchEvent(event: MotionEvent): Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
            }
            MotionEvent.ACTION_MOVE -> {
                val dx = event.x - xPosition
                val dy = event.y - yPosition
                Log.e(TAG, " x:$dx y:$dy")
                scrollBy(-dx.toInt(), -dy.toInt())
            }
            MotionEvent.ACTION_UP -> {
                helper.startScroll(scrollX, scrollY, (x - scrollX).toInt(), (y - scrollY).toInt())
                invalidate()
            }

        }
        xPosition = event.x
        yPosition = event.y
        return true
    }

    override fun computeScroll() {
        if (helper.computeScrollOffset()) {
            scrollTo(helper.currX, helper.currY)
            postInvalidate()
        }
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawRect(
            Rect(0, 0, width, height),
            Paint().apply { color = Color.parseColor("#03dac5") })
        super.onDraw(canvas)
    }

}