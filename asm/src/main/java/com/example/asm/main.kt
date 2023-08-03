package com.example.asm

import com.example.asm.annotation.AnnotationTest
import com.example.asm.annotation.VisitTypeAnnotationTest
import com.example.asm.attribtute.VisitAttributeTest
import com.example.asm.clz.A
import com.example.asm.utils.withVisitor

fun main() {

    // testVisitNest()

    // testVisitOuterClass()

    // testVisitAnnotation()

    // testVisitTypeAnnotation()

    visitAttribute()
}

fun visitAttribute() {

    withVisitor {

        VisitAttributeTest::class.java.name

    }

}

fun testVisitTypeAnnotation() {

    withVisitor {
        VisitTypeAnnotationTest::class.java.name
    }

}

fun testVisitAnnotation() {

    withVisitor {
        val an = AnnotationTest::class.java.name
        an
    }

}

fun testVisitOuterClass() {

    withVisitor {
        val an = "com.example.asm.clz.A\$B\$C\$D\$1"
        val tempClass = "com.example.asm.clz.A\$B\$C\$D\$1E"
        tempClass
    }

}

fun testVisitNest() {

    withVisitor {
        val a = A::class.java.name
        val b = A.B::class.java.name
        val c = A.B.C::class.java.name
        val d = A.B.C.D::class.java.name
        val an = "com.example.asm.clz.A\$B\$C\$D\$1"
        val tempClass = "com.example.asm.clz.A\$B\$C\$D\$1E"
        a
    }


}
