package com.balticitc.myportfolio.data.system.file.zip

import io.reactivex.Completable

/**
 * Created on 22.02.19
 * @author YWeber */

interface ZipManagerProvider {
    fun unZipFile(zipPath: String, targetLocation: String):Completable
}