package com.balticitc.myportfolio.totdesigner.presenter

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

/**
 * Created on 05.02.19
 * @author YWeber
 * project totdesigner */
@StateStrategyType(AddToEndSingleStrategy::class)
interface MainView : MvpView{
    fun showErrorToast(message:String)
}