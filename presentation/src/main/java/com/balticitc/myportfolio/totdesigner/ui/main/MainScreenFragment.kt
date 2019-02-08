package com.balticitc.myportfolio.totdesigner.ui.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.balticitc.myportfolio.totdesigner.R

/**
 * Created on 08.02.19
 * @author YWeber
 * project totdesigner */

class MainScreenFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main_screen, container, false)
    }

}