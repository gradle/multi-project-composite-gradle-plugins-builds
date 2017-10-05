package com.example.gradle

import org.gradle.api.*

open class SharedExtension {
    var option = false
}

open class ExampleSharedPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.extensions.create("shared", SharedExtension::class.java)
    }
}
