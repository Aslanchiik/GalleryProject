object Versions {

    const val AGP = "8.1.2"
    const val kotlin = "1.9.0"
    const val coroutines = "1.6.4"
    const val KSP = "1.9.20-1.0.14"
    const val material = "1.10.0"
    const val constraintLayout = "2.1.4"
    const val vbpd = "1.5.9"
    const val core = "1.12.0"
    const val glide = "4.15.0"
    const val activity = "1.6.1"
    const val fragment = "1.5.5"
    const val lifecycle = "2.5.1"
    const val navigation = "2.7.5"
    const val hilt = "2.48"
    const val retrofit = "2.9.0"
    const val okHttp = "5.0.0-alpha.11"
    const val room = "2.5.0"
    const val paging = "3.1.1"
}

object Libraries {

    object Coroutines {
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${
            Versions.coroutines
        }"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${
            Versions.coroutines
        }"
    }

    object UIComponents {
        const val material = "com.google.android.material:material:${
            Versions.material
        }"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${
            Versions.constraintLayout
        }"
        const val vbpd = "com.github.kirich1409:viewbindingpropertydelegate-noreflection:${
            Versions.vbpd
        }"
        const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    }

    object Core {
        const val core = "androidx.core:core-ktx:${Versions.core}"
    }

    object Activity {
        const val activity = "androidx.activity:activity-ktx:${Versions.activity}"
    }

    object Fragment {
        const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    }

    object Lifecycle {
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
        const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    }

    object Navigation {
        const val fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val ui = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    }

    object Javax {
        const val inject = "javax.inject:javax.inject:1"
    }

    object Hilt {
        const val android = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val compiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val converterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    }

    object OkHttp {
        const val bom = "com.squareup.okhttp3:okhttp-bom:${Versions.okHttp}"
        const val okHttp = "com.squareup.okhttp3:okhttp"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor"
    }

    object Room {
        const val compiler = "androidx.room:room-compiler:${Versions.room}"
        const val ktx = "androidx.room:room-ktx:${Versions.room}"
    }
}

object Plugins {

    object AGP {
        const val application = "com.android.application"
        const val library = "com.android.library"
    }

    object Kotlin {
        const val android = "android"
        const val jvm = "jvm"
        const val kapt = "kapt"
    }

    object KSP {
        const val ksp = "com.google.devtools.ksp"
    }

    object Navigation {
        const val safeArgs = "androidx.navigation.safeargs.kotlin"
    }

    object Hilt {
        const val dagger = "com.google.dagger.hilt.android"
    }
}