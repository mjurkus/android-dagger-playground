package com.mjurkus.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mjurkus.mvp.SomeService
import kotlinx.android.synthetic.main.fragment_ui.*
import javax.inject.Inject


class UiFragment : BaseFragment() {

    @Inject
    lateinit var someService: SomeService

    @Inject
    lateinit var phrases: Phrases

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_ui, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        someService.value

        phrases.doSomething()

        custom_view.doSomething()
    }
}
