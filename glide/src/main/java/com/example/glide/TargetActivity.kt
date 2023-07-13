package com.example.glide

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomViewTarget
import com.bumptech.glide.request.transition.Transition
import com.example.glide.databinding.ActivityTargetBinding

class TargetActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityTargetBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Glide.with(this)
            .load("")
            .into(object : CustomViewTarget<ImageView, Drawable>(findViewById(R.id.iv_image)) {
                override fun onLoadFailed(errorDrawable: Drawable?) {
                    TODO("Not yet implemented")
                }

                override fun onResourceCleared(placeholder: Drawable?) {
                    TODO("Not yet implemented")
                }

                override fun onResourceReady(
                    resource: Drawable,
                    transition: Transition<in Drawable>?
                ) {
                    TODO("Not yet implemented")
                }

            })


    }
}