package com.balticitc.myportfolio.domain.repository.lessons

import com.balticitc.myportfolio.domain.entity.lessons.CommonLesson
import io.reactivex.Single

/**
 * Created on 18.02.19
 * @author YWeber
 * project totdesigner */

interface UserLessonRepository {
    fun getAllLessons(): Single<List<CommonLesson>>
}