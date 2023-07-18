package com.example.asm

fun withLog(tag: String, block: () -> Unit) {

    println()
    println("==== begin of $tag ====")

    block()

    println("==== end of $tag ====")
    println()
}