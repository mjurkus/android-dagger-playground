package com.mjurkus.dagger

import com.mjurkus.ui.CustomView
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
interface ViewInjectionModule {

    @ContributesAndroidInjector
    fun customViewInjector(): CustomView
}
