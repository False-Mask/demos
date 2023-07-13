package com.example.ui.rv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.ui.databinding.ItemTestBinding


/**
 *@author ZhiQiang Tu
 *@time 2023/3/15  11:36
 *@signature There are no stars in the hills.
 *@mail  2623036785@qq.com
 */

class TestAdapter(
    private val l: List<String>
) : Adapter<VH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItemTestBinding.inflate(LayoutInflater.from(parent.context), null, false))
    }

    override fun getItemCount(): Int = l.size


    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.binding.textView.text = l[position]
    }

    override fun onBindViewHolder(holder: VH, position: Int, payloads: MutableList<Any>) {
        super.onBindViewHolder(holder, position, payloads)
        //notifyItemChanged()

    }

}

class VH(val binding: ItemTestBinding) : ViewHolder(binding.root) {

}
