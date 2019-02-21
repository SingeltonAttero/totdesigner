package com.balticitc.myportfolio.totdesigner.toothpick.module

import android.content.Context
import com.balticitc.myportfolio.data.storage.AppPrefs
import com.balticitc.myportfolio.data.storage.PrefsProvider
import com.balticitc.myportfolio.data.system.ResourceManager
import com.balticitc.myportfolio.data.system.file.zip.ZipManager
import com.balticitc.myportfolio.data.system.file.zip.ZipManagerProvider
import com.balticitc.myportfolio.data.system.message.SystemMessageNotifier
import com.balticitc.myportfolio.data.system.schedulers.AppSchedulers
import com.balticitc.myportfolio.data.system.schedulers.SchedulersProvider
import timber.log.Timber
import toothpick.config.Module

/**
 * Created on 05.02.19
 * @author YWeber
 * project totdesigner */

class AppModule (context: Context) : Module() {
    init {
        Timber.d("init app module")
        bind(Context::class.java).toInstance(context)
        bind(ResourceManager::class.java).toInstance(ResourceManager(context))
        bind(SchedulersProvider::class.java).toInstance(AppSchedulers())
        bind(PrefsProvider::class.java).to(AppPrefs::class.java).singletonInScope()
        bind(SystemMessageNotifier::class.java).toInstance(SystemMessageNotifier())
        Timber.e("init zip file manager")
        bind(ZipManagerProvider::class.java).toInstance(ZipManager())
    }
}