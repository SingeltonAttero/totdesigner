package com.balticitc.myportfolio.totdesigner.toothpick.module

import com.balticitc.myportfolio.data.repository.lesson.UserLessonRepositoryImpl
import com.balticitc.myportfolio.domain.interactor.lessons.UserLessonsInteractor
import com.balticitc.myportfolio.domain.repository.lessons.UserLessonRepository
import toothpick.config.Module

/**
 * Created on 18.02.19
 * @author YWeber
 * project totdesigner */

class LessonModule : Module() {
    init {
        bind(UserLessonRepository::class.java).to(UserLessonRepositoryImpl::class.java).singletonInScope()
        bind(UserLessonsInteractor::class.java).to(UserLessonsInteractor::class.java).singletonInScope()

    }
}