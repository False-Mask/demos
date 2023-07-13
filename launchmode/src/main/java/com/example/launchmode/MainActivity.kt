package com.example.launchmode

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.launchmode.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnStandard.setOnClickListener {
            startActivity(Intent(this,StandardedMode::class.java))
        }

        binding.btnSingletop.setOnClickListener {
            startActivity(Intent(this,SingleTopMode::class.java))

        }

        binding.btnSingleinstance.setOnClickListener {
            startActivity(Intent(this,SingleInstanceMode::class.java))

        }

        binding.btnSingleTask.setOnClickListener {
            startActivity(Intent(this,SingleTaskMode::class.java))

        }

        binding.btnTest.setOnClickListener {
            startActivity(Intent().apply {
                action = "Hello"
                addCategory("Hello")
                data = Uri.parse("https://hello:80/Hello")
            })
        }




    }
}
