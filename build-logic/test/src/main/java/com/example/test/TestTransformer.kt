package com.example.test

import com.android.build.api.transform.Context
import com.android.build.api.transform.Format
import com.android.build.api.transform.QualifiedContent
import com.android.build.api.transform.QualifiedContent.DefaultContentType
import com.android.build.api.transform.Transform
import com.android.build.api.transform.TransformInput
import com.android.build.api.transform.TransformOutputProvider
import com.android.build.api.variant.VariantInfo
import java.nio.file.Files
import java.nio.file.StandardCopyOption


object TestTransformer : Transform() {

    private val NAME = "TestTransformer"

    private val INPUT = mutableSetOf<QualifiedContent.ContentType>(
        DefaultContentType.CLASSES,
    )

    private val SCOPE = mutableSetOf<QualifiedContent.Scope>(
        QualifiedContent.Scope.PROJECT,
    )

    private val INCREMENTAL = true

    override fun getName(): String = NAME

    override fun getInputTypes(): MutableSet<QualifiedContent.ContentType> = INPUT

    override fun getScopes(): MutableSet<in QualifiedContent.Scope> = SCOPE

    override fun isIncremental(): Boolean = INCREMENTAL

    override fun applyToVariant(variant: VariantInfo): Boolean {
//        println("buildTypeName:" + variant.buildTypeName)
//        println("fullVariantName:" + variant.fullVariantName)
//        println("isDebuggable:" + variant.isDebuggable)
//        println("isTest:" + variant.isTest)
        return super.applyToVariant(variant)
    }


    override fun transform(
        context: Context,
        inputs: MutableCollection<TransformInput>,
        referencedInputs: MutableCollection<TransformInput>,
        outputProvider: TransformOutputProvider,
        isIncremental: Boolean
    ) {
        println("AAAA")

        inputs.forEach {

            it.jarInputs
                .forEach { i ->

                    val d = outputProvider.getContentLocation(
                        i.name,
                        i.contentTypes,
                        i.scopes,
                        Format.JAR
                    )

                    Files.copy(i.file.toPath(), d.toPath(), StandardCopyOption.REPLACE_EXISTING)


                }

            it.directoryInputs
                .forEach { i ->

                    val d = outputProvider.getContentLocation(
                        i.name,
                        i.contentTypes,
                        i.scopes,
                        Format.DIRECTORY
                    )

                    Files.move(i.file.toPath(), d.toPath(), StandardCopyOption.REPLACE_EXISTING)


                }


        }


        super.transform(context, inputs, referencedInputs, outputProvider, isIncremental)
    }

}