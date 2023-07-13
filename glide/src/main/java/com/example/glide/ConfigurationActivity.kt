package com.example.glide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.glide.databinding.ActivityConfigurationBinding

class ConfigurationActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityConfigurationBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}