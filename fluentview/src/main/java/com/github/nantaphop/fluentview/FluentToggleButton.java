package com.github.nantaphop.fluentview;

import android.graphics.drawable.Drawable;
import android.widget.ToggleButton;

import com.github.nantaphop.fluentview.properties.ToggleProps;

/**
 * Created by nantaphop on 17-Jan-16.
 */
class FluentToggleButton<T extends ToggleButton> extends FluentCompoundButton<T> implements ToggleProps {

    public FluentToggleButton(T view) {
        super(view);
    }

    @Override
    public ToggleProps setBackgroundDrawable(Drawable d) {
        view.setBackgroundDrawable(d);
        return this;
    }

    @Override
    public ToggleProps setTextOff(CharSequence textOff) {
        view.setTextOff(textOff);
        return this;
    }

    @Override
    public ToggleProps setTextOn(CharSequence textOn) {
        view.setTextOn(textOn);
        return this;
    }
}
