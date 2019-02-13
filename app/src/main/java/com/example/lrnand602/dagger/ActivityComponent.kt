package com.example.lrnand602.dagger

import com.example.lrnand602.MainActivity
import com.example.lrnand602.dagger.modules.ActivityModule
import com.example.lrnand602.dagger.scopes.ActivityScope
import dagger.Component

@ActivityScope
@Component(modules = [ActivityModule::class], dependencies = [AppComponent::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)
}