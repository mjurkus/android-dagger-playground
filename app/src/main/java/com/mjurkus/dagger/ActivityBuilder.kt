package com.mjurkus.dagger

import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
interface ActivityBuilder {

    @ContributesAndroidInjector(modules = [ActivityModule::class])
    fun bindMainActivity(): MainActivity
}
