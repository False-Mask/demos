package com.example.asm

import com.example.asm.annotation.AnnotationTest
import com.example.asm.annotation.VisitTypeAnnotationTest
import com.example.asm.attribtute.VisitAttributeTest
import com.example.asm.clz.A
import com.example.asm.clz.VisitFieldInsnTest
import com.example.asm.clz.VisitFieldTest
import com.example.asm.clz.VisitIincInsnTest
import com.example.asm.clz.VisitInnerClassTest
import com.example.asm.clz.VisitIntInsn
import com.example.asm.clz.VisitInvokeDynamicTest
import com.example.asm.clz.VisitJumpInsnTest
import com.example.asm.clz.VisitMethodInsnTest
import com.example.asm.clz.VisitMethodTest
import com.example.asm.clz.VisitNestMemberTest
import com.example.asm.clz.VisitPermittedSubClassTest
import com.example.asm.clz.VisitRecordComponentTest
import com.example.asm.clz.VisitTableSwitchTest
import com.example.asm.clz.VisitTypeInsnTest
import com.example.asm.clz.VisitVarInsnTest
import com.example.asm.utils.withClassVisitor

fun main() {

    // testVisitNest()

    // testVisitOuterClass()

    // testVisitAnnotation()

    // testVisitTypeAnnotation()

    // visitAttribute()

    // visitNestMember()

    // visitPermittedSubclass()

    // visitInnerClass()

    // visitRecordComponent()

    // visitField()

    // visitMethod()

    // visitIntInsn()

    // visitVarInsn()

    // visitTypeInsn()

    // visitFieldInsn()

    // visitMethodInsn()

    // visitInvokeDynamicInsn()

    // visitJumpInsn()

    // visitIinsn()

    visitTableSwitchTest()
}

fun visitTableSwitchTest() {
    withClassVisitor {
        VisitTableSwitchTest::class.java.name
    }
}

fun visitIinsn() {
    withClassVisitor {
        VisitIincInsnTest::class.java.name
    }
}

fun visitJumpInsn() {
    withClassVisitor {
        VisitJumpInsnTest::class.java.name
    }
}

fun visitInvokeDynamicInsn() {
    withClassVisitor {
        VisitInvokeDynamicTest::class.java.name
    }
}

fun visitMethodInsn() {

    withClassVisitor {

        VisitMethodInsnTest::class.java.name

    }

}

fun visitFieldInsn() {

    withClassVisitor {
        VisitFieldInsnTest::class.java.name
    }

}

fun visitTypeInsn() {

    withClassVisitor {
        VisitTypeInsnTest::class.java.name
    }

}

fun visitVarInsn() {

    withClassVisitor {
        VisitVarInsnTest::class.java.name
    }

}

fun visitIntInsn() {

    withClassVisitor {
        VisitIntInsn::class.java.name
    }

}

fun visitMethod() {

    withClassVisitor {
        VisitMethodTest::class.java.name
    }

}

fun visitField() {

    withClassVisitor {
        VisitFieldTest::class.java.name
    }

}

fun visitRecordComponent() {

    withClassVisitor {
        VisitRecordComponentTest::class.java.name
    }

}

fun visitInnerClass() {

    withClassVisitor {

        VisitInnerClassTest::class.java.name

    }

}

fun visitPermittedSubclass() {

    withClassVisitor {

        VisitPermittedSubClassTest::class.java.name

    }

}

fun visitNestMember() {

    withClassVisitor {

        VisitNestMemberTest::class.java.name

    }

}

fun visitAttribute() {

    withClassVisitor {

        VisitAttributeTest::class.java.name

    }

}

fun testVisitTypeAnnotation() {

    withClassVisitor {
        VisitTypeAnnotationTest::class.java.name
    }

}

fun testVisitAnnotation() {

    withClassVisitor {
        val an = AnnotationTest::class.java.name
        an
    }

}

fun testVisitOuterClass() {

    withClassVisitor {
        val an = "com.example.asm.clz.A\$B\$C\$D\$1"
        val tempClass = "com.example.asm.clz.A\$B\$C\$D\$1E"
        tempClass
    }

}

fun testVisitNest() {

    withClassVisitor {
        val a = A::class.java.name
        val b = A.B::class.java.name
        val c = A.B.C::class.java.name
        val d = A.B.C.D::class.java.name
        val an = "com.example.asm.clz.A\$B\$C\$D\$1"
        val tempClass = "com.example.asm.clz.A\$B\$C\$D\$1E"
        a
    }


}
