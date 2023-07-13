package com.example.glide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.glide.databinding.ActivitySourceBinding

class SourceActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivitySourceBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


//        Glide.with(this)
//            .load(R.drawable.space_big)
//            .into(binding.imageView4)


        Glide.with(this)
            .asDrawable()
            .load("https://images-assets.nasa.gov/image/PIA12348/PIA12348~orig.jpg")
            .into(binding.imageView4)

    }
}