package com.example.coordinator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.coordinator.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {
            vpTest.adapter = MyVpAdapter(l, supportFragmentManager, lifecycle)
            TabLayoutMediator(tlTab, vpTest) { tab, position ->
                tab.text = "第${position}个"
            }.attach()
        }



    }
}

val l = listOf(
    Fragment1(),
    Fragment1(),
    Fragment1(),
    Fragment1(),
    Fragment1()
)

class MyVpAdapter(
    private val l: List<Fragment>,
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return l.size
    }

    override fun createFragment(position: Int): Fragment {
        return l[position]
    }

}