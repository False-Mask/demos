package com.example.gson

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName


/**
 *@author ZhiQiang Tu
 *@time 2023/3/29  21:53
 *@signature 或许是不知梦的缘故,流离之人追逐幻影
 *@mail  2623036785@qq.com
 */

data class SerialName(
    @SerializedName("👍")
    val a:Int,
    @SerializedName("😘")
    val b:String,
    @SerializedName("😂")
    val c:Char,
)

fun main() {
    val gson = Gson()
    println(gson.toJson(SerialName(1, "2", '3')))
}
