package com.example.process

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.process.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Thread.setDefaultUncaughtExceptionHandler { t, e ->
            val exec = Runtime.getRuntime().exec(
                """
                am start -n "com.example.process/com.example.process.MainActivity" -a android.intent.action.MAIN -c android.intent.category.LAUNCHER
            """.trimIndent()
            )

            exec.waitFor()
            println(String(exec.inputStream.readBytes()))
            println(String(exec.errorStream.readBytes()))

        }

        binding.button.setOnClickListener {
            JavaProcessAPI.startActivity(this)
        }

        binding.button2.setOnClickListener {
            XMLConfiguredProcess.startActivity(this)
        }

    }
}