package com.balticitc.myportfolio.totdesigner.ui.start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.balticitc.myportfolio.totdesigner.R

/**
 * Created on 08.02.19
 * @author YWeber
 * project totdesigner */

class StartFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

}