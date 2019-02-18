package com.balticitc.myportfolio.data.repository.lesson

import com.balticitc.myportfolio.data.repository.MockData
import com.balticitc.myportfolio.data.system.schedulers.SchedulersProvider
import com.balticitc.myportfolio.domain.entity.lessons.CommonLesson
import com.balticitc.myportfolio.domain.repository.lessons.UserLessonRepository
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created on 18.02.19
 * @author YWeber
 * project totdesigner */

class UserLessonRepositoryImpl @Inject constructor(private val schedulers: SchedulersProvider) : UserLessonRepository {
    override fun getAllLessons(): Single<List<CommonLesson>> = MockData.getMockUserLesson()

}