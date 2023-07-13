package com.example.background

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.background.databinding.ActivityRippleTestBinding

class RippleActivityTest : AppCompatActivity() {

    private val binding by lazy {
        ActivityRippleTestBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



    }
}