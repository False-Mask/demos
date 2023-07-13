package com.example.background

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.example.background.databinding.ActivityLayerListTestBinding

class LayerListActivityTest : AppCompatActivity() {

    private lateinit var binding: ActivityLayerListTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityLayerListTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}