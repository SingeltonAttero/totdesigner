package com.balticitc.myportfolio.data.repository.lesson

import com.balticitc.myportfolio.data.repository.MockData
import com.balticitc.myportfolio.data.system.file.zip.ZipManagerProvider
import com.balticitc.myportfolio.data.system.schedulers.SchedulersProvider
import com.balticitc.myportfolio.domain.entity.lessons.CommonLesson
import com.balticitc.myportfolio.domain.repository.lessons.UserLessonRepository
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created on 18.02.19
 * @author YWeber
 * project totdesigner */

class UserLessonRepositoryImpl @Inject constructor(private val schedulers: SchedulersProvider,
                                                   private val zipManager: ZipManagerProvider
) : UserLessonRepository {
    override fun openZipFile(zipPath: String, locationTarget: String): Completable = zipManager
            .unZipFile(zipPath, locationTarget)
            .subscribeOn(schedulers.io())
            .observeOn(schedulers.ui())

    override fun getAllLessons(): Single<List<CommonLesson>> = MockData.getMockUserLesson()

}