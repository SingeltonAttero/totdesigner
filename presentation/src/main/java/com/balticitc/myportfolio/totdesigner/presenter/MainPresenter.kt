package com.balticitc.myportfolio.totdesigner.presenter

import com.arellomobile.mvp.InjectViewState
import com.balticitc.myportfolio.totdesigner.presenter.base.BasePresenter
import com.balticitc.myportfolio.data.system.message.SystemMessageNotifier
import timber.log.Timber
import javax.inject.Inject

/**
 * Created on 05.02.19
 * @author YWeber
 * project totdesigner */
@InjectViewState
class MainPresenter @Inject constructor(private val systemMessageNotifier: SystemMessageNotifier) : BasePresenter<MainView>(){
    init {
        Timber.d("init ${this::class.java}")
    }

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        systemMessageNotifier.notifier()
                .subscribe {
                    viewState.showErrorToast(it.message)
                }.bind()
    }
}