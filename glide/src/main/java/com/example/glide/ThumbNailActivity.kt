package com.example.glide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.glide.databinding.ActivityThumbNailBinding

class ThumbNailActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityThumbNailBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Glide.with(this)



        Glide.with(this)
            .load(R.drawable.ic_launcher_background)
            .thumbnail(
                Glide.with(this)
                    .load(R.drawable.ic_launcher_foreground)
            )
            .into(binding.imageView)

    }
}