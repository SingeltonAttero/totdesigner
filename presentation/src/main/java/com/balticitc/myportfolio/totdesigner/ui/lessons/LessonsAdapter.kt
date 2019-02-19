package com.balticitc.myportfolio.totdesigner.ui.lessons

import android.view.View
import com.balticitc.myportfolio.domain.entity.lessons.CommonLesson
import com.balticitc.myportfolio.totdesigner.R
import com.balticitc.myportfolio.totdesigner.ui.global.adapter.BaseRecyclerAdapter
import com.balticitc.myportfolio.totdesigner.ui.global.adapter.BaseViewHolder
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_lesson.view.*

/**
 * Created on 15.02.19
 * @author YWeber
 * project totdesigner */

class LessonsAdapter(override var dataSet: MutableList<CommonLesson>) : BaseRecyclerAdapter<CommonLesson, LessonsAdapter.LessonsHolder>() {

    override fun createViewHolder(view: View, viewType: Int): LessonsHolder = LessonsHolder(view)

    override fun getLayoutIdForPosition(position: Int): Int = R.layout.item_lesson

    class LessonsHolder(itemView: View): BaseViewHolder<CommonLesson>(itemView) {
        override fun bind(item: CommonLesson) {
           itemView.lessonTitleView.text = item.titleLesson
            Glide.with(itemView)
                    .load(item.imageUrl)
                    .into(itemView.lessonPictureView)
        }

    }
}