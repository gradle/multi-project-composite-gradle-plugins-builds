plugins {
    id("com.example.local-plugin")
    id("com.example.shared-plugin")
}

local {
    parameter = true
}

shared {
    option = true
}
