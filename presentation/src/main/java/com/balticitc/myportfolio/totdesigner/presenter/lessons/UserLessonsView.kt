package com.balticitc.myportfolio.totdesigner.presenter.lessons

import com.arellomobile.mvp.MvpView
import com.balticitc.myportfolio.domain.entity.lessons.CommonLesson

/**
 * Created on 18.02.19
 * @author YWeber
 * project totdesigner */

interface UserLessonsView : MvpView{
    fun bindLessonToAdapter(lessons:List<CommonLesson>)
}