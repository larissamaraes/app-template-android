// Generated by Dagger (https://google.github.io/dagger).
package com.jera.apptemplate.util.base;

import android.support.v4.app.Fragment;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

public final class BaseActivity_MembersInjector implements MembersInjector<BaseActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> fragmentInjectorProvider;

  public BaseActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> fragmentInjectorProvider) {
    this.fragmentInjectorProvider = fragmentInjectorProvider;
  }

  public static MembersInjector<BaseActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> fragmentInjectorProvider) {
    return new BaseActivity_MembersInjector(fragmentInjectorProvider);
  }

  @Override
  public void injectMembers(BaseActivity instance) {
    injectFragmentInjector(instance, fragmentInjectorProvider.get());
  }

  public static void injectFragmentInjector(
      BaseActivity instance, DispatchingAndroidInjector<Fragment> fragmentInjector) {
    instance.fragmentInjector = fragmentInjector;
  }
}
