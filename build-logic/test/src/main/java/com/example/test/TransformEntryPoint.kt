package com.example.test

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.logging.LogLevel

class TransformEntryPoint : Plugin<Project> {

    private lateinit var project: Project

    override fun apply(target: Project) {

        this.project = target

        withLog(target) {



        }

    }

    private fun withLog(target: Project, function: () -> Unit) {
        target.logger.log(LogLevel.ERROR, "Transform begin")
        function()
        target.logger.log(LogLevel.ERROR, "Transform end")
    }
}