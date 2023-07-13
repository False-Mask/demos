package com.example.background

import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import com.example.background.databinding.ActivityClipTestBinding

class ClipActivityTest : AppCompatActivity() {

    private val binding by lazy {
        ActivityClipTestBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        with(
            ValueAnimator
                .ofInt(0, 10000)
        ) {

            addUpdateListener {
                val background = binding.viewClip.background
                background.level = it.animatedValue as Int
            }
            interpolator = AccelerateDecelerateInterpolator()
            duration = 3000
            start()
        }


    }

}