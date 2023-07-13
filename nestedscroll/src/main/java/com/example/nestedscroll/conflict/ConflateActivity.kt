package com.example.nestedscroll.conflict

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nestedscroll.databinding.ActivityConflictBinding

class ConflateActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityConflictBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rv.apply {
            adapter = MAdapter((0..1000).map {
                "我是第${it}个item"
            })
            layoutManager = LinearLayoutManager(this@ConflateActivity)
        }



    }
}