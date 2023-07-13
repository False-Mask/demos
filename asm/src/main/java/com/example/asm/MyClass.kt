package com.example.asm

import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes

fun main() {

    val cw = ClassWriter(0)

    val cr = ClassReader("java.lang.Object")
    val cv = object : ClassVisitor(Opcodes.ASM4, cw) {
        override fun visitSource(source: String, debug: String?) {
            println("$source:$debug")
            super.visitSource(source, debug)
        }



    }
    cr.accept(cv, 0)

}