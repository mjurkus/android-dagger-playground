package com.mjurkus.dagger

import com.mjurkus.ui.FragmentInjectionModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(
        modules = [
            ServiceModule::class,
            FragmentInjectionModule::class,
            ViewInjectionModule::class
        ]
    )
    abstract fun mainActivity(): MainActivity
}
