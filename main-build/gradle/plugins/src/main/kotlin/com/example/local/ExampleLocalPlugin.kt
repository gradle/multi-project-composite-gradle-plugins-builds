package com.example.local

import org.gradle.api.*

open class LocalExtension {
    var parameter = false
}

open class ExampleLocalPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.extensions.create("local", LocalExtension::class.java)
    }
}
