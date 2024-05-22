plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 33  // Updated to the latest stable compileSdk version

    defaultConfig {
        applicationId = "com.example.contactbookapp"
        minSdk = 21
        //noinspection OldTargetApi
        targetSdk = 33  // Updated to the latest stable targetSdk version
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"  // Updated to the latest stable Compose version
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")  // Updated to the latest stable version
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.0")  // Updated to the latest stable version
    implementation("androidx.activity:activity-compose:1.9.0")  // Updated to the latest stable version
    implementation("androidx.compose.ui:ui:1.6.7")  // Updated to the latest stable Compose version
    implementation("androidx.compose.material3:material3:1.2.1")  // Updated to the latest stable version
    implementation("androidx.compose.ui:ui-tooling-preview:1.6.7")  // Updated to the latest stable version
    implementation("androidx.compose.ui:ui-tooling:1.6.7")  // Updated to the latest stable version
    implementation("androidx.navigation:navigation-compose:2.7.7")  // Updated to the latest stable version
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.6.7")  // Updated to the latest stable version
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.6.7")  // Updated to the latest stable version
}
