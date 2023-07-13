package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.test.databinding.ActivitySizeControlBinding

private const val TAG = "SizeControl"

class SizeControl : AppCompatActivity() {

    private val binding by lazy {
        ActivitySizeControlBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val vp = RecycledViewPool()
        vp.putRecycledView(object : ViewHolder(binding.root) {

        })

//        binding.imageView4.apply {
//            layoutParams.width = (100 * resources.displayMetrics.density).toInt()
//            layoutParams.height = (100 * resources.displayMetrics.density).toInt()
//        }

        binding.imageView3.viewTreeObserver
            .addOnGlobalLayoutListener {
                Log.e(
                    TAG,
                    "${binding.imageView3.width}:${binding.imageView3.height}\n ${binding.imageView4.width}:${binding.imageView4.height}"
                )
            }
    }
}