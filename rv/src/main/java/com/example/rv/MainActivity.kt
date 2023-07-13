package com.example.rv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rv.databinding.ActivityMainBinding
import com.example.rv.databinding.LayoutRvItemBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rv.apply {
            adapter = MyAdapter((0..100).map {
                it.toString()
            })
        }

        var linearLayoutManager = binding.rv
            .layoutManager as LinearLayoutManager



    }
}

class MyAdapter(private val list: List<String>) : RecyclerView.Adapter<MyHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(LayoutRvItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.binding.tv.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }

}

class MyHolder(val binding: LayoutRvItemBinding) : RecyclerView.ViewHolder(binding.root) {

}