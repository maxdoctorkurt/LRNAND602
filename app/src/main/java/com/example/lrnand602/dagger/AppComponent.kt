package com.example.lrnand602.dagger

import dagger.Component
import com.example.lrnand602.MainActivity
import com.example.lrnand602.dagger.module.Module

@Component(modules = [Module::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}