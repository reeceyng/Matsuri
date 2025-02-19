plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-parcelize")
}

setupApp()

android {
    compileOptions {
        isCoreLibraryDesugaringEnabled = true
    }
    kapt.arguments {
        arg("room.incremental", true)
        arg("room.schemaLocation", "$projectDir/schemas")
    }
    bundle {
        language {
            enableSplit = false
        }
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(fileTree("libs"))
    compileOnly(project(":library:stub"))
    implementation(project(":library:include"))

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.3")
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.recyclerview:recyclerview:1.2.1")
    implementation("androidx.activity:activity-ktx:1.4.0")
    implementation("androidx.fragment:fragment-ktx:1.4.1")
    implementation("androidx.browser:browser:1.4.0")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment-ktx:2.4.2")
    implementation("androidx.navigation:navigation-ui-ktx:2.4.2")
    implementation("androidx.preference:preference-ktx:1.2.0")
    implementation("androidx.appcompat:appcompat:1.4.1")
    implementation("androidx.work:work-runtime-ktx:2.7.1")
    implementation("androidx.work:work-multiprocess:2.7.1")

    implementation(project(":external:preferencex:preferencex"))
    implementation(project(":external:preferencex:preferencex-simplemenu"))

    implementation("com.google.android.material:material:1.6.0")
    implementation("com.google.code.gson:gson:2.8.9")

    implementation("com.github.jenly1314:zxing-lite:2.1.1")

    implementation("com.squareup.okhttp3:okhttp:5.0.0-alpha.3")
    implementation("org.yaml:snakeyaml:1.30")
    implementation("com.github.daniel-stoneuk:material-about-library:3.2.0-rc01")
    implementation("com.jakewharton:process-phoenix:2.1.2")
    implementation("com.esotericsoftware:kryo:5.2.1")
    implementation("com.google.guava:guava:31.0.1-android")
    implementation("org.ini4j:ini4j:0.5.4")

    implementation("com.simplecityapps:recyclerview-fastscroll:2.0.1") {
        exclude(group = "androidx.recyclerview")
        exclude(group = "androidx.appcompat")
    }
    implementation("org.smali:dexlib2:2.5.2") {
        exclude(group = "com.google.guava", module = "guava")
    }

    implementation("androidx.room:room-runtime:2.4.2")
    kapt("androidx.room:room-compiler:2.4.2")
    implementation("androidx.room:room-ktx:2.4.2")
    implementation("com.github.MatrixDev.Roomigrant:RoomigrantLib:0.3.4")
    kapt("com.github.MatrixDev.Roomigrant:RoomigrantCompiler:0.3.4")

    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:1.1.5")
}
