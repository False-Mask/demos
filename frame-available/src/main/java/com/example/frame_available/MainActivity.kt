package com.example.frame_available

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import android.os.Message
import android.util.Log
import android.view.FrameMetrics
import androidx.core.view.doOnAttach

class MainActivity : AppCompatActivity() {

    private val ht = HandlerThread("handler")

    init {
        ht.start()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val c = Canvas(Bitmap.createBitmap())

        val w = window

        window.decorView.doOnAttach {

            w.addOnFrameMetricsAvailableListener({ window, frameMetrics, dropCountSinceLastInvocation ->
                Log.e(
                    "TAG", "Metrics:${frameMetrics.getMetric(FrameMetrics.DRAW_DURATION)}:$dropCountSinceLastInvocation"
                )

            }, object : Handler(ht.looper, Handler.Callback {
                Log.e("TAG", "Callback")
                return@Callback false
            }) {
                override fun handleMessage(msg: Message) {
                    Log.e("TAG", "handleMessage")
                    super.handleMessage(msg)
                }
            })

        }


    }
}