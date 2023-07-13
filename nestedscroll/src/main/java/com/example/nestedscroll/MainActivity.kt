package com.example.nestedscroll

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nestedscroll.conflict.ConflateActivity
import com.example.nestedscroll.databinding.ActivityMainBinding
import com.example.nestedscroll.nested.NestedScrollActivity

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnScrollConflact.setOnClickListener {
            startActivity(Intent(this,ConflateActivity::class.java))
        }

        binding.btnNestedscroll.setOnClickListener {
            startActivity(Intent(this,NestedScrollActivity::class.java ))
        }


    }
}