package com.example.process

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "XMLConfigredProcess"
class XMLConfiguredProcess : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xmlconfigured_process)
        Log.e(TAG, android.os.Process.myPid().toString() )
    }


    companion object {
        @JvmStatic
        fun startActivity(activity: AppCompatActivity) {
            val intent = Intent(activity, XMLConfiguredProcess::class.java)
            activity.startActivity(intent)
        }
    }

}