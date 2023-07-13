package com.example.test

import android.content.pm.PackageManager
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.test.databinding.ActivityMetaTesterBinding

private const val TAG = "MetaTester"

class MetaTester : AppCompatActivity() {

    private val binding by lazy {
        ActivityMetaTesterBinding.inflate(layoutInflater)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val metaData = packageManager.getApplicationInfo(packageName, PackageManager.GET_META_DATA)
            .metaData


        Log.e(TAG, metaData.toString())

        metaData.keySet()
            .forEach{
                Log.e(TAG, it+":"+metaData.get(it) )
            }


    }
}