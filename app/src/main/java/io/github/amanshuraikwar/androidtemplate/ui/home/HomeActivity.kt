package io.github.amanshuraikwar.androidtemplate.ui.home

import android.os.Bundle
import io.github.amanshuraikwar.androidtemplate.R
import io.github.amanshuraikwar.androidtemplate.ui.base.BaseActivity
import io.github.amanshuraikwar.androidtemplate.util.Util

class HomeActivity : BaseActivity<HomeContract.View, HomeContract.Presenter>(), HomeContract.View {

    @Suppress("PrivatePropertyName")
    private val TAG = Util.getTag(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}
