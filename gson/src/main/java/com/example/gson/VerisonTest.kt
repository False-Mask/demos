package com.example.gson

import com.google.gson.GsonBuilder
import com.google.gson.annotations.Since


/**
 *@author ZhiQiang Tu
 *@time 2023/3/29  21:30
 *@signature 或许是不知梦的缘故,流离之人追逐幻影
 *@mail  2623036785@qq.com
 */

data class VersionedData(
    @Since(1.0)
    val a: Int,
    @Since(2.0)
    val b: String,
    @Since(3.0)
    val c: Char
)

fun main() {

    val gson = GsonBuilder()
        .setVersion(1.0)
        .create()

    val vd = VersionedData(1,"2",'3')

    println(gson.toJson(vd))

}
