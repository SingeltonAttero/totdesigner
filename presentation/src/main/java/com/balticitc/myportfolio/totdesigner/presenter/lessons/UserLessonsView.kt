package com.balticitc.myportfolio.totdesigner.presenter.lessons

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.balticitc.myportfolio.domain.entity.lessons.CommonLesson

/**
 * Created on 18.02.19
 * @author YWeber
 * project totdesigner */
@StateStrategyType(AddToEndSingleStrategy::class)
interface UserLessonsView : MvpView{
    fun bindLessonToAdapter(lessons:List<CommonLesson>)
}