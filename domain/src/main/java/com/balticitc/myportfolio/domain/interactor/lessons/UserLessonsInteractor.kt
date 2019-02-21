package com.balticitc.myportfolio.domain.interactor.lessons

import com.balticitc.myportfolio.domain.entity.lessons.CommonLesson
import com.balticitc.myportfolio.domain.repository.lessons.UserLessonRepository
import com.sun.nio.zipfs.ZipPath
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created on 18.02.19
 * @author YWeber
 * project totdesigner */
class UserLessonsInteractor @Inject constructor(private val repository: UserLessonRepository){
    fun getAllLessons(): Single<List<CommonLesson>> = repository.getAllLessons()
    fun openZipFile(zipPath:String,locationTarget:String) =  repository.openZipFile(zipPath,locationTarget)
}