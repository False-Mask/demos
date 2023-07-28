package com.example.asm

import com.example.asm.annotation.TypeAnnotationTest
import com.example.asm.clz.A
import com.example.asm.visitor.TestClassVisitor
import org.objectweb.asm.ClassReader

fun main() {

    val cv = TestClassVisitor()
    val inner = A.B.C.D::class.java
    val local = "com.example.asm.clz.A\$B\$C\$D\$1E"
    val anonimous = "com.example.asm.clz.A\$B\$C\$D\$1"
    val annotationBaseTest = "com.example.asm.annotation.AnnotationTest"

    val typeAnnotationTest = TypeAnnotationTest::class.java.name

    val nestMember = A::class.java.name


    val cr = ClassReader(nestMember)
    cr.accept(cv, 0)

}