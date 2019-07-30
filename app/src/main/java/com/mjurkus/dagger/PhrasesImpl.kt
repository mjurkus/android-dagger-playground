package com.mjurkus.dagger

import android.util.Log
import com.mjurkus.ui.Phrases


class PhrasesImpl : Phrases {
    override fun doSomething() {
        Log.d("PhrasesImpl", "Doing something fancy")
    }
}
