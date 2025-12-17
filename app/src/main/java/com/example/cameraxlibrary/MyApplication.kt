package com.example.cameraxlibrary

// MyApplication.kt
import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import kotlin.text.Typography.dagger

@HiltAndroidApp
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
//        ContextProvider.init(this)
    }
}