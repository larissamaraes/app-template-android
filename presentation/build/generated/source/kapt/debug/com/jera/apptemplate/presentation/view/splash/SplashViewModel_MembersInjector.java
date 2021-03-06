// Generated by Dagger (https://google.github.io/dagger).
package com.jera.apptemplate.presentation.view.splash;

import com.jera.apptemplate.util.base.BaseViewModel_MembersInjector;
import com.jera.apptemplate.util.error.ErrorHandler;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class SplashViewModel_MembersInjector implements MembersInjector<SplashViewModel> {
  private final Provider<ErrorHandler> errorHandlerProvider;

  public SplashViewModel_MembersInjector(Provider<ErrorHandler> errorHandlerProvider) {
    this.errorHandlerProvider = errorHandlerProvider;
  }

  public static MembersInjector<SplashViewModel> create(
      Provider<ErrorHandler> errorHandlerProvider) {
    return new SplashViewModel_MembersInjector(errorHandlerProvider);
  }

  @Override
  public void injectMembers(SplashViewModel instance) {
    BaseViewModel_MembersInjector.injectErrorHandler(instance, errorHandlerProvider.get());
  }
}
