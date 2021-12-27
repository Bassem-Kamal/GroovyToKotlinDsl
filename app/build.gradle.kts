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
    implementation(Depends.ANDROIDX_CORE)
    implementation(Depends.APPCOMPAT)
    implementation(Depends.MATERIAL_DESIGN)
    implementation(Depends.PICASSO)
    implementation(Depends.CIRCLE_IMAGEVIEW)
    implementation(Depends.VIEW_PAGER_2)
    implementation(Depends.COROUTINES_CORE)
    implementation(Depends.COROUTINES_ANDROID)
    implementation(Depends.VIEW_MODEL)
    implementation(Depends.LIVEDATA)
    implementation(Depends.NAVIGATION_FRAGMENT)
    implementation(Depends.NAVIGATION_UI)
    implementation(Depends.ROOM_RUNTIME)
    implementation(Depends.ROOM_COMPILER)
    implementation(Depends.ROOM_KTX)
    implementation(Depends.LEGACY_SUPPORT_V4)
    implementation(Depends.DATA_STORE)
    implementation(Depends.ACTIVITY_KTX)
    implementation(Depends.RETROFIT_2)
    implementation(Depends.RETROFIT_2_CONVERTER_GSON)
    implementation(Depends.RETROFIT_2_COROUTINES_ADAPTER)

    testImplementation(TestDepends.JUNIT)
    androidTestImplementation(TestDepends.ANDROIDX_TEST_JUNIT)
    androidTestImplementation(TestDepends.ANDROIDX_TEST_ESPRESSO)
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

object Depends {
    const val ANDROIDX_CORE = "androidx.core:core-ktx:${Versions.ANDROIDX_CORE}"
    const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
    const val MATERIAL_DESIGN = "com.google.android.material:material:${Versions.MATERIAL_DESIGN}"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
    const val PICASSO = "com.squareup.picasso:picasso:${Versions.PICASSO}"
    const val CIRCLE_IMAGEVIEW ="de.hdodenhof:circleimageview:${Versions.CIRCLE_IMAGEVIEW}"
    const val VIEW_PAGER_2 = "androidx.viewpager2:viewpager2:${Versions.VIEW_PAGER_2}"
    const val COROUTINES_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES}"
    const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}"
    const val VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.VIEW_MODEL}"
    const val LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIVEDATA}"
    const val NAVIGATION_FRAGMENT = "ndroidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION}"
    const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION}"
    const val ROOM_RUNTIME = "androidx.room:room-runtime:${Versions.ROOM}"
    const val ROOM_COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"
    const val ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"
    const val LEGACY_SUPPORT_V4 = "androidx.legacy:legacy-support-v4:${Versions.LEGACY_SUPPORT_V4}"
    const val DATA_STORE = "androidx.datastore:datastore-preferences:${Versions.DATA_STORE}"
    const val ACTIVITY_KTX = "androidx.activity:activity-ktx:${Versions.ACTIVITY_KTX}"
    const val RETROFIT_2 ="com.squareup.retrofit2:retrofit:${Versions.RETROFIT_2}"
    const val RETROFIT_2_CONVERTER_GSON ="com.squareup.retrofit2:converter-gson:${Versions.RETROFIT_2}"
    const val RETROFIT_2_COROUTINES_ADAPTER = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.CONSTRAINT_LAYOUT}"
}

object TestDepends {
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
    const val ANDROIDX_TEST_JUNIT = "androidx.test.ext:${Versions.JUNIT}"
    const val ANDROIDX_TEST_ESPRESSO =
        "androidx.test.espresso:espresso-core:${Versions.ANDROIDX_TEST_ESPRESSO}"
}