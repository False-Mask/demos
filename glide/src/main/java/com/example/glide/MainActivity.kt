package com.example.glide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Glide.with(this)
            .load("https://www.baidu.com")
            .apply(
                RequestOptions()
                    .error(R.drawable.ic_launcher_background)
                    .placeholder(R.drawable.ic_launcher_foreground)
                    .fallback(R.drawable.ic_launcher_background)
            )
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(findViewById(R.id.iv_image))

        Glide.with(this)
            .asDrawable()
    }
}