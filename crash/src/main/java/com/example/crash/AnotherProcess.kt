package com.example.crash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.crash.databinding.ActivityAnotherProcessBinding

private const val TAG = "AnotherProcess"

class AnotherProcess : AppCompatActivity() {

    private val binding by lazy {
        ActivityAnotherProcessBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            throw IllegalStateException("error")
        }

    }
}