package com.example.gson

import com.google.gson.*
import java.lang.reflect.Type


/**
 *@author ZhiQiang Tu
 *@time 2023/3/29  20:46
 *@signature There are no stars in the hills.
 *@mail  2623036785@qq.com
 */

fun main() {
    val gson = GsonBuilder()
        .registerTypeAdapter(MyType::class.java, MySerializer())
        .registerTypeAdapter(MyType::class.java, MyDeserializer())
        .create()


    val mt = MyType(1, 1)

    val json = gson.toJson(mt)
    println(json)

    println(gson.fromJson(json, MyType::class.java))

}

class MySerializer : JsonSerializer<MyType> {
    override fun serialize(
        src: MyType,
        typeOfSrc: Type,
        context: JsonSerializationContext
    ): JsonElement {

        return JsonObject().apply {
            addProperty("aa", src.a)
            addProperty("bb", src.b)
        }

    }

}

class MyDeserializer : JsonDeserializer<MyType> {
    override fun deserialize(
        json: JsonElement,
        typeOfT: Type,
        context: JsonDeserializationContext
    ): MyType {

        val obj = json.asJsonObject
        return MyType(obj["aa"].asInt, obj["bb"].asInt)

    }

}

data class MyType(
    val a: Int,
    val b: Int,
)