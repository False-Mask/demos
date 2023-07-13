package com.example.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView


private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(TAG, "onCreate: ")
        findViewById<TextView>(R.id.btn)
            .setOnClickListener {
                startActivity(Intent(this,BActivity::class.java))
            }
    }

    override fun onStart() {
        Log.e(TAG, "onStart: ")
        super.onStart()
    }


    override fun onPause() {
        Log.e(TAG, "onPause: ")
        super.onPause()
    }

    override fun onStop() {
        Log.e(TAG, "onStop: ")
        super.onStop()
    }

    override fun onResume() {
        Log.e(TAG, "onResume: ")
        super.onResume()
    }

    override fun onDestroy() {
        Log.e(TAG, "onDestroy: ")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.e(TAG, "onRestart: ")
        super.onRestart()
    }

}