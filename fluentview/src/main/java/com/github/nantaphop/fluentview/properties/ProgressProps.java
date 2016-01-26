package com.github.nantaphop.fluentview.properties;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;

/**
 * Created by greenfrvr
 */
public interface ProgressProps extends ViewProps {

    ProgressProps setIndeterminate(boolean indeterminate);

    ProgressProps setIndeterminateDrawable(Drawable d);

    ProgressProps setIndeterminateDrawableTiled(Drawable d);

    ProgressProps setIndeterminateTintList(ColorStateList tint);

    ProgressProps setIndeterminateTintMode(PorterDuff.Mode tintMode);

    ProgressProps setInterpolator(Context context, int resID);

    ProgressProps setInterpolator(Interpolator interpolator);

    ProgressProps setMax(int max);

    ProgressProps setProgress(int progress);

    ProgressProps setProgressBackgroundTintList(ColorStateList tint);

    ProgressProps setProgressBackgroundTintMode(PorterDuff.Mode tintMode);

    ProgressProps setProgressDrawable(Drawable d);

    ProgressProps setProgressDrawableTiled(Drawable d);

    ProgressProps setProgressTintList(ColorStateList tint);

    ProgressProps setProgressTintMode(PorterDuff.Mode tintMode);

    ProgressProps setSecondaryProgress(int secondaryProgress);

    ProgressProps setSecondaryProgressTintList(ColorStateList tint);

    ProgressProps setSecondaryProgressTintMode(PorterDuff.Mode tintMode);

}
