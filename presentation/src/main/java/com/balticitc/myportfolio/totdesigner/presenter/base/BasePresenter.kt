package com.balticitc.myportfolio.totdesigner.presenter.base

import com.arellomobile.mvp.MvpPresenter
import com.arellomobile.mvp.MvpView
import com.balticitc.myportfolio.data.system.disposable.ComponentDisposables
import com.balticitc.myportfolio.data.system.disposable.ComponentDisposablesProvider

/**
 * Created on 05.02.19
 * @author YWeber
 * project totdesigner */
open class BasePresenter<V : MvpView> : MvpPresenter<V>(), ComponentDisposablesProvider by ComponentDisposables() {
    override fun onDestroy() {
        clear()
        super.onDestroy()
    }
}