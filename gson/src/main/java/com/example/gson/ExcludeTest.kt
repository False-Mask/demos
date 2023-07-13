package com.example.gson

import com.google.gson.GsonBuilder
import com.google.gson.annotations.Expose
import java.lang.reflect.Modifier


/**
 *@author ZhiQiang Tu
 *@time 2023/3/29  21:39
 *@signature 或许是不知梦的缘故,流离之人追逐幻影
 *@mail  2623036785@qq.com
 */

data class ExcludeData(
    @Expose
    val a: Int,
    @Expose
    private val b: String,
    val c: Char,
    val d: Boolean
)

fun main() {
    val gson = GsonBuilder()
        .excludeFieldsWithoutExposeAnnotation()
        .excludeFieldsWithModifiers(Modifier.PRIVATE)
        .create()

    val ed = ExcludeData(1,"2",'3',false)

    println(gson.toJson(ed))

}