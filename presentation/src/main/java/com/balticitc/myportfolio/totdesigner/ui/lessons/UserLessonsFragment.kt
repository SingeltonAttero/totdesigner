package com.balticitc.myportfolio.totdesigner.ui.lessons

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
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
import org.jetbrains.anko.support.v4.find
import org.jetbrains.anko.support.v4.toast
import toothpick.Toothpick
import java.io.File

/**
 * Created on 08.02.19
 * @author YWeber
 * project totdesigner */

private const val REQUEST_CODE = 32
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
        setHasOptionsMenu(true)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            when (requestCode) {
                REQUEST_CODE -> {
                    val path = data?.data?.path?.split(":".toRegex())?.dropLastWhile { it.isEmpty() }?.toTypedArray()?.get(1) ?: ""
                    presenter.openZipFile(path, activity!!.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS)?.absolutePath ?: ""
                    )
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        initLessonScope()
        super.onCreate(savedInstanceState)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when(item.itemId){
            R.id.menuAddNewLesson -> {
                val intent = Intent(Intent.ACTION_GET_CONTENT)
                intent.type = "*/*"
                intent.addCategory(Intent.CATEGORY_OPENABLE)
                startActivityForResult(Intent.createChooser(intent, getString(R.string.open_lesson)), REQUEST_CODE)
                true
            }
            else -> { super.onOptionsItemSelected(item) }
        }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_lessons,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun bindLessonToAdapter(lessons: List<CommonLesson>) {
        lessonsRecycler.adapter = LessonsAdapter(lessons.toMutableList())
        lessonsRecycler.layoutManager = GridLayoutManager(activity,3)
    }

    private fun initLessonScope() {
        val openScopes = Toothpick.openScopes(DI.NAVIGATION_SCOPE, DI.LESSON_SCOPE)
        openScopes.installModules(LessonModule())
        Toothpick.inject(this, openScopes)
    }
}