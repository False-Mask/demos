package com.example.ui;

import android.content.Context
import android.graphics.Paint
import android.graphics.Rect
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.LineHeightSpan
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import java.lang.Integer.max
import java.lang.Integer.min
import kotlin.math.abs

class ExcludeFontPaddingTextView : AppCompatTextView {

    init {
        includeFontPadding = false
    }

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    override fun setText(text: CharSequence?, type: BufferType?) {
        super.setText(getCustomText(text), type)
    }


    private fun getCustomText(text: CharSequence?): SpannableStringBuilder? {

        return text?.let {

            val rect = Rect()
            paint.getTextBounds(text.toString(), 0, text.length, rect)

            val ssb = SpannableStringBuilder(text)
            //设置LineHeightSpan
            ssb.setSpan(
                object : LineHeightSpan {
                    override fun chooseHeight(
                        text: CharSequence,
                        start: Int,
                        end: Int,
                        spanstartv: Int,
                        lineHeight: Int,
                        fm: Paint.FontMetricsInt
                    ) {

                        val viewHeight = fm.descent - fm.ascent
                        val textHeight = max(textSize.toInt(), rect.bottom - rect.top)

                        val paddingTop = abs(fm.ascent - rect.top)
                        val paddingBottom = fm.descent - rect.bottom

                        val minPadding = min(paddingTop, paddingBottom)
                        val avgPadding = (viewHeight - textHeight) / 2

                        when {
                            avgPadding < minPadding -> {
                                fm.ascent += avgPadding
                                fm.descent -= avgPadding
                            }

                            paddingTop < paddingBottom -> {
                                fm.ascent = rect.top
                                fm.descent = textHeight + fm.ascent

                            }

                            else -> {
                                fm.descent = rect.bottom
                                fm.ascent = fm.descent - textHeight
                            }
                        }


                    }

                },
                0,
                text.length,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
            )
            ssb
        }


    }


}