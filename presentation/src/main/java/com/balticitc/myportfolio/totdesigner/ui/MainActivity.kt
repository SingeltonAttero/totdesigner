package com.balticitc.myportfolio.totdesigner.ui

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.balticitc.myportfolio.totdesigner.R
import com.balticitc.myportfolio.totdesigner.presenter.MainPresenter
import com.balticitc.myportfolio.totdesigner.presenter.MainView
import com.balticitc.myportfolio.totdesigner.androidx.MvpAppCompatActivity
import com.balticitc.myportfolio.totdesigner.toothpick.DI
import kotlinx.android.synthetic.main.activity_main.*
import toothpick.Toothpick

/**
 * Created on 06.02.19
 * @author YWeber
 * project totdesigner */

class MainActivity : MvpAppCompatActivity(),MainView{

    @InjectPresenter
    lateinit var presenter: MainPresenter

    @ProvidePresenter
    fun providerPresenter(): MainPresenter = Toothpick
        .openScope(DI.APP_SCOPE)
        .getInstance(MainPresenter::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}