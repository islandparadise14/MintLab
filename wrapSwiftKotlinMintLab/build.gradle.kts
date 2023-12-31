import org.jetbrains.compose.ExperimentalComposeLibrary

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    
    alias(libs.plugins.jetbrainsCompose)
}

kotlin {
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "wrapSwiftKotlinMintLab"
            isStatic = true
        }
    }
    
    sourceSets {
        val commonMain by getting {
            resources.setSrcDirs(
                listOf(
                    "${project(":Frontend-iOS:Application:MintLab").projectDir}/src/commonMain/resources"
                )
            )
        }
        
        commonMain.dependencies {
            implementation(project(":Frontend-iOS:Application:MintLab"))

            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material)
            implementation(compose.ui)
            @OptIn(ExperimentalComposeLibrary::class)
            implementation(compose.components.resources)
        }
    }
}


