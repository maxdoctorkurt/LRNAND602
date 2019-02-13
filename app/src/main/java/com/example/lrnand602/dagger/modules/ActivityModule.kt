package com.example.lrnand602.dagger.modules

import com.example.lrnand602.App
import com.example.lrnand602.app.Presenter
import dagger.Module
import dagger.Provides

@Module
class ActivityModule {
    @Provides
    fun providePresenter(app: App): Presenter {
        return Presenter(app)
    }
}