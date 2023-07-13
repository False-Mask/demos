package com.example.crash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.crash.databinding.ActivityMainBinding

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Thread.setDefaultUncaughtExceptionHandler { t, e ->
            Log.e(TAG, "setDefaultUncaughtExceptionHandler")
        }

        binding.button.setOnClickListener {
            startActivity(Intent(this, AnotherProcess::class.java))
        }

    }
}