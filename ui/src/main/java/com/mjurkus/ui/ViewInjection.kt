package com.mjurkus.ui

import android.app.Activity
import android.content.ContextWrapper
import android.view.View
import com.mjurkus.mvp.HasViewInjector


object ViewInjection {

    fun inject(view: View) {
        val activity = view.getActivity()
        if (activity !is HasViewInjector) {
            throw RuntimeException("${activity.javaClass.canonicalName}} does not implement ${HasViewInjector::class.java.canonicalName}")
        }

        (activity as HasViewInjector).viewInjector().inject(view)
    }

    private fun View.getActivity(): Activity {
        var ctx = context
        while (ctx is ContextWrapper) {
            if (ctx is Activity) {
                return ctx
            }
            ctx = ctx.baseContext
        }

        throw IllegalStateException("Context does not stem from an activity: $context")
    }
}
