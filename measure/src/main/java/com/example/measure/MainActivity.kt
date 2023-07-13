package com.example.measure

import android.animation.ValueAnimator
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity


private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    lateinit var view: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view = findViewById(android.R.id.content)

        getWidthAndHeight("onCreate")

        view.post {
            getWidthAndHeight("view.post")
        }

        view.viewTreeObserver.addOnGlobalLayoutListener {
            getWidthAndHeight("viewTreeObserver")
        }

        ValueAnimator.ofPropertyValuesHolder()
            .start()


    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        getWidthAndHeight("onWindowFocusChanged")
        super.onWindowFocusChanged(hasFocus)
    }


    // 获取宽高
    private fun getWidthAndHeight(string: String) {
        Log.e(TAG, "${string}:\nwidth:${view.width}\nheight:${view.height}\n")
    }
}