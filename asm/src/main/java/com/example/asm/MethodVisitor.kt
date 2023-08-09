package com.example.asm

import com.example.asm.clz.VisitDefaultMethod
import com.example.asm.clz.VisitMethodParamCount
import com.example.asm.clz.VisitMethodParameter
import com.example.asm.clz.VisitParamAnnTest
import com.example.asm.utils.withClassVisitor

fun main() {

    // visitParameter()

    // visitDefault()

    // visitParamCount()

    // visitParamAnn()
}

fun visitParamAnn() {

    withClassVisitor {
        VisitParamAnnTest::class.java.name
    }

}

fun visitParamCount() {

    withClassVisitor {
        VisitMethodParamCount::class.java.name
    }

}

fun visitDefault() {

    withClassVisitor {
        VisitDefaultMethod::class.java.name
    }

}

fun visitParameter() {

    withClassVisitor {
        VisitMethodParameter::class.java.name
    }

}
