plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.parcelize)
}

android {
    namespace = "com.example.anaonandroid"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.anaonandroid"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.ui.tooling.preview.android)
    implementation(libs.androidx.foundation.layout.android)
    implementation(libs.androidx.foundation.android)
    implementation(libs.androidx.material3.android)
    implementation(libs.androidx.ui.desktop)
    implementation(libs.androidx.viewbinding)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation(libs.rxandroid)
    implementation(libs.rxjava)
    implementation(libs.javax.inject)
    implementation(libs.hilt.android)
    implementation(libs.androidx.hilt.lifecycle.viewmodel)
    implementation(libs.hilt.android.compiler)
    implementation(libs.androidx.hilt.compiler)
    implementation(libs.gradle)
    implementation(libs.jetbrains.kotlin.stdlib)
    implementation(libs.gson)
    implementation(libs.retrofit)
    implementation(libs.converter.gson)
    implementation(libs.logging.interceptor)
    implementation(libs.androidx.multidex)
    implementation(libs.timber)
    implementation(libs.adapter.rxjava3)
    implementation(libs.rxjava3.rxjava)
}