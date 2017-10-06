package com.example.gradle

import org.gradle.testkit.runner.GradleRunner
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class ExampleSharedPluginTest {

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
                id("com.example.shared-plugin")
            }

            shared {
                option = true
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