package com.mjurkus.dagger

import android.content.Context
import android.content.res.Resources
import com.mjurkus.ui.Phrases
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule {

    @Provides
    fun resources(context: Context): Resources {
        return context.resources
    }

    @Provides
    fun phrases(): Phrases {
        return PhrasesImpl()
    }
}
