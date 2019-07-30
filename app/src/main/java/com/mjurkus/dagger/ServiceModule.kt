package com.mjurkus.dagger

import com.mjurkus.mvp.SomeService
import dagger.Binds
import dagger.Module

@Module
abstract class ServiceModule {

    @Binds
    abstract fun service(serviceImpl: SomeServiceImpl): SomeService
}
