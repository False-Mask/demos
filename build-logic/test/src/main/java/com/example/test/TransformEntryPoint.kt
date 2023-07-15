package com.example.test

import com.android.build.gradle.BaseExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.logging.LogLevel
import org.gradle.kotlin.dsl.get

class TransformEntryPoint : Plugin<Project> {

    private lateinit var project: Project

    private val PLUGIN = "com.android.application"
    private val PLUGIN_LIBRARY = "com.android.library"

    override fun apply(target: Project) {

        this.project = target

//        project.afterEvaluate {
//
//
//        }

        withLog(target) {

            if (project.plugins.hasPlugin(PLUGIN) || project.plugins.hasPlugin(PLUGIN_LIBRARY)) {

                val ext = project.extensions["android"] as BaseExtension
                println(ext.transforms)
                ext.registerTransform(TestTransformer)


            }


        }

    }

    private fun withLog(target: Project, function: () -> Unit) {
        target.logger.log(LogLevel.ERROR, "Transform begin")
        function()
        target.logger.log(LogLevel.ERROR, "Transform end")
    }
}