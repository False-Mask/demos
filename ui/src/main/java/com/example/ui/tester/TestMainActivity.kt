package com.example.ui.tester

import android.graphics.PixelFormat.OPAQUE
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.ui.R

private const val TAG = "TestMainActivity"

class TestMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_main)

        val btn = Button(this).apply {
            width = 100
            height = 100
        }

        windowManager.addView(
            btn, WindowManager.LayoutParams(
                600,
                600,
                WindowManager.LayoutParams.FLAG_ALLOW_LOCK_WHILE_SCREEN_ON,
                WindowManager.LayoutParams.TYPE_APPLICATION,
                OPAQUE
            )
        )


    }
}