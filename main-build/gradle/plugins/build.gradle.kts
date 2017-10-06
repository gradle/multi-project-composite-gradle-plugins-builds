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
            implementationClass = "com.example.local.ExampleLocalPlugin"
        }
    }
}

dependencies {
    compileOnly(gradleApi())

    testImplementation(gradleTestKit())
    testImplementation("junit:junit:4.12")
}

repositories {
    jcenter()
}
