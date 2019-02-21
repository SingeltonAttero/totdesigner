package com.balticitc.myportfolio.data.system.file.zip

import io.reactivex.Completable
import java.io.File
import java.util.zip.ZipFile

/**
 * Created on 22.02.19
 * @author YWeber */

class ZipManager : ZipManagerProvider {
    override fun unZipFile(zipPath: String, targetLocation: String): Completable = Completable.fromAction {
        val folderName = File(zipPath).name.split('.')[0]
        val location = File(targetLocation + File.separator + folderName)
        if (!location.isDirectory){
            location.mkdir()
        }
        ZipFile(zipPath).use { zip ->
            zip.entries().asSequence().forEach { entry ->
                zip.getInputStream(entry).use { input ->
                    File(location.absolutePath + File.separator + entry.name).outputStream().use { output ->
                        input.copyTo(output)
                    }
                }
            }
        }
    }
}