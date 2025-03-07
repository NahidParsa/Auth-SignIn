plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.org.jetbrains.kotlin.kapt)

    alias(libs.plugins.navigation.safe.args)
    alias(libs.plugins.hilt)

}

android {
    namespace = "com.nadi.signinsignup"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.nadi.signinsignup"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)



    // Retrofit
    implementation(libs.retrofit)
    implementation( libs.converter.moshi)
    implementation (libs.retrofit2.kotlin.coroutines.adapter)


// Kotlin Coroutines
    implementation (libs.kotlinx.coroutines.core)
    implementation (libs.kotlinx.coroutines.android)

    // ViewModel
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    // LiveData
    implementation(libs.androidx.lifecycle.livedata.ktx)


    // Kotlin
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)

    implementation (libs.material)
    //  preference
    implementation(libs.androidx.preference.ktx)

    // hilt
    implementation(libs.google.dagger.hilt)
    kapt(libs.google.dagger.hilt.compiler)


}