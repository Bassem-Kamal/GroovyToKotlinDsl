plugins {
    //TODO Step 1: replace single quotation mark with double quotation mark
    //TODO Step 2 :Using function calls instead of property assignment used by Groovy [id("your plugin")]
    id 'com.android.application'
    id 'kotlin-android'
    id 'kotlin-kapt'
}

android {
    //TODO Step 4 : using the = operator while assigning value to a variable
    // as in Groovy you can skip the = assignment operator
    compileSdk 31

    defaultConfig {
        applicationId "com.example.groovytoktolinkdsl"
        minSdk 21
        targetSdk 31
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }
    //TODO
    buildTypes {
        release {
            //TODO Step 5 renaming boolean variables to use "is"
            // as a prefix to the variable name continued with camel case
            // [ minifyEnabled --> isMinifyEnabled ] and use the = operator
            // to assign the value as we learned in Step 4
            minifyEnabled false
            //TODO Step 1: replace single quotation mark with double quotation mark
            //TODO Step 6 Use function call with parentheses instead of property assignment
            // [proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"),proguardFile)]
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        //TODO Step 4 : using the = operator while assigning value to a variable
        // as in Groovy you can skip the = assignment operator
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        //TODO Step 1: replace single quotation mark with double quotation mark
        jvmTarget = '1.8'
    }
}

dependencies {
//TODO Step 1: replace single quotation mark with double quotation mark
//TODO Step 2 :Using function calls instead of property assignment used by Groovy [implementation("your dependency")]
    implementation 'androidx.core:core-ktx:1.7.0'
    implementation 'androidx.appcompat:appcompat:1.4.0'
    implementation 'com.google.android.material:material:1.4.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.2'

    implementation 'com.squareup.picasso:picasso:2.71828'
    implementation 'de.hdodenhof:circleimageview:3.1.0'
    implementation 'androidx.viewpager2:viewpager2:1.0.0'

    // Coroutines
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2"
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2"

    // ViewModel
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0"
    // LiveData
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:2.4.0"

    // Navigation
    implementation "androidx.navigation:navigation-fragment-ktx:2.3.5"
    implementation "androidx.navigation:navigation-ui-ktx:2.3.5"
    // Room
    implementation "androidx.room:room-runtime:2.4.0"
    implementation 'androidx.legacy:legacy-support-v4:1.0.0'
    kapt "androidx.room:room-compiler:2.4.0"
    implementation "androidx.room:room-ktx:2.4.0" // Kotlin Extensions and Coroutines support for Room
    //datastore
    implementation "androidx.datastore:datastore-preferences:1.0.0"

    // Activity KTX for viewModels()
    implementation 'androidx.activity:activity-ktx:1.4.0'
    // Retrofit
    implementation "com.squareup.retrofit2:retrofit:2.9.0"
    implementation "com.squareup.retrofit2:converter-gson:2.9.0"
    implementation "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:0.9.2"

    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
}