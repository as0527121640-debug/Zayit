plugins {
    alias(libs.plugins.multiplatform)
    alias(libs.plugins.kotlinx.serialization)
    alias(libs.plugins.android.library)
}

kotlin {

    android {
        namespace = "io.github.kdroidfilter.logger"
        compileSdk = 35
        minSdk = 21
    }

    jvm()
    jvmToolchain(
        libs.versions.jvmToolchain
            .get()
            .toInt(),
    )

    sourceSets {
        commonMain.dependencies {
        }

        jvmMain.dependencies {
            implementation(libs.sentry.core)
        }

        androidMain.dependencies {
            implementation(libs.sentry.android)
        }
    }
}
