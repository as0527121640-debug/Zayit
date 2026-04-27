plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.compose)
}

android {
    namespace = "io.github.kdroidfilter.seforimapp.androidApp"
    compileSdk = 36

    defaultConfig {
        applicationId = "io.github.kdroidfilter.seforimapp.androidApp"
        minSdk = 21
        targetSdk = 36
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
