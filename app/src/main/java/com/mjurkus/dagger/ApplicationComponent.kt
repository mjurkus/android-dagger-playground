package com.mjurkus.dagger

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule


@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ApplicationModule::class,
        ActivityModule::class
    ]
)
interface ApplicationComponent : AndroidInjector<Application> {

    @Component.Factory
    interface Factory {
        fun build(@BindsInstance applicationContext: Context): ApplicationComponent
    }
}
