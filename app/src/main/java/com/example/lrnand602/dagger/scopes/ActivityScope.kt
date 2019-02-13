package com.example.lrnand602.dagger.scopes

import java.lang.annotation.Documented
import javax.inject.Scope
import javax.inject.Singleton
import kotlin.annotation.Retention

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScope {
}