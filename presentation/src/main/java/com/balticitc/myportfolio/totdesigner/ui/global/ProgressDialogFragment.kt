package com.balticitc.myportfolio.totdesigner.ui.global

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import com.balticitc.myportfolio.totdesigner.R
import com.balticitc.myportfolio.totdesigner.androidx.MvpAppCompatDialogFragment

/**
 * Created on 13.02.19
 * @author YWeber
 * project totdesigner */

class ProgressDialogFragment : MvpAppCompatDialogFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        setStyle(STYLE_NO_FRAME, R.style.ProgressDialogTheme)
        isCancelable = false
        return inflater.inflate(R.layout.progress_dialog,container,false)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext(),R.style.ProgressDialogTheme)
            .setView(R.layout.progress_dialog)
            .create()
    }
}