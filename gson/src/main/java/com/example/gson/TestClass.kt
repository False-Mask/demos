package com.example.gson

//
//fun main() {
//    val sw = StringWriter()
//
//    val gson = Gson()
////    val toJson = gson.toJson(Test(1, 2, "3", A(114514, "臭啊")))
//
//    val toJson = gson.toJson(GenericsData<Test>(Test(1, 2, "3", A(114514, "臭啊")), 1))
//
//    println(object : TypeToken<InternalError>() {}.rawType)
//
//    println(toJson.toString())
//}
//
//class GenericsData<Data>(
//    val data: Data,
//    val info: Int
//) {
//
//}
//val x = """
//    {
//    "data":bean1
//    }
//
//"""
//
//val erorr = """
//    {
//    "data": bean2
//    }
//""".trimIndent()
//
//data class Test(
//    @Transient
//    val `hello world this is`: Int,
//    val y: Int,
//    val z: String,
//    val a: A
//)
//
//data class A(
//    val a: Int,
//    val b: String,
//)