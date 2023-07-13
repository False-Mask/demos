package com.example.okio

import okio.buffer
import okio.sink
import java.io.File

fun main() {

    File("buffer.txt")
        .sink()
        .buffer()
        .use {
            it.write("abcdefghijklmn".toByteArray())
        }


}