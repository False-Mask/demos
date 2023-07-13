package com.example.service

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import android.util.Log


private const val TAG = "Service1"

class Service1 : Service() {

    override fun onCreate() {
        Log.e(TAG, "onCreate: ")
        super.onCreate()
    }

    override fun onBind(intent: Intent): IBinder {
        Log.e(TAG, "onBind: \nintent:${intent}")
        return Service1Binder()
    }

    override fun onUnbind(intent: Intent?): Boolean {
        Log.e(TAG, "onUnbind: \nintent:${intent}")
        return super.onUnbind(intent)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.e(
            TAG,
            "onStartCommand: \nintent:${intent}\nflag:${flags}\nstartId:${startId}\nObjId:${this.hashCode()}"
        )
        stopSelf()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        Log.e(TAG, "onDestroy: ")
        super.onDestroy()
    }

}

class Service1Binder : Binder() {

}