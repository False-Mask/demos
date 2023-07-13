package com.example.gson

import com.google.gson.Gson


/**
 *@author ZhiQiang Tu
 *@time 2023/3/29  0:03
 *@signature 或许是不知梦的缘故,流离之人追逐幻影
 *@mail  2623036785@qq.com
 */

fun main() {
    val gson = Gson()
    gson.toJson(1) // ==> 1
    gson.toJson("abcd") // ==> "abcd"
    gson.toJson(10) // ==> 10
    val values = intArrayOf(1)
    gson.toJson(values) // ==> [1]

    // Deserialization
    val i = gson.fromJson("1", Int::class.java)
    val intObj = gson.fromJson("1", Int::class.java)
    val longObj = gson.fromJson("1", Long::class.java)
    val boolObj = gson.fromJson("false", Boolean::class.java)
    val str = gson.fromJson("\"abc\"", String::class.java)
    val strArray = gson.fromJson(
        "[\"abc\"]",
        Array<String>::class.java
    )

}
