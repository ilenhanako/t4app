plugins {
    id("com.android.application")
    id("realm-android")
    id("com.google.dagger.hilt.android")
    id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin")

}

realm{
    isSyncEnabled = true

}
secrets {
    // Optionally specify a different file name containing your secrets.
    // The plugin defaults to "local.properties"
    propertiesFileName = "secrets.properties"

    // A properties file containing default secret values. This file can be
    // checked in version control.
    defaultPropertiesFileName = "local.defaults.properties"

    // Configure which keys should be ignored by the plugin by providing regular expressions.
    // "sdk.dir" is ignored by default.
    ignoreList.add("keyToIgnore") // Ignore the key "keyToIgnore"
    ignoreList.add("sdk.*")       // Ignore all keys matching the regexp "sdk.*"
}

android {
    namespace = "com.sutd.t4app"
    compileSdk = 34

    packaging {
        resources {
            excludes += "META-INF/LICENSE.md"
            excludes += "META-INF/LICENSE-notice.md"
            excludes += "META-INF/INDEX.LIST"
        }
    }

    defaultConfig {
        applicationId = "com.sutd.t4app"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    buildFeatures {
        viewBinding = true
        dataBinding = true
        buildConfig = true
    }
    sourceSets {
        getByName("main") {
            assets {
                srcDirs("src\\main\\assets", "src\\main\\assets")
            }
        }
    }

}

dependencies {

    implementation("com.google.android.gms:play-services-auth:20.1.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation("androidx.navigation:navigation-fragment:2.7.7")
    implementation("androidx.navigation:navigation-ui:2.7.7")
    implementation("com.google.android.gms:play-services-maps:18.2.0")

    // Dagger Hilt for Data injection
    implementation("com.google.dagger:dagger:2.51")
    implementation("com.google.dagger:hilt-android:2.44")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("junit:junit:4.12")
    implementation("org.junit.jupiter:junit-jupiter:5.8.1")
    annotationProcessor("com.google.dagger:dagger-compiler:2.51")
    annotationProcessor("com.google.dagger:hilt-android-compiler:2.44")

    // Retrofit for APIs
    implementation("com.squareup.retrofit2:retrofit:2.10.0")
    implementation("com.squareup.retrofit2:converter-gson:2.10.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.10.0")


    // RxJava for all APIs and Mongo Realm
    implementation("io.reactivex.rxjava2:rxandroid:2.1.1")
    implementation("io.reactivex.rxjava2:rxjava:2.2.21")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.3.0")
    implementation("com.jakewharton.rxbinding4:rxbinding-recyclerview:4.0.0")

    // Picasso for CDN
    implementation("com.squareup.picasso:picasso:2.8")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation ("androidx.test:runner:1.4.0")
    androidTestImplementation ("androidx.test:rules:1.4.0")



                //OpenAI
    implementation("com.squareup.okhttp3:okhttp:4.9.1")

    // Captcha

    implementation("com.google.cloud:google-cloud-storage:2.0.0")
    implementation("androidx.browser:browser:1.8.0")


//    implementation("androidx.activity:activity-ktx:1.8.2")
//    implementation("androidx.fragment:fragment-ktx:1.8.2")
}