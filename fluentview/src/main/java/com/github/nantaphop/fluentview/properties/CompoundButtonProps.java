package com.github.nantaphop.fluentview.properties;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/**
 * Created by greenfrvr
 */
public interface CompoundButtonProps extends TextProps {

    CompoundButtonProps setButtonDrawable(Drawable drawable);

    CompoundButtonProps setButtonDrawable(int resId);

    CompoundButtonProps setButtonTintList(ColorStateList tint);

    CompoundButtonProps setButtonTintMode(PorterDuff.Mode tintMode);

    CompoundButtonProps setChecked(boolean checked);

    CompoundButtonProps setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener listener);

    CompoundButtonProps toggle();

}
