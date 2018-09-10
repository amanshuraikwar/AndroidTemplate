package io.github.amanshuraikwar.androidtemplate.ui.home

import io.github.amanshuraikwar.androidtemplate.bus.AppBus
import io.github.amanshuraikwar.androidtemplate.data.DataManager
import io.github.amanshuraikwar.androidtemplate.ui.base.BasePresenterImpl
import io.github.amanshuraikwar.androidtemplate.util.Util
import javax.inject.Inject

/**
 * Implementation of presenter of HomeActivity.
 *
 * @author Amanshu Raikwar
 * Created by Amanshu Raikwar on 30/04/18.
 */
class HomePresenter @Inject constructor(appBus: AppBus, dataManager: DataManager)
    : BasePresenterImpl<HomeContract.View>(appBus, dataManager), HomeContract.Presenter {

    private val TAG = Util.getTag(this)

    //region parent class methods
    override fun onAttach(wasViewRecreated: Boolean) {
        super.onAttach(wasViewRecreated)
    }
    //endregion
}