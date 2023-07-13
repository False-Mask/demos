package com.example.ui.rv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.ui.databinding.ActivityRvactivityBinding

class RVActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRvactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRvactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rv.apply {
            adapter = TestAdapter(
                listOf("Hello", "RecyclerView", "Source", "Code")
            )
            layoutManager = LinearLayoutManager(this@RVActivity)
        }

        binding.rv.layoutManager!!.isItemPrefetchEnabled = false


        binding.btnTrigger.setOnClickListener {
            binding.rv.adapter!!.notifyItemChanged(1,"NULL")
        }


    }

}