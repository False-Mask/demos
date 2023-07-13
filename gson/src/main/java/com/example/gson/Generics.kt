package com.example.gson

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


/**
 *@author ZhiQiang Tu
 *@time 2023/3/29  20:13
 *@signature 或许是不知梦的缘故,流离之人追逐幻影
 *@mail  2623036785@qq.com
 */

class Foo<T>(
    val data: T?
)

data class Bar(
    val a: Int,
    val b: Int
)

fun main() {


    val gson = Gson()
    val foo: Foo<Bar> = Foo<Bar>(Bar(1,1))
    println(gson.toJson(foo,foo::class.java))// 由于gson不知道Foo<Bar>的结构，所以序列化会失效
    println(gson.toJson(foo, object : TypeToken<Foo<Bar>>() {}.type))


}
