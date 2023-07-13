package com.example.gson

import com.google.gson.GsonBuilder


/**
 *@author ZhiQiang Tu
 *@time 2023/3/28  21:16
 *@signature There are no stars in the hills.
 *@mail  2623036785@qq.com
 */

fun main() {

    val gson = GsonBuilder()
        .setPrettyPrinting()
        .create()



    println(gson.toJson(Test(1, "2", '3')))


}

data class Test(
    val a: Int,
    val b: String,
    val c: Char,
)

data class Test2(
    val a: Int,
    val b: Int,
    val c: Int
)
