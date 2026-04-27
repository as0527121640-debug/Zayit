plugins {
    alias(libs.plugins.multiplatform)
    alias(libs.plugins.kotlinx.serialization)
    alias(libs.plugins.android.library)
}

kotlin {

    android {
        namespace = "io.github.kdroidfilter.network"
        compileSdk = 36
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
            implementation(libs.ktor.client.core)
            implementation(libs.ktor.client.content.negotiation)
            implementation(libs.ktor.client.logging)
            implementation(libs.ktor.client.serialization)
            implementation(libs.ktor.serialization.json)
        }

        jvmMain.dependencies {
            implementation(libs.ktor.client.cio)
            implementation(libs.nucleus.native.ssl)
            implementation(libs.nucleus.native.http.ktor)
        }

        androidMain.dependencies {
            implementation(libs.ktor.client.okhttp)
        }
    }
}
