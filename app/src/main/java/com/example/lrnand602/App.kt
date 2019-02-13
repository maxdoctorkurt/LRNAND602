package com.example.lrnand602

import android.app.Application
import com.example.lrnand602.dagger.AppComponent
import com.example.lrnand602.dagger.DaggerAppComponent
import com.example.lrnand602.dagger.module.Module
import java.util.logging.Logger

class App : Application() {
    private lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent
            .builder()
            .module(Module(this)) // не будет deprecated в реальном приложении, так как что то удовлетворит
            .build()
        instance = this
    }

    fun getApplicationComponent(): AppComponent {
        return component
    }

    /**
     *  Как признак того, что inject успешен
     */
    fun printBlaBla() {
        Logger.getGlobal().info("*** Bla Bla!")
    }

    companion object {
        lateinit var instance: App private set
    }
}