package com.example.nestedscroll.conflict

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedscroll.databinding.LayoutTestBinding


/**
 *@author ZhiQiang Tu
 *@time 2023/3/19  16:19
 *@signature There are no stars in the hills.
 *@mail  2623036785@qq.com
 */

class MAdapter(private val list: List<String>) : RecyclerView.Adapter<VH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutTestBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.binding.root.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }
}

class VH(val binding: LayoutTestBinding) : RecyclerView.ViewHolder(binding.root) {

}