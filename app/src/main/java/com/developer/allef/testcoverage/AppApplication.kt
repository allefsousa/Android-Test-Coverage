package com.developer.allef.testcoverage

import android.app.Application
import com.developer.allef.testcoverage.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * @author allef.santos on 2019-10-15
 */
class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AppApplication)
            modules(appModule)
        }

    }
}