rootProject.name = "MintLab"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

/* (Backend / Application) */
include(":Backend:Application:MintLab")

/* (Client / Application) */
include(":Client:Platform-Android:Application:MintLab")
include(":Client:Platform-Desktop:Application:MintLab")
include(":Client:Platform-iOS:Application:MintLab")
include(":Client:Platform-Web:Application:MintLab")

/* (Client) */
include(":Client:Resource")
include(":Client:DesignSystem")

/* (Foundation) */
include(":Foundation:Model")
include(":Foundation:Kotlin")

/* (iOS wrapping module) */
include(":iosMintLab")
