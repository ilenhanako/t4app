// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript{
    repositories{
        google()
        mavenCentral()
    }
    dependencies{
        classpath("io.realm:realm-gradle-plugin:10.15.1")
    }


}

plugins {
    id("com.android.application") version "8.2.2" apply false
}