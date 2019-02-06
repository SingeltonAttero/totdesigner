package com.balticitc.myportfolio.totdesigner.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.balticitc.myportfolio.data.system.ResourceManager
import com.balticitc.myportfolio.data.system.schedulers.SchedulersProvider
import com.balticitc.myportfolio.domain.Main
import com.balticitc.myportfolio.totdesigner.R
import com.balticitc.myportfolio.totdesigner.presenter.MainPresenter
import com.balticitc.myportfolio.totdesigner.presenter.MainView
import com.balticitc.myportfolio.totdesigner.toothpick.DI
import org.jetbrains.anko.toast
import toothpick.Toothpick
import javax.inject.Inject

/**
 * Created on 06.02.19
 * @author YWeber
 * project totdesigner */

class MainActivity : AppCompatActivity(){
  /*  @InjectPresenter
    lateinit var presenter: MainPresenter

    @ProvidePresenter
    fun providerPresenter(): MainPresenter = Toothpick
        .openScope(DI.APP_SCOPE)
        .getInstance(MainPresenter::class.java)*/
    @Inject
    lateinit var resource:ResourceManager

    @Inject
    lateinit var main:Main

    override fun onCreate(savedInstanceState: Bundle?) {
        val openScope = Toothpick.openScope(DI.APP_SCOPE)
        Toothpick.inject(this,openScope)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toast(resource.getString(R.string.app_name))
        main.test
    }


}