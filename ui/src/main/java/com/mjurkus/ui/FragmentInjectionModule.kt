package com.mjurkus.ui

import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class FragmentInjectionModule {

    @ContributesAndroidInjector
    abstract fun uiFragmentInjector(): UiFragment
}
