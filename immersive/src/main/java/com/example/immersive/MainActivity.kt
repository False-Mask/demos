package com.example.immersive

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.example.immersive.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        val lp = window.attributes

    }

    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        immersive()


        // immersive()

    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
    }

    @RequiresApi(Build.VERSION_CODES.S)
    private fun immersive() {

        WindowCompat.setDecorFitsSystemWindows(window,false)

        val windowInsetsController =
            WindowCompat.getInsetsController(window, window.decorView)
        // Configure the behavior of the hidden system bars.
        windowInsetsController.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE

        // Add a listener to update the behavior of the toggle fullscreen button when
        // the system bars are hidden or revealed.
        window.decorView.setOnApplyWindowInsetsListener { view, windowInsets ->
            // You can hide the caption bar even when the other system bars are visible.
            // To account for this, explicitly check the visibility of navigationBars()
            // and statusBars() rather than checking the visibility of systemBars().


            windowInsetsController.hide(WindowInsetsCompat.Type.systemBars())
            view.onApplyWindowInsets(windowInsets)
        }


//        WindowCompat.getInsetsController(window,window.decorView)
//            .hide(WindowInsetsCompat.Type.systemBars())

    }


//        val decorView = window.decorView
//        decorView.systemUiVisibility =
//            View.SYSTEM_UI_FLAG_LAYOUT_STABLE xor
//                    View.SYSTEM_UI_FLAG_FULLSCREEN xor
//                    View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION xor
//                    SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN xor
//                    SYSTEM_UI_FLAG_HIDE_NAVIGATION xor
//                    SYSTEM_UI_FLAG_IMMERSIVE_STICKY


}


