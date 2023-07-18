package com.example.asm

import org.objectweb.asm.ClassReader

fun main() {

    val cv = TestClassVisitor()
    val inner = A.B.C.D::class.java.name
    val local = "com.example.asm.A\$B\$C\$D\$1E"
    val anonimous = "com.example.asm.A\$B\$C\$D\$1"
    val cr = ClassReader(anonimous)
    cr.accept(cv, 0)

}