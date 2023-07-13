package com.example.gson

import com.google.gson.GsonBuilder


/**
 *@author ZhiQiang Tu
 *@time 2023/3/29  19:45
 *@signature There are no stars in the hills.
 *@mail  2623036785@qq.com
 */

fun main() {
    val gson = GsonBuilder().enableComplexMapKeySerialization().create()
    val complexMap: MutableMap<PersonName, Int> = LinkedHashMap()
    complexMap[PersonName("John", "Doe")] = 30
    complexMap[PersonName("Jane", "Doe")] = 35

    val json = gson.toJson(complexMap)
    println(json)



}

class PersonName(
    var firstName: String,
    var lastName: String
)

