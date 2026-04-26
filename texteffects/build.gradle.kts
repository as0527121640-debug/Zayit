plugins {
    alias(libs.plugins.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.compose)
    alias(libs.plugins.android.library)
}

kotlin {
    androidLibrary {
        namespace = "io.github.kdroidfilter.texteffects"
        compileSdk = 35
        minSdk = 21
    }

    jvm()

    sourceSets {
        commonMain.dependencies {
            implementation(libs.compose.runtime)
            implementation(libs.compose.foundation)
        }

        jvmMain.dependencies {
        }
    }
}
