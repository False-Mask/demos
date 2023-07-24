package com.example.asm.visitor

import com.example.asm.consts.AsmApiVersion
import com.example.asm.utils.withLog
import org.objectweb.asm.AnnotationVisitor

class TestAnnotationVisitor : AnnotationVisitor(AsmApiVersion) {

    override fun visit(name: String?, value: Any?) {
        super.visit(name, value)
        withLog("AnnotationVisitor.visit") {
            println(
                "name:$name\n" +
                        "value:$value"
            )
        }
    }

    override fun visitEnum(name: String, descriptor: String, value: String) {
        super.visitEnum(name, descriptor, value)
        withLog("AnnotationVisitor.visitEnum") {
            println(
                "name:$name\n" +
                        "descriptor:$descriptor\n" +
                        "value:$value"
            )
        }
    }

    override fun visitArray(name: String): AnnotationVisitor {
        withLog("AnnotationVisitor.visitArray") {
            println("name:$name")
        }
        return this
    }

    override fun visitAnnotation(name: String, descriptor: String): AnnotationVisitor {
        withLog("AnnotationVisitor.visitAnnotation") {
            println(
                "name:$name\n" +
                        "descriptor:$descriptor\n"
            )
        }
        return this
    }

    override fun visitEnd() {
        super.visitEnd()

        withLog("AnnotationVisitor.visitEnd") {

            println("end..")

        }
    }

}