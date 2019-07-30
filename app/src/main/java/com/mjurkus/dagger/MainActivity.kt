package com.mjurkus.dagger

import android.content.res.Resources
import android.os.Bundle
import android.util.Log
import com.mjurkus.mvp.BaseActivity
import com.mjurkus.mvp.SomeService
import com.mjurkus.ui.UiFragment
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var res: Resources
    @Inject
    lateinit var service: SomeService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("demo", service.value)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, UiFragment())
            .commit()
    }
}
