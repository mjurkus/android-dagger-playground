package com.mjurkus.dagger

import android.content.res.Resources
import com.mjurkus.mvp.SomeService
import javax.inject.Inject


class SomeServiceImpl @Inject constructor(
    mainActivity: MainActivity,
    resource: Resources
) : SomeService {

    override val value: String
        get() = "foo"
}
