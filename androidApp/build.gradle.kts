plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.compose)
}

android {
    namespace = "io.github.kdroidfilter.seforimapp.androidApp"
    compileSdk = 35

    defaultConfig {
        applicationId = "io.github.kdroidfilter.seforimapp.androidApp"
        minSdk = 21
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(project(":SeforimApp"))
    implementation(libs.androidx.activityCompose)

}
