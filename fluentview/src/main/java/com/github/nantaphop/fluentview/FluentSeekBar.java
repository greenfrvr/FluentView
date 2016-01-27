package com.github.nantaphop.fluentview;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;

import com.github.nantaphop.fluentview.properties.SeekProps;

/**
 * Created by nantaphop on 17-Jan-16.
 */
class FluentSeekBar<T extends SeekBar> extends FluentProgressBar<T> implements SeekProps {

    public FluentSeekBar(T view) {
        super(view);
    }

    @Override
    public SeekProps setKeyProgressIncrement(int increment) {
        view.setKeyProgressIncrement(increment);
        return this;
    }

    @TargetApi(21)
    @Override
    public SeekProps setSplitTrack(boolean splitTrack) {
        view.setSplitTrack(splitTrack);
        return this;
    }

    @Override
    public SeekProps setThumb(Drawable thumb) {
        view.setThumb(thumb);
        return this;
    }

    @Override
    public SeekProps setThumbOffset(int thumbOffset) {
        view.setThumbOffset(thumbOffset);
        return this;
    }

    @TargetApi(21)
    @Override
    public SeekProps setThumbTintList(ColorStateList tint) {
        view.setThumbTintList(tint);
        return this;
    }

    @TargetApi(21)
    @Override
    public SeekProps setThumbTintMode(PorterDuff.Mode tintMode) {
        view.setThumbTintMode(tintMode);
        return this;
    }
}
