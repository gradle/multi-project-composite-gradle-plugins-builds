plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

group = "com.example"
version = "1.0"

gradlePlugin {
    (plugins) {
        "local" {
            id = "com.example.local-plugin"
            implementationClass = "com.example.gradle.ExampleLocalPlugin"
        }
    }
}

dependencies {
    compileOnly(gradleApi())
}
