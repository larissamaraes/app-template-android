package com.jera.apptemplate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jera.apptemplate.util.viewmodel.Placeholder;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LoadingPlaceholderBinding extends ViewDataBinding {
  @NonNull
  public final Button actionButton;

  @NonNull
  public final TextView messageTextView;

  @NonNull
  public final ProgressBar progressBar;

  @Bindable
  protected Placeholder mPlaceholder;

  protected LoadingPlaceholderBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button actionButton, TextView messageTextView, ProgressBar progressBar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.actionButton = actionButton;
    this.messageTextView = messageTextView;
    this.progressBar = progressBar;
  }

  public abstract void setPlaceholder(@Nullable Placeholder placeholder);

  @Nullable
  public Placeholder getPlaceholder() {
    return mPlaceholder;
  }

  @NonNull
  public static LoadingPlaceholderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.loading_placeholder, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LoadingPlaceholderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LoadingPlaceholderBinding>inflateInternal(inflater, com.jera.apptemplate.R.layout.loading_placeholder, root, attachToRoot, component);
  }

  @NonNull
  public static LoadingPlaceholderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.loading_placeholder, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LoadingPlaceholderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LoadingPlaceholderBinding>inflateInternal(inflater, com.jera.apptemplate.R.layout.loading_placeholder, null, false, component);
  }

  public static LoadingPlaceholderBinding bind(@NonNull View view) {
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
  public static LoadingPlaceholderBinding bind(@NonNull View view, @Nullable Object component) {
    return (LoadingPlaceholderBinding)bind(component, view, com.jera.apptemplate.R.layout.loading_placeholder);
  }
}
