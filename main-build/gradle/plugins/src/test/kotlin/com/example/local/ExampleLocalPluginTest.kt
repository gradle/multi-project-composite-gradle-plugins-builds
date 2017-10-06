package com.example.local

import org.gradle.testkit.runner.GradleRunner
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class ExampleLocalPluginTest {

    @JvmField
    @Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `integration test`() {

        // given
        temporaryFolder.newFile("settings.gradle").writeText("rootProject.name = \"root\"")
        // TODO:pm see why this fails when using the Kotlin DSL
        temporaryFolder.newFile("build.gradle").writeText("""

            plugins {
                id("com.example.local-plugin")
            }

            local {
                parameter = true
            }

        """)

        // expect
        GradleRunner.create()
                .withProjectDir(temporaryFolder.root)
                .withPluginClasspath()
                .withArguments("help")
                .build()
    }
}