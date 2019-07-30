package com.mjurkus.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import javax.inject.Inject


class CustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr), ViewWithActivity {

    @Inject
    lateinit var phrases: Phrases

    init {
        LayoutInflater.from(context).inflate(R.layout.view_custom_view, this)
        ViewInjection.inject(this)
    }

    fun doSomething() {
        phrases.doSomething()
    }
}
