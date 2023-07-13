package com.example.glide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.glide.databinding.ActivityTransformationsBinding

class Transformations : AppCompatActivity() {

    private val binding by lazy {
        ActivityTransformationsBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Glide.with(this)
            .load(R.drawable.ic_launcher_background)
            .apply(
                RequestOptions()
                    .circleCrop()
                    .dontTransform()

            )
            .into(binding.ivImage)


    }
}