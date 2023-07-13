package com.example.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fragment.databinding.FragmentFirstBinding

private const val TAG = "FirstFragment"
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        childFragmentManager
        Log.e(TAG, "onAttach: ")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e(TAG, "onCreate: ")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e(TAG, "onCreateView: ")
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        Log.e(TAG, "onViewCreated: ")

        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.e(TAG, "onActivityCreated: ")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.e(TAG, "onStart: "+this.hashCode())
        super.onStart()
    }

    override fun onResume() {
        Log.e(TAG, "onResume: ")
        super.onResume()
    }

    override fun onPause() {
        Log.e(TAG, "onPause: ")
        super.onPause()
    }

    override fun onStop() {
        Log.e(TAG, "onStop: ")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.e(TAG, "onDestroyView: ")
        super.onDestroyView()
        _binding = null
    }

    override fun onDestroy() {
        Log.e(TAG, "onDestroy: ")
        super.onDestroy()
    }
}