package com.example.content_provider

import android.app.Application
import android.util.Log

private const val TAG = "TAG-MyApp"

lateinit var app: Application

class MyApp : Application() {


    override fun onCreate() {
        app = this
        Log.e(TAG, resources.displayMetrics.toString())
        super.onCreate()
    }

}