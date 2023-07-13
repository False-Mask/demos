package com.example.source

import com.google.gson.GsonBuilder


/**
 *@author ZhiQiang Tu
 *@time 2023/3/30  22:35
 *@signature There are no stars in the hills.
 *@mail  2623036785@qq.com
 */

data class Test(
    val a: Int = 1,
    val b: String = "2",
    val c: Char = '3'
)

fun main() {
    val gson = GsonBuilder()
        .disableHtmlEscaping()
        .create()


    val json = gson.toJson(Test())

    println(gson.fromJson(json,Test::class.java))

    println(json)
}