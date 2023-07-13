package com.example.gson

import com.google.gson.Gson


/**
 *@author ZhiQiang Tu
 *@time 2023/3/29  18:04
 *@signature 或许是不知梦的缘故,流离之人追逐幻影
 *@mail  2623036785@qq.com
 */

class A {

    val a: String = "A"

    inner class B(
        val b: String = "B"
    ) {
        fun test() {
            println(this@A.hashCode())
        }
    }

}

fun main() {
    val a = A()
    val b = a.B()

    val gson = Gson()
    val json = gson.toJson(b)


    val fromJson = gson
        .fromJson(json, b::class.java)


    println(json)
    println(fromJson.test())
}
