package com.balticitc.myportfolio.data.system.disposable

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * Created on 05.02.19
 * @author YWeber
 * project totdesigner */

class ComponentDisposables : ComponentDisposablesProvider {

    override val compositeDisposable: CompositeDisposable by lazy { CompositeDisposable() }
    override fun clear() {
        compositeDisposable.clear()
    }
    override fun Disposable.bind() {
        compositeDisposable.add(this)
    }
}