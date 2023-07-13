package com.example.process

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.process.databinding.ActivityJavaProcessApiBinding

private const val TAG = "com.example.process"

class JavaProcessAPI : AppCompatActivity() {

    private val binding by lazy {
        ActivityJavaProcessApiBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val process: Process = ProcessBuilder("sleep","1d")
            .start()




        binding.textView.text = process.toString()
//        Log.e(TAG, String(process.inputStream.readBytes()))
//        Log.e(TAG, String(process.errorStream.readBytes()))


//        val waitFor = process.waitFor()
//
//        if (waitFor == 0) {
//            Log.e(TAG, String(process.inputStream.readBytes()))
//        } else {
//            Log.e(TAG, String(process.errorStream.readBytes()))
//        }


    }

    companion object {
        @JvmStatic
        fun startActivity(activity: AppCompatActivity) {
            val intent = Intent(activity, JavaProcessAPI::class.java)
            activity.startActivity(intent)
        }
    }

}