package com.github.nantaphop.fluentview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;

import com.github.nantaphop.fluentview.properties.ProgressProps;

/**
 * Created by nantaphop on 17-Jan-16.
 */
class FluentProgressBar<T extends ProgressBar> extends FluentView<T> implements ProgressProps {

    public FluentProgressBar(T view) {
        super(view);
    }

    @Override
    public ProgressProps setIndeterminate(boolean indeterminate) {
        view.setIndeterminate(indeterminate);
        return this;
    }
    
    @Override
    public ProgressProps setIndeterminateDrawable(Drawable d) {
        view.setIndeterminateDrawable(d);
        return this;
    }

    @TargetApi(21)
    @Override
    public ProgressProps setIndeterminateDrawableTiled(Drawable d) {
        view.setIndeterminateDrawableTiled(d);
        return this;
    }

    @TargetApi(21)
    @Override
    public ProgressProps setIndeterminateTintList(ColorStateList tint) {
        view.setIndeterminateTintList(tint);
        return this;
    }

    @TargetApi(21)
    @Override
    public ProgressProps setIndeterminateTintMode(PorterDuff.Mode tintMode) {
        view.setIndeterminateTintMode(tintMode);
        return this;
    }
    
    @Override
    public ProgressProps setInterpolator(Context context, int resID) {
        view.setInterpolator(context, resID);
        return this;
    }
    
    @Override
    public ProgressProps setInterpolator(Interpolator interpolator) {
        view.setInterpolator(interpolator);
        return this;
    }
    
    @Override
    public ProgressProps setMax(int max) {
        view.setMax(max);
        return this;
    }
    
    @Override
    public ProgressProps setProgress(int progress) {
        view.setProgress(progress);
        return this;
    }

    @TargetApi(21)
    @Override
    public ProgressProps setProgressBackgroundTintList(ColorStateList tint) {
        view.setProgressBackgroundTintList(tint);
        return this;
    }

    @TargetApi(21)
    @Override
    public ProgressProps setProgressBackgroundTintMode(PorterDuff.Mode tintMode) {
        view.setProgressBackgroundTintMode(tintMode);
        return this;
    }
    
    @Override
    public ProgressProps setProgressDrawable(Drawable d) {
        view.setProgressDrawable(d);
        return this;
    }

    @TargetApi(21)
    @Override
    public ProgressProps setProgressDrawableTiled(Drawable d) {
        view.setProgressDrawableTiled(d);
        return this;
    }

    @TargetApi(21)
    @Override
    public ProgressProps setProgressTintList(ColorStateList tint) {
        view.setProgressTintList(tint);
        return this;
    }

    @TargetApi(21)
    @Override
    public ProgressProps setProgressTintMode(PorterDuff.Mode tintMode) {
        view.setProgressTintMode(tintMode);
        return this;
    }
    
    @Override
    public ProgressProps setSecondaryProgress(int secondaryProgress) {
        view.setSecondaryProgress(secondaryProgress);
        return this;
    }

    @TargetApi(21)
    @Override
    public ProgressProps setSecondaryProgressTintList(ColorStateList tint) {
        view.setSecondaryProgressTintList(tint);
        return this;
    }

    @TargetApi(21)
    @Override
    public ProgressProps setSecondaryProgressTintMode(PorterDuff.Mode tintMode) {
        view.setSecondaryProgressTintMode(tintMode);
        return this;
    }
    
    @Override
    public ProgressProps setVisibility(int v) {
        view.setVisibility(v);
        return this;
    }
}
