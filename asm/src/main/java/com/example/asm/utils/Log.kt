package com.example.asm.utils

fun withLog(tag: String, block: () -> Unit) {

    println()
    println("==== begin of $tag ====")

    block()

    println("==== end of $tag ====")
    println()
}