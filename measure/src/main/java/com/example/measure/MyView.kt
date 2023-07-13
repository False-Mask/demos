package com.example.measure

import android.content.Context
import android.util.AttributeSet
import android.view.View


/**
 *@author ZhiQiang Tu
 *@time 2023/3/26  18:32
 *@signature There are no stars in the hills.
 *@mail  2623036785@qq.com
 */

class MyView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        setMeasuredDimension(MeasureSpec.EXACTLY.xor(100), MeasureSpec.EXACTLY.xor(500))
        //super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        postInvalidate()

    }

}