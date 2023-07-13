package com.example.gson

import com.google.gson.Gson


/**
 *@author ZhiQiang Tu
 *@time 2023/3/29  15:33
 *@signature 或许是不知梦的缘故,流离之人追逐幻影
 *@mail  2623036785@qq.com
 */

fun main() {
    val obj = Obj(1, "2")

    val gson = Gson()
    // 序列化
    val json = gson.toJson(obj)
    println(json)
    // 反序列化
    println(gson.fromJson(json,Obj::class.java))
}


data class Obj(
    val value1: Int,
    val value2: String,
)
