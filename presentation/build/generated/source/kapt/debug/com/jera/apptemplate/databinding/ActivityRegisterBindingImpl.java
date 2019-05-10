package com.jera.apptemplate.databinding;
import com.jera.apptemplate.R;
import com.jera.apptemplate.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRegisterBindingImpl extends ActivityRegisterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(18);
        sIncludes.setIncludes(1, 
            new String[] {"loading_placeholder"},
            new int[] {2},
            new int[] {com.jera.apptemplate.R.layout.loading_placeholder});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.upload_image, 3);
        sViewsWithIds.put(R.id.upload_text, 4);
        sViewsWithIds.put(R.id.name_input, 5);
        sViewsWithIds.put(R.id.name_edit_text, 6);
        sViewsWithIds.put(R.id.email_input, 7);
        sViewsWithIds.put(R.id.email_edit_text, 8);
        sViewsWithIds.put(R.id.phone_number_input, 9);
        sViewsWithIds.put(R.id.phone_number_edit_text, 10);
        sViewsWithIds.put(R.id.cpf_input, 11);
        sViewsWithIds.put(R.id.cpf_edit_text, 12);
        sViewsWithIds.put(R.id.password_input, 13);
        sViewsWithIds.put(R.id.password_edit_text, 14);
        sViewsWithIds.put(R.id.password_confirmation_input, 15);
        sViewsWithIds.put(R.id.password_confirmation_edit_text, 16);
        sViewsWithIds.put(R.id.submit_button, 17);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final android.widget.FrameLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityRegisterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private ActivityRegisterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[12]
            , (com.google.android.material.textfield.TextInputLayout) bindings[11]
            , (android.widget.EditText) bindings[8]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.jera.apptemplate.databinding.LoadingPlaceholderBinding) bindings[2]
            , (android.widget.EditText) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (android.widget.EditText) bindings[16]
            , (com.google.android.material.textfield.TextInputLayout) bindings[15]
            , (android.widget.EditText) bindings[14]
            , (com.google.android.material.textfield.TextInputLayout) bindings[13]
            , (android.widget.EditText) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[9]
            , (android.widget.Button) bindings[17]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.FrameLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        includedLoading.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (includedLoading.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        includedLoading.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIncludedLoading((com.jera.apptemplate.databinding.LoadingPlaceholderBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncludedLoading(com.jera.apptemplate.databinding.LoadingPlaceholderBinding IncludedLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        // batch finished
        executeBindingsOn(includedLoading);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): includedLoading
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}