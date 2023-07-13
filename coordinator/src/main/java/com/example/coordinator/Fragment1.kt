package com.example.coordinator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.coordinator.databinding.ItemFragment1ListBinding
import com.example.coordinator.databinding.ItemRvListBinding


/**
 * A simple [Fragment] subclass.
 * Use the [Fragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment1 : Fragment() {

    private val binding: ItemFragment1ListBinding by lazy {
        ItemFragment1ListBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return binding?.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.rv.apply {
            adapter = RvAdapter((0..1000).map { it.toString() })
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }


}

class RvAdapter(
    private val l: List<String>
) : RecyclerView.Adapter<RvHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvHolder {
        return RvHolder(
            ItemRvListBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return l.size
    }

    override fun onBindViewHolder(holder: RvHolder, position: Int) {
        holder.binding.apply {
            tv.text = l[position]
        }
    }

}

class RvHolder(val binding: ItemRvListBinding) : RecyclerView.ViewHolder(binding.root) {

}
