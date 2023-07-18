package com.example.asm

import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.Opcodes

class TestClassVisitor : ClassVisitor(Opcodes.ASM9) {

    // 文件基本信息
    override fun visit(
        version: Int, // 字节码版本号
        access: Int, // 访问修饰符
        name: String, // 类名称
        signature: String?, // 泛型签名
        superName: String, // 父类
        interfaces: Array<out String> // 实现的接口
    ) {
        super.visit(version, access, name, signature, superName, interfaces)
        withLog("visit") {

            println(
                "version:v$version\n" +
                        "access:$access\n" +
                        "name:$name\n" +
                        "signature:$signature\n" +
                        "superName:$superName\n" +
                        "interfaces:${interfaces.contentToString()}"
            )

        }
    }

    // 源文件名称
    override fun visitSource(source: String, debug: String?) {
        super.visitSource(source, debug)
        withLog("visitSource") {
            println(
                "source:$source\n" +
                        "debug:$debug"
            )
        }
    }

    // 内部类的最外层类
    override fun visitNestHost(nestHost: String) {
        super.visitNestHost(nestHost)
        withLog("visitNestHost") {
            println("nestHost:$nestHost")
        }
    }


    override fun visitOuterClass(owner: String, name: String, descriptor: String) {
        super.visitOuterClass(owner, name, descriptor)
        withLog("visitOuterClass") {
            println(
                "owner:$owner\n" +
                        "name:$name\n" +
                        "descriptor:$descriptor"
            )
        }
    }


}
