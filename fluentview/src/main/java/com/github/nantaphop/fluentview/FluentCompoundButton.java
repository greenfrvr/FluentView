package com.github.nantaphop.fluentview;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

import com.github.nantaphop.fluentview.properties.CompoundButtonProps;

/**
 * Created by nantaphop on 17-Jan-16.
 */
class FluentCompoundButton<T extends CompoundButton> extends FluentButton<T> implements CompoundButtonProps {

    public FluentCompoundButton(T view) {
        super(view);
    }

    @Override
    public CompoundButtonProps setButtonDrawable(Drawable drawable) {
        view.setButtonDrawable(drawable);
        return this;
    }

    @Override
    public CompoundButtonProps setButtonDrawable(int resId) {
        view.setButtonDrawable(resId);
        return this;
    }

    @TargetApi(21)
    @Override
    public CompoundButtonProps setButtonTintList(ColorStateList tint) {
        view.setButtonTintList(tint);
        return this;
    }

    @TargetApi(21)
    @Override
    public CompoundButtonProps setButtonTintMode(PorterDuff.Mode tintMode) {
        view.setButtonTintMode(tintMode);
        return this;
    }

    @Override
    public CompoundButtonProps setChecked(boolean checked) {
        view.setChecked(checked);
        return this;
    }

    @Override
    public CompoundButtonProps setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener listener) {
        view.setOnCheckedChangeListener(listener);
        return this;
    }

    @Override
    public CompoundButtonProps toggle() {
        view.toggle();
        return this;
    }
}
