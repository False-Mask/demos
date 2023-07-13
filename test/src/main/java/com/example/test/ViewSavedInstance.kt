package com.example.test

import android.content.Context
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.os.PersistableBundle
import android.util.AttributeSet
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.test.databinding.ActivityViewSavedInstanceBinding

class ViewSavedInstance : AppCompatActivity() {

    private val binding by lazy {
        ActivityViewSavedInstanceBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Log.e("TAG", binding.root.hashCode().toString())
        setContentView(binding.root)

        binding.button3.setOnClickListener {
            binding.viewSavedState.text = "Set The Value"
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
    }
}

class ViewSavedState @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : androidx.appcompat.widget.AppCompatTextView(context, attrs, defStyleAttr) {

    override fun onSaveInstanceState(): Parcelable? {
        Log.e("TAG", this.hashCode().toString())
        val p = super.onSaveInstanceState()
        val s = SS(p, text.toString())
        return s
    }

    override fun onRestoreInstanceState(state: Parcelable?) {
        val ss = state as SS
        super.onRestoreInstanceState(ss.superState)
        text = ss.str
    }

    class SS(source: Parcelable?, val str: String) : BaseSavedState(source) {
        override fun writeToParcel(out: Parcel, flags: Int) {
            out.writeString(str)
        }

    }


}