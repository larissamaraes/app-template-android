package com.jera.apptemplate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityRegisterBinding extends ViewDataBinding {
  @NonNull
  public final EditText cpfEditText;

  @NonNull
  public final TextInputLayout cpfInput;

  @NonNull
  public final EditText emailEditText;

  @NonNull
  public final TextInputLayout emailInput;

  @NonNull
  public final LoadingPlaceholderBinding includedLoading;

  @NonNull
  public final EditText nameEditText;

  @NonNull
  public final TextInputLayout nameInput;

  @NonNull
  public final EditText passwordConfirmationEditText;

  @NonNull
  public final TextInputLayout passwordConfirmationInput;

  @NonNull
  public final EditText passwordEditText;

  @NonNull
  public final TextInputLayout passwordInput;

  @NonNull
  public final EditText phoneNumberEditText;

  @NonNull
  public final TextInputLayout phoneNumberInput;

  @NonNull
  public final Button submitButton;

  @NonNull
  public final ImageView uploadImage;

  @NonNull
  public final TextView uploadText;

  protected ActivityRegisterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText cpfEditText, TextInputLayout cpfInput, EditText emailEditText,
      TextInputLayout emailInput, LoadingPlaceholderBinding includedLoading, EditText nameEditText,
      TextInputLayout nameInput, EditText passwordConfirmationEditText,
      TextInputLayout passwordConfirmationInput, EditText passwordEditText,
      TextInputLayout passwordInput, EditText phoneNumberEditText, TextInputLayout phoneNumberInput,
      Button submitButton, ImageView uploadImage, TextView uploadText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cpfEditText = cpfEditText;
    this.cpfInput = cpfInput;
    this.emailEditText = emailEditText;
    this.emailInput = emailInput;
    this.includedLoading = includedLoading;
    setContainedBinding(this.includedLoading);;
    this.nameEditText = nameEditText;
    this.nameInput = nameInput;
    this.passwordConfirmationEditText = passwordConfirmationEditText;
    this.passwordConfirmationInput = passwordConfirmationInput;
    this.passwordEditText = passwordEditText;
    this.passwordInput = passwordInput;
    this.phoneNumberEditText = phoneNumberEditText;
    this.phoneNumberInput = phoneNumberInput;
    this.submitButton = submitButton;
    this.uploadImage = uploadImage;
    this.uploadText = uploadText;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_register, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityRegisterBinding>inflateInternal(inflater, com.jera.apptemplate.R.layout.activity_register, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_register, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityRegisterBinding>inflateInternal(inflater, com.jera.apptemplate.R.layout.activity_register, null, false, component);
  }

  public static ActivityRegisterBinding bind(@NonNull View view) {
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
  public static ActivityRegisterBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityRegisterBinding)bind(component, view, com.jera.apptemplate.R.layout.activity_register);
  }
}
