package com.balticitc.myportfolio.totdesigner.ui.global.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T>(view: View) : RecyclerView.ViewHolder(view) {

    private val containerView: View
        get() = itemView

    abstract fun bind(item: T)
}