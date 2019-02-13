package com.example.lrnand602.dagger.module

import com.example.lrnand602.App
import dagger.Module
import dagger.Provides

@Module
class Module(private val app: App) {

    @Provides
    fun provideApplication(): App {
        return app
    }

}


