
pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if(requested.id.id == "com.example.shared-plugin") {
                useModule("com.example:shared-plugins:1.0")
            }
            if(requested.id.id == "com.example.local-plugin") {
                useModule("com.example:local-plugins:1.0")
            }
        }
    }
}

includeBuild("gradle/plugins")
includeBuild("../shared-plugins")

include("core", "cli")

rootProject.name = "main-build"
