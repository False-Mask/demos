package com.example.asm.visitor

import com.example.asm.consts.AsmApiVersion
import com.example.asm.utils.withLog
import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.Attribute
import org.objectweb.asm.Handle
import org.objectweb.asm.Label
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes
import org.objectweb.asm.TypePath

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

    override fun visitMethodInsn(
        opcode: Int,
        owner: String?,
        name: String?,
        descriptor: String?,
        isInterface: Boolean
    ) {
        withLog("visitMethodInsn") {
            println("opcode:$opcode\n" +
            "owner:$owner\n" +
            "name:$name\n" +
            "descriptor:$descriptor\n" +
            "isInterface:$isInterface")
        }
        super.visitMethodInsn(opcode, owner, name, descriptor, isInterface)
    }

    override fun visitInvokeDynamicInsn(
        name: String?,
        descriptor: String?,
        bootstrapMethodHandle: Handle?,
        vararg bootstrapMethodArguments: Any?
    ) {
        withLog("visitInvokeDynamicInsn") {
            println("name:$name\n" +
            "descriptor:$descriptor\n" +
            "bootstrapMethodHandle:$bootstrapMethodHandle\n" +
            "bootstrapMethodArguments:${bootstrapMethodArguments.contentToString()}")
        }
        super.visitInvokeDynamicInsn(
            name,
            descriptor,
            bootstrapMethodHandle,
            *bootstrapMethodArguments
        )
    }

    override fun visitJumpInsn(opcode: Int, label: Label?) {
        withLog("visitJumpInsn") {
            println("opcode:$opcode\n" +
            "label:{info:${label!!.info}}")
        }
        super.visitJumpInsn(opcode, label)
    }

    override fun visitLabel(label: Label?) {
        withLog("visitLabel") {
            println("info:${label!!.info}")
        }
        super.visitLabel(label)
    }

    override fun visitLdcInsn(value: Any?) {
        withLog("visitLdcInsn") {
            println("value:$value")
        }
        super.visitLdcInsn(value)
    }

    override fun visitIincInsn(varIndex: Int, increment: Int) {
        withLog("visitIincInsn") {
            println("varIndex:$varIndex\n" +
            "increment:$increment")
        }
        super.visitIincInsn(varIndex, increment)
    }

    override fun visitTableSwitchInsn(min: Int, max: Int, dflt: Label?, vararg labels: Label?) {
        withLog("visitTableSwitchInsn") {
            println("min:$min\n" +
            "max:$max\n" +
            "dflt:{info:${dflt!!.info}}" +
            "labels:$labels")
        }
        super.visitTableSwitchInsn(min, max, dflt, *labels)
    }


    override fun visitLookupSwitchInsn(dflt: Label?, keys: IntArray?, labels: Array<out Label>?) {
        withLog("visitLookupSwitchInsn") {
            println("dflt:$dflt\n" +
            "keys:${keys.contentToString()}\n" +
            "labels:${labels.contentToString()}")
        }
        super.visitLookupSwitchInsn(dflt, keys, labels)
    }

    override fun visitMultiANewArrayInsn(descriptor: String?, numDimensions: Int) {
        withLog("visitMultiANewArrayInsn") {
            println("descriptor:$descriptor\n" +
            "numDimensions:$numDimensions")
        }
        super.visitMultiANewArrayInsn(descriptor, numDimensions)
    }

    override fun visitInsnAnnotation(
        typeRef: Int,
        typePath: TypePath?,
        descriptor: String?,
        visible: Boolean
    ): AnnotationVisitor? {
        withLog("visitInsnAnnotation") {
            println("typeRef:$typeRef\n" +
            "typePath:$typePath\n" +
            "descriptor:$descriptor\n" +
            "visible:$visible")
        }
        return super.visitInsnAnnotation(typeRef, typePath, descriptor, visible)
    }

    override fun visitTryCatchBlock(start: Label?, end: Label?, handler: Label?, type: String?) {
        withLog("visitTryCatchBlock") {
            println("start:$start\n" +
                    "end:$end\n" +
                    "handler:$handler\n" +
                    "type:$type")
        }
        super.visitTryCatchBlock(start, end, handler, type)
    }

    override fun visitTryCatchAnnotation(
        typeRef: Int,
        typePath: TypePath?,
        descriptor: String?,
        visible: Boolean
    ): AnnotationVisitor? {
        withLog("visitTryCatchAnnotation") {
            println("typeRef:$typeRef\n" +
            "typePath:$typePath\n" +
            "descriptor:$descriptor\n" +
            "visible:$visible")
        }
        return super.visitTryCatchAnnotation(typeRef, typePath, descriptor, visible)
    }

    override fun visitLocalVariable(
        name: String?,
        descriptor: String?,
        signature: String?,
        start: Label?,
        end: Label?,
        index: Int
    ) {
        withLog("visitLocalVariable") {
            println("name:$name\n" +
            "descriptor:$descriptor\n" +
            "signature:$signature\n" +
            "start:$start\n" +
            "end:$end\n" +
            "index:$index")
        }
        super.visitLocalVariable(name, descriptor, signature, start, end, index)
    }

    override fun visitLocalVariableAnnotation(
        typeRef: Int,
        typePath: TypePath?,
        start: Array<out Label>?,
        end: Array<out Label>?,
        index: IntArray?,
        descriptor: String?,
        visible: Boolean
    ): AnnotationVisitor? {
        withLog("visitLocalVariableAnnotation") {
            println("typeRef:$typeRef\n" +
                    "typePath:$typePath\n" +
                    "start:${start.contentToString()}\n" +
                    "end:${end.contentToString()}\n" +
                    "descriptor:$descriptor\n" +
                    "visible:$visible")
        }
        return super.visitLocalVariableAnnotation(
            typeRef,
            typePath,
            start,
            end,
            index,
            descriptor,
            visible
        )
    }

    override fun visitLineNumber(line: Int, start: Label?) {
        withLog("visitLineNumber") {
            println("line:$line\n" +
            "start:$start")
            println("info:${start!!.info}")
        }
        super.visitLineNumber(line, start)
    }

}