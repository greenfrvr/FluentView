package com.github.nantaphop.fluentview.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.Switch;

import com.github.nantaphop.fluentview.properties.SwitchProps;

/**
 * Created by nantaphop on 17-Jan-16.
 */
public class FluentSwitch extends FluentCompoundButton<Switch> implements SwitchProps {

    public FluentSwitch(Switch view) {
        super(view);
    }

    @Override
    public SwitchProps setShowText(boolean showText) {
        view.setShowText(showText);
        return this;
    }

    @Override
    public SwitchProps setSplitTrack(boolean splitTrack) {
        view.setSplitTrack(splitTrack);
        return this;
    }

    @Override
    public SwitchProps setSwitchMinWidth(int pixels) {
        view.setSwitchMinWidth(pixels);
        return this;
    }

    @Override
    public SwitchProps setSwitchPadding(int pixels) {
        view.setSwitchPadding(pixels);
        return this;
    }

    @Override
    public SwitchProps setSwitchTextAppearance(Context context, int resid) {
        view.setSwitchTextAppearance(context, resid);
        return this;
    }

    @Override
    public SwitchProps setSwitchTypeface(Typeface tf) {
        view.setSwitchTypeface(tf);
        return this;
    }

    @Override
    public SwitchProps setSwitchTypeface(Typeface tf, int style) {
        view.setSwitchTypeface(tf, style);
        return this;
    }

    @Override
    public SwitchProps setTextOff(CharSequence textOff) {
        view.setTextOff(textOff);
        return this;
    }

    @Override
    public SwitchProps setTextOn(CharSequence textOn) {
        view.setTextOn(textOn);
        return this;
    }

    @Override
    public SwitchProps setThumbDrawable(Drawable thumb) {
        view.setThumbDrawable(thumb);
        return this;
    }

    @Override
    public SwitchProps setThumbResource(int resId) {
        view.setThumbResource(resId);
        return this;
    }

    @Override
    public SwitchProps setThumbTextPadding(int pixels) {
        view.setThumbTextPadding(pixels);
        return this;
    }

    @Override
    public SwitchProps setThumbTintList(ColorStateList tint) {
        view.setThumbTintList(tint);
        return this;
    }

    @Override
    public SwitchProps setThumbTintMode(PorterDuff.Mode tintMode) {
        view.setThumbTintMode(tintMode);
        return this;
    }

    @Override
    public SwitchProps setTrackDrawable(Drawable track) {
        view.setTrackDrawable(track);
        return this;
    }

    @Override
    public SwitchProps setTrackResource(int resId) {
        view.setTrackResource(resId);
        return this;
    }

    @Override
    public SwitchProps setTrackTintList(ColorStateList tint) {
        view.setTrackTintList(tint);
        return this;
    }

    @Override
    public SwitchProps setTrackTintMode(PorterDuff.Mode tintMode) {
        view.setTrackTintMode(tintMode);
        return this;
    }
}
