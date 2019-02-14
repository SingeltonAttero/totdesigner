package com.balticitc.myportfolio.totdesigner.ui.lessons

import android.view.View
import com.balticitc.myportfolio.totdesigner.ui.global.adapter.BaseRecyclerAdapter
import com.balticitc.myportfolio.totdesigner.ui.global.adapter.BaseViewHolder

/**
 * Created on 15.02.19
 * @author YWeber
 * project totdesigner */

class LessonsAdapter(override var dataSet: ArrayList<String>) : BaseRecyclerAdapter<String, LessonsAdapter.LessonsHolder>() {

    override fun createViewHolder(view: View, viewType: Int): LessonsHolder = LessonsHolder(view)

    override fun getLayoutIdForPosition(position: Int): Int = TODO()

    class LessonsHolder(itemView: View): BaseViewHolder<String>(itemView) {
        override fun bind(item: String) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }
}