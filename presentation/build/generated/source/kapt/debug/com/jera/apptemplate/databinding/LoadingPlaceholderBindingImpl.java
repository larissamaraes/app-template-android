package com.jera.apptemplate.databinding;
import com.jera.apptemplate.R;
import com.jera.apptemplate.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LoadingPlaceholderBindingImpl extends LoadingPlaceholderBinding implements com.jera.apptemplate.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LoadingPlaceholderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private LoadingPlaceholderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ProgressBar) bindings[1]
            );
        this.actionButton.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.messageTextView.setTag(null);
        this.progressBar.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.jera.apptemplate.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.placeholder == variableId) {
            setPlaceholder((com.jera.apptemplate.util.viewmodel.Placeholder) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPlaceholder(@Nullable com.jera.apptemplate.util.viewmodel.Placeholder Placeholder) {
        this.mPlaceholder = Placeholder;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.placeholder);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int placeholderButtonVisibleViewVISIBLEViewGONE = 0;
        boolean placeholderMessageVisible = false;
        java.lang.String placeholderButtonText = null;
        int placeholderVisibleViewVISIBLEViewGONE = 0;
        int placeholderMessageVisibleViewVISIBLEViewGONE = 0;
        boolean placeholderButtonVisible = false;
        boolean placeholderProgressVisible = false;
        int placeholderProgressVisibleViewVISIBLEViewGONE = 0;
        com.jera.apptemplate.util.viewmodel.Placeholder placeholder = mPlaceholder;
        boolean placeholderVisible = false;
        java.lang.String placeholderMessage = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (placeholder != null) {
                    // read placeholder.messageVisible
                    placeholderMessageVisible = placeholder.getMessageVisible();
                    // read placeholder.buttonText
                    placeholderButtonText = placeholder.getButtonText();
                    // read placeholder.buttonVisible
                    placeholderButtonVisible = placeholder.getButtonVisible();
                    // read placeholder.progressVisible
                    placeholderProgressVisible = placeholder.getProgressVisible();
                    // read placeholder.visible()
                    placeholderVisible = placeholder.visible();
                    // read placeholder.message
                    placeholderMessage = placeholder.getMessage();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(placeholderMessageVisible) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(placeholderButtonVisible) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(placeholderProgressVisible) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(placeholderVisible) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read placeholder.messageVisible ? View.VISIBLE : View.GONE
                placeholderMessageVisibleViewVISIBLEViewGONE = ((placeholderMessageVisible) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read placeholder.buttonVisible ? View.VISIBLE : View.GONE
                placeholderButtonVisibleViewVISIBLEViewGONE = ((placeholderButtonVisible) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read placeholder.progressVisible ? View.VISIBLE : View.GONE
                placeholderProgressVisibleViewVISIBLEViewGONE = ((placeholderProgressVisible) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read placeholder.visible() ? View.VISIBLE : View.GONE
                placeholderVisibleViewVISIBLEViewGONE = ((placeholderVisible) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.actionButton.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.actionButton, placeholderButtonText);
            this.actionButton.setVisibility(placeholderButtonVisibleViewVISIBLEViewGONE);
            this.mboundView0.setVisibility(placeholderVisibleViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.messageTextView, placeholderMessage);
            this.messageTextView.setVisibility(placeholderMessageVisibleViewVISIBLEViewGONE);
            this.progressBar.setVisibility(placeholderProgressVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // placeholder != null
        boolean placeholderJavaLangObjectNull = false;
        // placeholder
        com.jera.apptemplate.util.viewmodel.Placeholder placeholder = mPlaceholder;



        placeholderJavaLangObjectNull = (placeholder) != (null);
        if (placeholderJavaLangObjectNull) {


            placeholder.onActionButtonClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): placeholder
        flag 1 (0x2L): null
        flag 2 (0x3L): placeholder.buttonVisible ? View.VISIBLE : View.GONE
        flag 3 (0x4L): placeholder.buttonVisible ? View.VISIBLE : View.GONE
        flag 4 (0x5L): placeholder.visible() ? View.VISIBLE : View.GONE
        flag 5 (0x6L): placeholder.visible() ? View.VISIBLE : View.GONE
        flag 6 (0x7L): placeholder.messageVisible ? View.VISIBLE : View.GONE
        flag 7 (0x8L): placeholder.messageVisible ? View.VISIBLE : View.GONE
        flag 8 (0x9L): placeholder.progressVisible ? View.VISIBLE : View.GONE
        flag 9 (0xaL): placeholder.progressVisible ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}