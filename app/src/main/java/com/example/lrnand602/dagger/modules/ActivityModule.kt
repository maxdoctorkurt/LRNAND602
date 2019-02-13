package com.example.lrnand602.dagger.modules

import com.example.lrnand602.App
import com.example.lrnand602.app.IPresenter
import com.example.lrnand602.app.Presenter
import com.example.lrnand602.dagger.scopes.ActivityScope
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class ActivityModule {
    @Binds
//    @ActivityScope
    abstract fun bindsPresenter(presenter: Presenter): IPresenter
}