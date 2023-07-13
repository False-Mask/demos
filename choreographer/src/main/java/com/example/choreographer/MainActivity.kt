package com.example.choreographer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.view.Choreographer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val c = Choreographer.getInstance()



        val callBack = object : Choreographer.FrameCallback {
            override fun doFrame(frameTimeNanos: Long) {
                Log.e("TAG", "rendering:$frameTimeNanos ${SystemClock.uptimeMillis()}")
                c.postFrameCallback(this)
            }

        }
        c.postFrameCallback(callBack)

    }
}