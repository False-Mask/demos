package com.example.binder

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import com.example.binder.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private var cn: IMyAidlInterface? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        bindService(Intent(this, MyService::class.java), object : ServiceConnection {
            override fun onServiceConnected(name: ComponentName, service: IBinder) {
                cn = IMyAidlInterface.Stub.asInterface(service)
                cn?.basicTypes(1,1L,false,1F,1.0,"1")

            }

            override fun onServiceDisconnected(name: ComponentName?) {
                cn = null
            }


        }, Context.BIND_AUTO_CREATE)


        binding.btnButton.setOnClickListener {
            cn?.basicTypes(1,1L,false,1F,1.0,"1")
        }



    }
}