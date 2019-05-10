package com.jera.apptemplate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLoginBinding extends ViewDataBinding {
  @NonNull
  public final TextInputLayout emailInput;

  @NonNull
  public final LinearLayout facebookButton;

  @NonNull
  public final LinearLayout googleButton;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LoadingPlaceholderBinding includedLoading;

  @NonNull
  public final TextInputLayout passwordInput;

  @NonNull
  public final TextView recoverPasswordButton;

  @NonNull
  public final TextView registerButton;

  @NonNull
  public final Button submitButton;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  protected ActivityLoginBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextInputLayout emailInput, LinearLayout facebookButton, LinearLayout googleButton,
      ImageView imageView, LoadingPlaceholderBinding includedLoading, TextInputLayout passwordInput,
      TextView recoverPasswordButton, TextView registerButton, Button submitButton,
      TextView textView, TextView textView2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.emailInput = emailInput;
    this.facebookButton = facebookButton;
    this.googleButton = googleButton;
    this.imageView = imageView;
    this.includedLoading = includedLoading;
    setContainedBinding(this.includedLoading);;
    this.passwordInput = passwordInput;
    this.recoverPasswordButton = recoverPasswordButton;
    this.registerButton = registerButton;
    this.submitButton = submitButton;
    this.textView = textView;
    this.textView2 = textView2;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_login, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLoginBinding>inflateInternal(inflater, com.jera.apptemplate.R.layout.activity_login, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_login, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLoginBinding>inflateInternal(inflater, com.jera.apptemplate.R.layout.activity_login, null, false, component);
  }

  public static ActivityLoginBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityLoginBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityLoginBinding)bind(component, view, com.jera.apptemplate.R.layout.activity_login);
  }
}
