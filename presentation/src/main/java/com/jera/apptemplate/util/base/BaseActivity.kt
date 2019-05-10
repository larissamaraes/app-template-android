package com.jera.apptemplate.util.base

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import com.jera.apptemplate.presentation.AppTemplateApplication
import com.jera.apptemplate.util.extension.observeEvent
import com.jera.apptemplate.util.extension.shortToast
import com.jera.apptemplate.util.extension.showDialog
import com.jera.apptemplate.util.navigation.NavData
import com.jera.apptemplate.util.navigation.Navigator
import com.jera.apptemplate.util.viewmodel.DialogData
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

abstract class BaseActivity : AppCompatActivity(), HasSupportFragmentInjector {

    @Inject
    protected lateinit var fragmentInjector: DispatchingAndroidInjector<androidx.fragment.app.Fragment>

    private var dialog: Dialog? = null

    abstract val baseViewModel: BaseViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        lifecycle.addObserver(baseViewModel)
        subscribeUi()
    }

    open fun subscribeUi() {
        baseViewModel.dialog.observeEvent(this, ::onNextDialog)
        baseViewModel.goTo.observeEvent(this, ::onGoTo)
        baseViewModel.toast.observeEvent(this, ::onNextToast)
    }

    override fun supportFragmentInjector(): AndroidInjector<androidx.fragment.app.Fragment> {
        return fragmentInjector
    }

    private fun onNextDialog(dialogData: DialogData?) {
        dialog?.dismiss()
        dialog = dialogData?.let { showDialog(it) }
    }

    private fun onGoTo(navData: NavData?) {
        navData?.let {
            Navigator.goTo(this, it)
        }
    }

    private fun onNextToast(text: String?) {
        text?.let {
            shortToast(it)
        }
    }
}
