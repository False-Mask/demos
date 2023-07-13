package com.example.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
private const val TAG = "BActivity"
class BActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e(TAG, "onCreate: ")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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