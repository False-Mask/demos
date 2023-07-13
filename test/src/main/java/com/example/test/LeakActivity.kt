package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class LeakActivity : AppCompatActivity() {

    val handler = Handler(Looper.myLooper()!!) {
        return@Handler false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leak)

       handler.postDelayed({},10 * 1000)

    }
}