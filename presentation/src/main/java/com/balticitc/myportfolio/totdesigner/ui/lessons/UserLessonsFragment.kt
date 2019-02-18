package com.balticitc.myportfolio.totdesigner.ui.lessons

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.balticitc.myportfolio.domain.entity.lessons.CommonLesson
import com.balticitc.myportfolio.totdesigner.R
import com.balticitc.myportfolio.totdesigner.presenter.lessons.UserLessonsPresenter
import com.balticitc.myportfolio.totdesigner.presenter.lessons.UserLessonsView
import com.balticitc.myportfolio.totdesigner.toothpick.DI
import com.balticitc.myportfolio.totdesigner.toothpick.module.LessonModule
import com.balticitc.myportfolio.totdesigner.ui.global.BaseFragment
import kotlinx.android.synthetic.main.fragment_user_lessons.*
import org.jetbrains.anko.support.v4.toast
import toothpick.Toothpick

/**
 * Created on 08.02.19
 * @author YWeber
 * project totdesigner */

class UserLessonsFragment : BaseFragment(), UserLessonsView {

    @InjectPresenter
    lateinit var presenter:UserLessonsPresenter
    @ProvidePresenter
    fun providerPresenter(): UserLessonsPresenter = Toothpick
        .openScope(DI.LESSON_SCOPE)
        .getInstance(UserLessonsPresenter::class.java)

    override val layoutRes: Int
        get() = R.layout.fragment_user_lessons

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        initLessonScope()
        super.onCreate(savedInstanceState)
    }

    override fun bindLessonToAdapter(lessons: List<CommonLesson>) {
        lessonsRecycler.adapter = LessonsAdapter(ArrayList(lessons))
        lessonsRecycler.layoutManager = GridLayoutManager(activity,3)
    }

    private fun initLessonScope() {
        val openScopes = Toothpick.openScopes(DI.NAVIGATION_SCOPE, DI.LESSON_SCOPE)
        openScopes.installModules(LessonModule())
        Toothpick.inject(this, openScopes)
    }
}