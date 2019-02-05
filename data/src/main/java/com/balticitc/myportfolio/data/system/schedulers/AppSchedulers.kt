package com.balticitc.myportfolio.data.system.schedulers

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created on 05.02.19
 * @author YWeber
 * project totdesigner */

class AppSchedulers : SchedulersProvider {
    override fun ui(): Scheduler = AndroidSchedulers.mainThread()
    override fun computation(): Scheduler = Schedulers.computation()
    override fun trampoline(): Scheduler = Schedulers.trampoline()
    override fun newThread(): Scheduler = Schedulers.newThread()
    override fun io(): Scheduler = Schedulers.io()
}