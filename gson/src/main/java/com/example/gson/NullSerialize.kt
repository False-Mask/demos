package com.example.gson

import com.google.gson.GsonBuilder


/**
 *@author ZhiQiang Tu
 *@time 2023/3/29  21:28
 *@signature There are no stars in the hills.
 *@mail  2623036785@qq.com
 */

fun main() {
    val nu = NullObj()
    val gson = GsonBuilder()
        .serializeNulls()
        .create()

    println(gson.toJson(nu))
}


class NullObj(
    val t:String? = null
)