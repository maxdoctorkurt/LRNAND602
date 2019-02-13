package com.example.lrnand602.dagger

import com.example.lrnand602.App
import dagger.Component
import com.example.lrnand602.MainActivity
import com.example.lrnand602.dagger.modules.AppModule

@Component(modules = [AppModule::class])
interface AppComponent {
    fun getApp(): App
    fun inject(activity: MainActivity)
}