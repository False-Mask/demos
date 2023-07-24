package com.example.asm.annotation.anno

@Target(AnnotationTarget.TYPE_PARAMETER)
annotation class TypeAnnotation(
    val a: Int = 1,
    val b: String = "1"
)
