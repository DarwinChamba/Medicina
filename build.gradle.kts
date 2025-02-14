

// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()


    }
    dependencies {
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.3")
        classpath ("com.android.tools.build:gradle:7.3.3")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    //id("com.android.application") version "8.3.0" apply false
    //id("org.jetbrains.kotlin.android") version "1.9.22" apply false
    //id ("org.jetbrains.kotlin.android") version "1.8.20" apply false
    //id("com.google.gms.google-services") version "4.4.2" apply false
    //----------------------------plugin module project---------------------------------------
    id ("com.google.dagger.hilt.android") version "2.48.1" apply false

}