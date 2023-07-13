package com.example.service

import android.app.Service
import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import com.example.service.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnButton1.setOnClickListener {
            startService(Intent(this, Service1::class.java))
        }

        binding.btnButton2.setOnClickListener {
            bindService(Intent(this, Service1::class.java), object : ServiceConnection {
                override fun onServiceConnected(name: ComponentName?, service: IBinder?) {

                }

                override fun onServiceDisconnected(name: ComponentName?) {
                }

            }, Service.BIND_AUTO_CREATE)
        }




    }
}