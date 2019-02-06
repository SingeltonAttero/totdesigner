package com.balticitc.myportfolio.totdesigner

import android.app.Application
import com.balticitc.myportfolio.totdesigner.toothpick.DI
import com.balticitc.myportfolio.totdesigner.toothpick.module.AppModule
import timber.log.Timber
import toothpick.Toothpick
import toothpick.configuration.Configuration
import toothpick.registries.FactoryRegistryLocator
import toothpick.registries.MemberInjectorRegistryLocator

/**
 * Created on 05.02.19
 * @author YWeber
 * project totdesigner */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initLogger()
        initToothpick()
        initScope()
    }

    private fun initScope() {
        Toothpick.openScope(DI.APP_SCOPE).installModules(AppModule(this))
    }

    private fun initToothpick() {
        Toothpick.setConfiguration(Configuration.forDevelopment().disableReflection())
        FactoryRegistryLocator.setRootRegistry(FactoryRegistry())
        MemberInjectorRegistryLocator.setRootRegistry(MemberInjectorRegistry())
    }

    private fun initLogger() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}