package io.github.amanshuraikwar.androidtemplate.ui.home

import io.github.amanshuraikwar.androidtemplate.ui.base.BasePresenter
import io.github.amanshuraikwar.androidtemplate.ui.base.BaseView

/**
 * MVP contract of HomeActivity.
 *
 * @author Amanshu Raikwar
 * Created by Amanshu Raikwar on 30/04/18.
 */
interface HomeContract {

    interface View : BaseView

    interface Presenter : BasePresenter<View>
}