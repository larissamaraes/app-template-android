// Generated by Dagger (https://google.github.io/dagger).
package com.jera.apptemplate.presentation.view.user.signin;

import androidx.fragment.app.Fragment;
import com.jera.apptemplate.util.base.BaseActivity_MembersInjector;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

public final class LogInActivity_MembersInjector implements MembersInjector<LogInActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> fragmentInjectorProvider;

  private final Provider<LogInViewModel> viewModelProvider;

  public LogInActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> fragmentInjectorProvider,
      Provider<LogInViewModel> viewModelProvider) {
    this.fragmentInjectorProvider = fragmentInjectorProvider;
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<LogInActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> fragmentInjectorProvider,
      Provider<LogInViewModel> viewModelProvider) {
    return new LogInActivity_MembersInjector(fragmentInjectorProvider, viewModelProvider);
  }

  @Override
  public void injectMembers(LogInActivity instance) {
    BaseActivity_MembersInjector.injectFragmentInjector(instance, fragmentInjectorProvider.get());
    injectViewModel(instance, viewModelProvider.get());
  }

  public static void injectViewModel(LogInActivity instance, LogInViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
