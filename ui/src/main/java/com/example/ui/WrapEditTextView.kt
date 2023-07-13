package com.example.ui

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet

class WrapEditTextView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : androidx.appcompat.widget.AppCompatEditText(context, attrs) {

    val p = Paint()
    val rect = Rect()


    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        p.textSize = textSize

        p.getTextBounds(text.toString(), 0, text?.length ?: 0, rect)

        val den = context.resources.displayMetrics.density

        setMeasuredDimension(measuredWidth, if(rect.height() == 0) 10 * den.toInt() else rect.height())
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
    }

}