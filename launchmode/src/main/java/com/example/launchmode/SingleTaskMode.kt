package com.example.launchmode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

private const val TAG = "SingleTaskMode"

class SingleTaskMode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e(TAG, "onCreate: ")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standarded_mode)
        findViewById<TextView>(R.id.textView).setOnClickListener {

            startActivity(
                Intent(
                    this, SingleTaskMode::class.java
                )
            )

        }

    }

    override fun onStart() {
        Log.e(TAG, "onStart: ")
        super.onStart()
    }

    override fun onResume() {
        Log.e(TAG, "onResume: "  )
        super.onResume()
    }

    override fun onPause() {
        Log.e(TAG, "onPause: ")
        super.onPause()
    }

    override fun onStop() {
        Log.e(TAG, "onStop: ")
        super.onStop()
    }

    override fun onDestroy() {
        Log.e(TAG, "onDestroy: ")
        super.onDestroy()
    }

    override fun onNewIntent(intent: Intent?) {
        Log.e(TAG, "onNewIntent: ")
        super.onNewIntent(intent)
    }
}