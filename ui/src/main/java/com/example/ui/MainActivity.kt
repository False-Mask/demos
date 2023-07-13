package com.example.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }



//    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
//        return false
//    }



}