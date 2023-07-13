package com.example.layout_inflater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val inflate = LayoutInflater.from(this)
            .inflate(R.layout.activity_main,null)

        Log.e("TAG", "onCreate: ")


    }
}