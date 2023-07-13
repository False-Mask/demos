package com.example.content_provider

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log
import android.view.View

class MyView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {


    override fun onDraw(canvas: Canvas) {
        Log.e("TAG-MyView", "${app.hashCode()} : ${app.resources.hashCode()} : ${app.resources.displayMetrics.hashCode()}" )
        Log.e("TAG-MyView", app.resources.displayMetrics.toString())
        super.onDraw(canvas)
    }

}