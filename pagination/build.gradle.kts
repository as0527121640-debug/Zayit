import org.jetbrains.compose.reload.gradle.ComposeHotRun

plugins {
    alias(libs.plugins.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.compose)
    alias(libs.plugins.kotlinx.serialization)
    alias(libs.plugins.android.library)
}

kotlin {
    jvmToolchain(
        libs.versions.jvmToolchain
            .get()
            .toInt(),
    )

    android {
        namespace = "io.github.kdroidfilter.pagination"
        compileSdk = 36
        minSdk = 21
    }

    jvm()

    sourceSets {
        commonMain.dependencies {
            implementation(libs.seforimlibrary.core)
            implementation(libs.seforimlibrary.dao)
            implementation(libs.compose.runtime)
            implementation(libs.compose.foundation)
            // AndroidX Paging 3 (common)
            implementation(libs.androidx.paging.common)
            implementation(project(":logger"))
        }

        jvmMain.dependencies {
        }
    }
}

tasks.withType<ComposeHotRun>().configureEach {
    mainClass.set("MainKt")
}
