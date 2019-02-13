package com.example.lrnand602

import android.app.Application
import com.example.lrnand602.dagger.ActivityComponent
import com.example.lrnand602.dagger.AppComponent
import com.example.lrnand602.dagger.DaggerActivityComponent
import com.example.lrnand602.dagger.DaggerAppComponent
import com.example.lrnand602.dagger.modules.ActivityModule
import com.example.lrnand602.dagger.modules.AppModule
import java.util.logging.Logger

class App : Application() {
    lateinit var appComponent: AppComponent
    lateinit var activityComponent: ActivityComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent
            .builder()
            .appModule(AppModule(this)) // не будет deprecated в реальном приложении, так как что то удовлетворит
            .build()

        activityComponent = DaggerActivityComponent
            .builder()
            .appComponent(appComponent) // не будет deprecated в реальном приложении, так как что то удовлетворит
            .build()


        instance = this
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