package com.balticitc.myportfolio.totdesigner.ui.start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.balticitc.myportfolio.totdesigner.R
import kotlinx.android.synthetic.main.fragment_start.*

/**
 * Created on 08.02.19
 * @author YWeber
 * project totdesigner */

class StartFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        downloadButton.setOnClickListener {}
    }

}