package com.balticitc.myportfolio.totdesigner.presenter.lessons

import com.arellomobile.mvp.InjectViewState
import com.balticitc.myportfolio.domain.interactor.lessons.UserLessonsInteractor
import com.balticitc.myportfolio.totdesigner.extension.printConstruction
import com.balticitc.myportfolio.totdesigner.presenter.base.BasePresenter
import com.balticitc.myportfolio.data.system.message.SystemMessageNotifier
import timber.log.Timber
import javax.inject.Inject

/**
 * Created on 18.02.19
 * @author YWeber
 * project totdesigner */
@InjectViewState
class UserLessonsPresenter @Inject constructor(private val interactor: UserLessonsInteractor,
                                               private val systemMessage: SystemMessageNotifier) : BasePresenter<UserLessonsView>() {
    init {
        printConstruction()
    }
    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        interactor.getAllLessons().subscribe({
            viewState.bindLessonToAdapter(it)
        },{
            Timber.e(it)
        }).bind()
    }
    fun openZipFile(zipPath:String,locationTarget:String){
        interactor.openZipFile(zipPath,locationTarget)
            .subscribe({
                systemMessage.systemMessage("unzip file")
            },{
                Timber.e(it)
            }).bind()

    }
}