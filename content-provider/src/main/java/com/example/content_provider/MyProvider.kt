package com.example.content_provider

import android.app.Activity
import android.app.Application
import android.app.Application.ActivityLifecycleCallbacks
import android.content.ComponentCallbacks2
import android.content.ContentProvider
import android.content.ContentValues
import android.content.res.Configuration
import android.database.Cursor
import android.net.Uri
import android.os.Bundle
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Proxy

class MyProvider : ContentProvider() {

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<String>?): Int = 0

    override fun getType(uri: Uri): String? = null

    override fun insert(uri: Uri, values: ContentValues?): Uri? = null

    override fun onCreate(): Boolean {

        context?.resources?.displayMetrics?.apply {
            val before = density
            density = heightPixels / 1600f
            val end = density
            scaledDensity *= end / before
        }

        (context as Application)
            .registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks by proxy() {
                override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                    activity.resources?.displayMetrics?.apply {
                        val before = density
                        density = heightPixels / 1600f
                        val end = density
                        scaledDensity *= end / before
                    }
                }
            })



            (context as Application).registerComponentCallbacks(object :ComponentCallbacks2 {
                override fun onConfigurationChanged(newConfig: Configuration) {
                    context!!.resources.displayMetrics.apply {
//                        val before = density
//                        density = heightPixels / 1600f
//                        val end = density
//                        scaledDensity *= end / before
                    }
                }

                override fun onLowMemory() {
                }

                override fun onTrimMemory(level: Int) {
                }

            })

        return true

    }

    override fun query(
        uri: Uri, projection: Array<String>?, selection: String?,
        selectionArgs: Array<String>?, sortOrder: String?
    ): Cursor? = null

    override fun update(
        uri: Uri, values: ContentValues?, selection: String?,
        selectionArgs: Array<String>?
    ): Int {
        return 0
    }
}

inline fun <reified Clz> proxy(): Clz {
    return Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
        arrayOf(ActivityLifecycleCallbacks::class.java),
        InvocationHandler { proxy, method, args ->

        }) as Clz
}