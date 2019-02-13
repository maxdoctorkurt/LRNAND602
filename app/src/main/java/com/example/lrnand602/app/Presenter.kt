package com.example.lrnand602.app

import com.example.lrnand602.App
import javax.inject.Inject

class Presenter @Inject constructor(private val app: App) {

    fun getData(): String {
        return "*** Hello! ${app.applicationContext}"
    }

}
