package com.github.nantaphop.fluentview.properties;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/**
 * Created by greenfrvr
 */
public interface SeekProps extends ProgressProps {
    
    SeekProps setKeyProgressIncrement(int increment);

    SeekProps setSplitTrack(boolean splitTrack);

    SeekProps setThumb(Drawable thumb);

    SeekProps setThumbOffset(int thumbOffset);

    SeekProps setThumbTintList(ColorStateList tint);

    SeekProps setThumbTintMode(PorterDuff.Mode tintMode);
    
}
