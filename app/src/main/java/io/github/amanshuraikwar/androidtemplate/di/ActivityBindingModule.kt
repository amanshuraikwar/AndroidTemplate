package io.github.amanshuraikwar.androidtemplate.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.github.amanshuraikwar.androidtemplate.ui.home.HomeActivity
import io.github.amanshuraikwar.androidtemplate.ui.home.HomeModule

/**
 * Created by Amanshu Raikwar on 07/03/18.
 */

@Module abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [(HomeModule::class)])
    abstract fun home(): HomeActivity
}