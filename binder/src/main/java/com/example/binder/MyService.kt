package com.example.binder

import android.app.Service
import android.content.Intent
import android.os.IBinder

class MyService : Service() {

    private val aidl = AidlTest()

    override fun onBind(intent: Intent?): IBinder? {
        return aidl
    }
}