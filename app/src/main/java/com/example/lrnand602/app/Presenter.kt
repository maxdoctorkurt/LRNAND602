package com.example.lrnand602.app

import com.example.lrnand602.App
import com.example.lrnand602.dagger.scopes.ActivityScope
import javax.inject.Inject

@ActivityScope
class Presenter @Inject constructor(private val app: App): IPresenter {

    override fun getData(): String {
        return "*** Hello! ${app.applicationContext}"
    }

}
