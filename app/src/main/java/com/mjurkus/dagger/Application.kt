package com.mjurkus.dagger

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication


class Application : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<Application> {
        return DaggerApplicationComponent.factory()
            .build(this)
    }
}
