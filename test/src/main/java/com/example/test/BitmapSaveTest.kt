package com.example.test

import android.graphics.Bitmap
import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.graphics.createBitmap
import com.example.test.databinding.ActivityBitmapSaveTestBinding
import java.io.File

private const val TAG = "BitmapSaveTest"

class BitmapSaveTest : AppCompatActivity() {

    private val binding by lazy {
        ActivityBitmapSaveTestBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button2.setOnClickListener {


            window.decorView.apply {
                val bitmap = createBitmap(width, height, Bitmap.Config.ARGB_8888)
                val c = Canvas(bitmap)
                draw(c)

                File(cacheDir.absolutePath + "/test.png")
                    .outputStream()
                    .buffered().use {
                        val r = bitmap.compress(Bitmap.CompressFormat.PNG, 100, it)
                        if (!r) {
                            Log.e(TAG, "write error")
                        }
                    }


            }

        }
    }
}