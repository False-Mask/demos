package com.example.asm.utils

import com.example.asm.visitor.TestClassVisitor
import org.objectweb.asm.ClassReader

fun withLog(tag: String, block: () -> Unit) {

    println()
    println("==== begin of $tag ====")

    block()

    println("==== end of $tag ====")
    println()
}

fun withVisitor(block: () -> String) {

    val cv = TestClassVisitor()
    ClassReader(block()).accept(cv , 0)

}