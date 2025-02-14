plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)

   // id("com.google.gms.google-services")
    id ("kotlin-parcelize")
    id ("androidx.navigation.safeargs.kotlin")
    id ("kotlin-kapt")

}

android {
    namespace = "app.kotlin.medicina"
    compileSdk = 34


    defaultConfig {
        applicationId = "app.kotlin.medicina"
        minSdk = 27
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
    viewBinding{
        enable = true;
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation(platform("com.google.firebase:firebase-bom:33.1.2"))
    implementation("com.google.firebase:firebase-analytics")
    implementation ("com.google.firebase:firebase-auth")
    implementation ("com.google.firebase:firebase-firestore")
    implementation ("com.google.firebase:firebase-database-ktx")
    //implementation ("com.google.android.gms:play-services-auth:21.3.0")



    //implementation ("com.google.android.gms:play-services-ads:22.6.0")


    implementation ("com.google.code.gson:gson:2.10.1")
    //----------------------------circleImageView ---------------------------------------------
    implementation ("de.hdodenhof:circleimageview:3.1.0")


//----------------------------dagger hilt-----------------------------------------------------------
    implementation ("com.google.dagger:hilt-android:2.48.1")
    //kapt ("com.google.dagger:hilt-compiler:2.48.1")
    //-----------------------------fragmentAndNavigation------------------------------------

    implementation ("androidx.navigation:navigation-fragment-ktx:2.5.3")
    implementation ("androidx.navigation:navigation-ui-ktx:2.5.3")
    implementation ("androidx.fragment:fragment-ktx:1.5.7")
    //-----------------------------corrutinas-----------------------------------------------------

    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0-RC")

//-------------------------------lifecicle------------------------------------------------------

    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.4.0")

//------------------------------viewModel---------------------------------------------------



//--------------------------------liveData----------------------------------------------------

    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.4.0-rc01")

    //----------------------------------room-----------------------------------------------------
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0")
    implementation ("androidx.room:room-ktx:2.4.3")
   // kapt ("androidx.room:room-compiler:2.4.3")
    //----------------------------glide----------------------------------------------------------
    implementation ("com.github.bumptech.glide:glide:4.15.1")

    //implementation (libs.material.calendarview)
    implementation ("com.github.prolificinteractive:material-calendarview:2.0.1")


//-------------------------error dagger hilt-------------------------------------------------------
}/*
kapt {
    correctErrorTypes = true
}
*/