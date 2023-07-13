package com.example.glide

import android.content.Context
import android.util.Log
import com.bumptech.glide.Glide
import com.bumptech.glide.GlideBuilder
import com.bumptech.glide.Registry
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.load.engine.cache.LruResourceCache
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator
import com.bumptech.glide.module.AppGlideModule
import com.bumptech.glide.module.LibraryGlideModule


/**
 *@author ZhiQiang Tu
 *@time 2023/4/5  22:59
 *@signature There are no stars in the hills.
 *@mail  2623036785@qq.com
 */

@GlideModule
class YourAppGlideModule : AppGlideModule() {
    override fun applyOptions(context: Context, builder: GlideBuilder) {
        val calculator = MemorySizeCalculator.Builder(context)
            .setMemoryCacheScreens(2f)
            .build()

        builder.apply {
            setMemoryCache(LruResourceCache(calculator.memoryCacheSize.toLong()))
            setLogLevel(Log.DEBUG)
            setImageDecoderEnabledForBitmaps(true)
        }
    }
}

@GlideModule
class MyLibraryGlideModule : LibraryGlideModule() {

    override fun registerComponents(context: Context, glide: Glide, registry: Registry) {
        super.registerComponents(context, glide, registry)
    }
}