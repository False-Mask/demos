package com.example.gson

import com.google.gson.Gson


/**
 *@author ZhiQiang Tu
 *@time 2023/3/29  18:25
 *@signature 或许是不知梦的缘故,流离之人追逐幻影
 *@mail  2623036785@qq.com
 */

fun main() {
    val gson = Gson()
    val ints: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    val json = gson.toJson(ints) // ==> json is [1,2,3,4,5]


    println(json)


    val ints2 = gson.fromJson(json,ints::class.java)

}
