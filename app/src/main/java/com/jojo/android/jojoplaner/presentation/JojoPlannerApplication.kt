package com.jojo.android.jojoplaner.presentation

import android.app.Application
import com.jojo.android.jojoplaner.di.Module
import org.koin.android.ext.android.startKoin

class JojoPlannerApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(Module.applicationModule))
    }
}