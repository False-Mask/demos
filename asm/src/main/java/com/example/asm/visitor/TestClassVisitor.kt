package com.example.asm.visitor

import com.example.asm.consts.AsmApiVersion
import com.example.asm.utils.withLog
import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.Attribute
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.FieldVisitor
import org.objectweb.asm.RecordComponentVisitor
import org.objectweb.asm.TypePath

class TestClassVisitor : ClassVisitor(AsmApiVersion) {

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


    // 匿名类或局部内部类的外部类
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

    override fun visitAnnotation(descriptor: String, visible: Boolean): AnnotationVisitor {
        withLog("visitAnnotation") {

            println(
                "descriptor:$descriptor\n" +
                        "visible:$visible\n"
            )

        }
        return TestAnnotationVisitor()
    }

    override fun visitTypeAnnotation(
        typeRef: Int,
        typePath: TypePath?,
        descriptor: String?,
        visible: Boolean
    ): AnnotationVisitor {
        withLog("visitTypeAnnotation") {
            println(
                "typeRef:$typeRef\n" +
                        "typePath:${typePath}\n" +
                        "descriptor:$descriptor\n" +
                        "visible:$visible\n"
            )


        }
        return TestAnnotationVisitor()
    }

    override fun visitAttribute(attribute: Attribute) {
        withLog("visitAttribute") {
            println(attribute)
        }
        super.visitAttribute(attribute)
    }

    override fun visitNestMember(nestMember: String) {
        super.visitNestMember(nestMember)
        withLog("visitNestMember") {

            println("nestMember:$nestMember")

        }
    }

    override fun visitPermittedSubclass(permittedSubclass: String?) {
        super.visitPermittedSubclass(permittedSubclass)
        withLog("visitPermittedSubclass") {
            println("permittedSubclass:${permittedSubclass}")
        }
    }

    override fun visitInnerClass(
        name: String?,
        outerName: String?,
        innerName: String?,
        access: Int
    ) {
        withLog("visitInnerClass") {
            println(
                "name:$name\n" +
                        "outerName:$outerName\n" +
                        "innerName:$innerName\n" +
                        "access:$access\n"
            )
        }
        super.visitInnerClass(name, outerName, innerName, access)
    }

    override fun visitRecordComponent(
        name: String?,
        descriptor: String?,
        signature: String?
    ): RecordComponentVisitor? {
        withLog("visitRecordComponent") {
            println(
                "name:$name\n" +
                        "descriptor:$descriptor\n" +
                        "signature:$signature\n"
            )
        }
        return super.visitRecordComponent(name, descriptor, signature)
    }

    override fun visitField(
        access: Int,
        name: String?,
        descriptor: String?,
        signature: String?,
        value: Any?
    ): FieldVisitor? {
        withLog("visitField") {
            println(
                "access:$access\n" +
                        "name:$name\n" +
                        "descriptor:$descriptor\n" +
                        "signature:$signature\n" +
                        "value:$value"
            )
        }
        return super.visitField(access, name, descriptor, signature, value)
    }

}
