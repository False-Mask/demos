package com.example.gson

import com.google.gson.Gson


/**
 *@author ZhiQiang Tu
 *@time 2023/3/29  20:35
 *@signature 或许是不知梦的缘故,流离之人追逐幻影
 *@mail  2623036785@qq.com
 */

fun main() {
    val collection: MutableCollection<Any> = ArrayList<Any>()
    collection.add("hello")
    collection.add(5)
    collection.add(Event("GREETINGS", "guest"))
    val g = Gson()
    println(g.toJson(collection))

}

class Event constructor(
    private val name: String,
    private val source: String
)
