package com.example.asm

import com.example.asm.clz.VisitMethodParameter
import com.example.asm.utils.withClassVisitor

fun main() {

    visitParameter()


}

fun visitParameter() {

    withClassVisitor {
        VisitMethodParameter::class.java.name
    }

}
