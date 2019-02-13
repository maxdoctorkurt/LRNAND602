package com.example.lrnand602.dagger.modules

import com.example.lrnand602.App
import com.example.lrnand602.app.Presenter
import com.example.lrnand602.dagger.scopes.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class ActivityModule {
    @Provides
    @ActivityScope
    fun providePresenter(app: App): Presenter {
        return Presenter(app)
    }
}