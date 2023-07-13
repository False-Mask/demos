package com.example.okio

import okio.*
import okio.ByteString.Companion.toByteString
import okio.Path.Companion.toPath
import java.io.File
import java.net.Socket
import java.util.concurrent.TimeUnit


/**
 *@author ZhiQiang Tu
 *@time 2023/4/1  15:29
 *@signature 或许是不知梦的缘故,流离之人追逐幻影
 *@mail  2623036785@qq.com
 */

fun main() {

    val source = File("okio/test.txt")
        .inputStream()
        .buffered()
        .source()
        .buffer()
        .apply {
            timeout().deadline(1,TimeUnit.NANOSECONDS)
        }



    val read = source.read(ByteArray(1024))
    println(read)

}

fun sink() {


}


fun buffer() {

    val b = Buffer()
    b.timeout().timeout(1, TimeUnit.NANOSECONDS)
    val ba = ByteArray(1024)
    b.write("hello".toByteArray().toByteString())
    val len = b.read(ba)
    println(String(ba, 0, len))


}

fun byteString() {

    val m = "Hello".toByteArray().toByteString()
    println(m.base64())
    println(m.sha256().hex())
    println(m.base64Url())
    println(m.md5().hex())
    println(m.sha1().hex())
    println(m.sha512().hex())

}

fun fromNet() {

    Socket("127.0.0.1", 7899)
        .source()
        .buffer()
        .gzip()

}

fun fromFile() {
    val source = FileSystem.SYSTEM.source("okio/test.txt".toPath())
        .buffer()
        .apply {
            timeout().timeout(1, TimeUnit.NANOSECONDS)
        }

    val arr = ByteArray(1024)

    while (!source.exhausted()) {
        val len = source.read(arr)
        println(String(arr, 0, len))
    }
}
