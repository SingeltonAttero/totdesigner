package com.balticitc.myportfolio.totdesigner.presenter

import com.arellomobile.mvp.InjectViewState
import com.balticitc.myportfolio.data.storage.PrefsProvider
import com.balticitc.myportfolio.data.system.ResourceManager
import com.balticitc.myportfolio.totdesigner.presenter.base.BasePresenter
import java.util.*
import javax.inject.Inject

/**
 * Created on 05.02.19
 * @author YWeber
 * project totdesigner */
@InjectViewState
class MainPresenter @Inject constructor(private val resourceManager: ResourceManager,
                                        private val prefs: PrefsProvider) : BasePresenter<MainView>() {
    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        val date = Date()

    }
}