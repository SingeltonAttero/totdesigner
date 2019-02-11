package com.balticitc.myportfolio.totdesigner.ui.about

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.balticitc.myportfolio.totdesigner.R

/**
 * Created on 08.02.19
 * @author YWeber
 * project totdesigner */

class AboutFragment : androidx.fragment.app.Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_about,container,false)
    }

}