package com.example.systrace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.Toast
import java.io.File

class DebugActivity : AppCompatActivity() {

    val h = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_debug)

        findViewById<Button>(R.id.btn_trace)
            .setOnClickListener {
                Toast.makeText(this, "Begin Trace", Toast.LENGTH_SHORT).show()
                Debug.startMethodTracing(File(filesDir,"trace.trace").absolutePath)
                h.postDelayed(Runnable {

                    Debug.stopMethodTracing()
                    Toast.makeText(this, "End Trace", Toast.LENGTH_SHORT).show()
                }, 10  * 1000L)
            }

    }
}