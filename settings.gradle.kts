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

/** (Backend / Application) */
include(":Backend:Application:MintLab")

/** (Frontend / Application) */
include(":Frontend-Android:Application:MintLab")
include(":Frontend-Desktop:Application:MintLab")
include(":Frontend-iOS:Application:MintLab")
include(":Frontend-Web:Application:MintLab")

/** (Frontend) */
include(":Frontend:Resource")
include(":Frontend:Design")

/** (Core) */
include(":Core:Kotlin")

/** (iOS wrapping module) */
include(":wrapSwiftKotlinMintLab")
