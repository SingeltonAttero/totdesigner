package com.balticitc.myportfolio.data.repository

import com.balticitc.myportfolio.domain.entity.lessons.CommonLesson
import io.reactivex.Single

object MockData {
    fun getMockUserLesson(): Single<List<CommonLesson>> = Single.create<List<CommonLesson>> {
        val listOfMock = listOf(
            CommonLesson("Основы проектирования UX UI - Wirefr…","https://netrocket.com.ua/wp-content/uploads/2017/11/ux-ui-dizayn-1.png"),
            CommonLesson("Анатомия человека","http://fb.ru/misc/i/thumb/a/8/0/9/6/0/9/809609.jpg"),
            CommonLesson("Планеты солнечной системы","https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/Solar_system_scale-2.jpg/780px-Solar_system_scale-2.jpg"),
            CommonLesson("Спутник Ресурс П","https://www.ridus.ru/images/2016/3/17/377952/in_article_87efcd059d.png"),
            CommonLesson("Сатурн","https://i.ytimg.com/vi/NaiLLgP4tbE/maxresdefault.jpg"),
            CommonLesson("Марс","https://v-kosmose.com/wp-content/uploads/2013/11/Mars-Planet-1.jpg"),
            CommonLesson("Луна","https://www.kramola.info/sites/default/files/styles/page-main/public/images/vesti/90316121_1.jpg?itok=q8u43Nmr"),
            CommonLesson("Плутон","http://spacegid.com/wp-content/uploads/2017/01/Izobrazhenie-Plutona-sozdannoe-s-ispolzovaniem-tehniki-metod-glavnyih-komponent.jpg"))
        it.onSuccess(listOfMock)
    }

}