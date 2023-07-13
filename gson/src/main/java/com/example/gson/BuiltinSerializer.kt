package com.example.gson

import com.google.gson.Gson
import java.net.URL


/**
 *@author ZhiQiang Tu
 *@time 2023/3/29  20:40
 *@signature There are no stars in the hills.
 *@mail  2623036785@qq.com
 */

fun main() {
    val g = Gson()


    val url = URL("http://blog.tuzhiqiang.top/")
    println(g.toJson(url)) // "http://blog.tuzhiqiang.top/"
}