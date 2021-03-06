// Generated by Dagger (https://google.github.io/dagger).
package com.jera.apptemplate.domain.interactors.user;

import com.jera.apptemplate.domain.util.storage.Cache;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class GetPersistedUser_Factory implements Factory<GetPersistedUser> {
  private final Provider<Cache> arg0Provider;

  public GetPersistedUser_Factory(Provider<Cache> arg0Provider) {
    this.arg0Provider = arg0Provider;
  }

  @Override
  public GetPersistedUser get() {
    return new GetPersistedUser(arg0Provider.get());
  }

  public static GetPersistedUser_Factory create(Provider<Cache> arg0Provider) {
    return new GetPersistedUser_Factory(arg0Provider);
  }
}
