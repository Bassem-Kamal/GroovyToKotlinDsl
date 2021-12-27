plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdk = Config.COMPILE_SDK

    defaultConfig {
        applicationId = Config.APPLICATION_ID
        minSdk = Config.MIN_SDK
        targetSdk = Config.TARGET_SDK
        versionCode = Config.VERSION_CODE
        versionName = Config.VERSION_NAME

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
}

dependencies {
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.4.0")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.2")

    implementation("com.squareup.picasso:picasso:2.71828")
    implementation("de.hdodenhof:circleimageview:3.1.0")
    implementation("androidx.viewpager2:viewpager2:1.0.0")

    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2")

    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0")
    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.4.0")

    // Navigation
    implementation("androidx.navigation:navigation-fragment-ktx:2.3.5")
    implementation("androidx.navigation:navigation-ui-ktx:2.3.5")
    // Room
    implementation("androidx.room:room-runtime:2.4.0")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    kapt("androidx.room:room-compiler:2.4.0")
    implementation("androidx.room:room-ktx:2.4.0") // Kotlin Extensions and Coroutines support for Room
    //datastore
    implementation("androidx.datastore:datastore-preferences:1.0.0")

    // Activity KTX for viewModels()
    implementation("androidx.activity:activity-ktx:1.4.0")
    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:0.9.2")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}

object Config {
    const val COMPILE_SDK = 31
    const val APPLICATION_ID = "com.example.groovytoktolinkdsl"
    const val MIN_SDK = 21
    const val TARGET_SDK = 31
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"
}

object Versions {
    const val ANDROIDX_CORE = "1.7.0"
    const val APPCOMPAT = "1.4.0"
    const val MATERIAL_DESIGN = "1.4.0"
    const val CONSTRAINT_LAYOUT = "2.1.2"
    const val PICASSO = "2.71828"
    const val CIRCLE_IMAGEVIEW = "3.1.0"
    const val VIEW_PAGER_2 = "1.0.0"
    const val COROUTINES = "1.5.2"
    const val VIEW_MODEL = "2.4.0"
    const val LIVEDATA = "2.4.0"
    const val NAVIGATION = "2.3.5"
    const val ROOM = "2.4.0"
    const val LEGACY_SUPPORT_V4 = "1.0.0"
    const val DATA_STORE = "1.0.0"
    const val ACTIVITY_KTX = "1.4.0"
    const val RETROFIT_2 = "2.9.0"
    const val RETROFIT_2_COROUTINES_ADAPTER = "0.9.2"
    const val JUNIT = "4.13.2"
    const val ANDROIDX_TEST_JUNIT = "1.1.3"
    const val ANDROIDX_TEST_ESPRESSO = "3.4.0"
}