package com.example.gson

import com.google.gson.Gson





/**
 *@author ZhiQiang Tu
 *@time 2023/3/29  19:37
 *@signature 或许是不知梦的缘故,流离之人追逐幻影
 *@mail  2623036785@qq.com
 */

fun main() {
    val gson = Gson()
    val stringMap: MutableMap<String?, String> = LinkedHashMap()
    stringMap["key"] = "value"
    stringMap[null] = "null-entry"
    var json = gson.toJson(stringMap) // ==> json is {"key":"value","null":"null-entry"}
    println(json)

    val intMap: MutableMap<Int, Int> = LinkedHashMap()
    intMap[2] = 4
    intMap[3] = 6
    json = gson.toJson(intMap) // ==> json is {"2":4,"3":6}
    println(json)


}

