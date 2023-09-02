package com.example.asm.visitor

import com.example.asm.consts.AsmApiVersion
import com.example.asm.utils.withLog
import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.Attribute
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes

class TestMethodVisitor(
    access: Int,
    name: String?,
    descriptor: String?,
    signature: String?,
    exceptions: Array<out String>?
) : MethodVisitor(AsmApiVersion) {

    override fun visitAnnotation(descriptor: String?, visible: Boolean): AnnotationVisitor? {
        return super.visitAnnotation(descriptor, visible)
    }

    override fun visitAttribute(attribute: Attribute?) {
        super.visitAttribute(attribute)
    }

    override fun visitParameter(name: String?, access: Int) {
        super.visitParameter(name, access)
        withLog("visitParameter") {
            println("name:$name\naccess:$access")
        }
    }

    override fun visitAnnotationDefault(): AnnotationVisitor? {
        withLog("visitAnnotationDefault") {
        }
        return TestAnnotationVisitor()
    }

    override fun visitAnnotableParameterCount(parameterCount: Int, visible: Boolean) {
        super.visitAnnotableParameterCount(parameterCount, visible)
        withLog("visitAnnotableParameterCount") {
            println("parameterCount:$parameterCount\nvisible:$visible")
        }
    }

    override fun visitParameterAnnotation(
        parameter: Int,
        descriptor: String?,
        visible: Boolean
    ): AnnotationVisitor? {
        withLog("visitParameterAnnotation") {
            println("parameter:$parameter\n" +
                    "descriptor:$descriptor\n" +
                    "visible:$visible")
        }
        return super.visitParameterAnnotation(parameter, descriptor, visible)
    }


    override fun visitCode() {
        super.visitCode()
    }


    override fun visitInsn(opcode: Int) {
        withLog("visitInsn") {
            println("opcode:$opcode")
        }
        super.visitInsn(opcode)
    }

    override fun visitIntInsn(opcode: Int, operand: Int) {
        withLog("visitIntInsn") {
            println("opcode:$opcode\n" +
            "operand:$operand")
        }
        super.visitIntInsn(opcode, operand)
    }

    override fun visitVarInsn(opcode: Int, varIndex: Int) {
        withLog("visitVarInsn") {
            val code = if (opcode == Opcodes.ILOAD) {
                "ILoad"
            } else if(opcode == Opcodes.ISTORE) {
                "IStore"
            } else {
                ""
            }

            println("opcode:$code\n" +
            "varIndex:$varIndex")
        }
        super.visitVarInsn(opcode, varIndex)
    }

    override fun visitTypeInsn(opcode: Int, type: String?) {
        withLog("visitTypeInsn") {
            println("opcodes:$opcode\n" +
                    "type:$type")
        }
        super.visitTypeInsn(opcode, type)
    }

    override fun visitFieldInsn(opcode: Int, owner: String?, name: String?, descriptor: String?) {
        withLog("visitFieldInsn") {
            println("opcod:$opcode\n" +
            "owner:$owner\n" +
            "name:$name\n" +
            "descriptor:$descriptor")
        }
        super.visitFieldInsn(opcode, owner, name, descriptor)
    }


}