package com.example.vp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.vp.apply {
            adapter = VpAdapter(this@MainActivity)
        }


        



    }
}