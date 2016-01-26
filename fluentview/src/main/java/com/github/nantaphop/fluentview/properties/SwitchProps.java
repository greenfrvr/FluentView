package com.github.nantaphop.fluentview.properties;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/**
 * Created by greenfrvr
 */
public interface SwitchProps extends CompoundButtonProps {

    SwitchProps setShowText(boolean showText);

    SwitchProps setSplitTrack(boolean splitTrack);

    SwitchProps setSwitchMinWidth(int pixels);

    SwitchProps setSwitchPadding(int pixels);

    SwitchProps setSwitchTextAppearance(Context context, int resid);

    SwitchProps setSwitchTypeface(Typeface tf);

    SwitchProps setSwitchTypeface(Typeface tf, int style);

    SwitchProps setTextOff(CharSequence textOff);

    SwitchProps setTextOn(CharSequence textOn);

    SwitchProps setThumbDrawable(Drawable thumb);

    SwitchProps setThumbResource(int resId);

    SwitchProps setThumbTextPadding(int pixels);

    SwitchProps setThumbTintList(ColorStateList tint);

    SwitchProps setThumbTintMode(PorterDuff.Mode tintMode);

    SwitchProps setTrackDrawable(Drawable track);

    SwitchProps setTrackResource(int resId);

    SwitchProps setTrackTintList(ColorStateList tint);

    SwitchProps setTrackTintMode(PorterDuff.Mode tintMode);
    
}
