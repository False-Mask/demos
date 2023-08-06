package com.example.asm.visitor

import com.example.asm.consts.AsmApiVersion
import com.example.asm.utils.withLog
import org.objectweb.asm.MethodVisitor

class TestMethodVisitor(
    access: Int,
    name: String?,
    descriptor: String?,
    signature: String?,
    exceptions: Array<out String>?
) : MethodVisitor(AsmApiVersion) {

    override fun visitParameter(name: String?, access: Int) {
        super.visitParameter(name, access)
        withLog("visitParameter") {
            println("name:$name\naccess:$access")
        }
    }

}