// Generated by Dagger (https://google.github.io/dagger).
package com.jera.apptemplate.presentation;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

public final class AppTemplateApplication_MembersInjector
    implements MembersInjector<AppTemplateApplication> {
  private final Provider<DispatchingAndroidInjector<Fragment>> mFragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider;

  public AppTemplateApplication_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> mFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider) {
    this.mFragmentInjectorProvider = mFragmentInjectorProvider;
    this.dispatchingAndroidInjectorProvider = dispatchingAndroidInjectorProvider;
  }

  public static MembersInjector<AppTemplateApplication> create(
      Provider<DispatchingAndroidInjector<Fragment>> mFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider) {
    return new AppTemplateApplication_MembersInjector(
        mFragmentInjectorProvider, dispatchingAndroidInjectorProvider);
  }

  @Override
  public void injectMembers(AppTemplateApplication instance) {
    injectMFragmentInjector(instance, mFragmentInjectorProvider.get());
    injectDispatchingAndroidInjector(instance, dispatchingAndroidInjectorProvider.get());
  }

  public static void injectMFragmentInjector(
      AppTemplateApplication instance, DispatchingAndroidInjector<Fragment> mFragmentInjector) {
    instance.mFragmentInjector = mFragmentInjector;
  }

  public static void injectDispatchingAndroidInjector(
      AppTemplateApplication instance,
      DispatchingAndroidInjector<Activity> dispatchingAndroidInjector) {
    instance.dispatchingAndroidInjector = dispatchingAndroidInjector;
  }
}
