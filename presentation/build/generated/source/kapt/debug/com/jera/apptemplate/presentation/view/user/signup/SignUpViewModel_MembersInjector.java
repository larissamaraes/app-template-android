// Generated by Dagger (https://google.github.io/dagger).
package com.jera.apptemplate.presentation.view.user.signup;

import com.jera.apptemplate.util.base.BaseViewModel_MembersInjector;
import com.jera.apptemplate.util.error.ErrorHandler;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class SignUpViewModel_MembersInjector implements MembersInjector<SignUpViewModel> {
  private final Provider<ErrorHandler> errorHandlerProvider;

  public SignUpViewModel_MembersInjector(Provider<ErrorHandler> errorHandlerProvider) {
    this.errorHandlerProvider = errorHandlerProvider;
  }

  public static MembersInjector<SignUpViewModel> create(
      Provider<ErrorHandler> errorHandlerProvider) {
    return new SignUpViewModel_MembersInjector(errorHandlerProvider);
  }

  @Override
  public void injectMembers(SignUpViewModel instance) {
    BaseViewModel_MembersInjector.injectErrorHandler(instance, errorHandlerProvider.get());
  }
}
