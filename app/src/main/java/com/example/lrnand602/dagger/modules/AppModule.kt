package com.example.lrnand602.dagger.modules

import com.example.lrnand602.App
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val app: App) {
    @Provides
    fun provideApplication(): App {
        return app
    }
}


