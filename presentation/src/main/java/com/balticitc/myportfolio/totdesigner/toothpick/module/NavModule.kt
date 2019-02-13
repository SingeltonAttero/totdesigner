package com.balticitc.myportfolio.totdesigner.toothpick.module

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.balticitc.myportfolio.totdesigner.R
import toothpick.config.Module

/**
 * Created on 13.02.19
 * @author YWeber
 * project totdesigner */

class NavModule(activity: AppCompatActivity) : Module() {
    init {
        bind(NavController::class.java).toInstance(Navigation.findNavController(activity, R.id.nav_host_fragment))
    }
}