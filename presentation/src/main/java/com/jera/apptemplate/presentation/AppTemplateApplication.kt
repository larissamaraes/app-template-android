package com.jera.apptemplate.presentation

import android.app.Activity
import androidx.multidex.MultiDexApplication
import androidx.fragment.app.Fragment
import com.jera.apptemplate.data.util.storage.PreferencesCache
import com.jera.apptemplate.presentation.graph.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject


class AppTemplateApplication : MultiDexApplication(), HasActivityInjector {

    @Inject
    lateinit var mFragmentInjector: DispatchingAndroidInjector<androidx.fragment.app.Fragment>

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        PreferencesCache.init(this)
        DaggerAppComponent.builder()
                .context(this)
                .build()
                .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector
}
