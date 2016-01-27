package com.github.nantaphop.fluentview;

import android.widget.EditText;

import com.github.nantaphop.fluentview.properties.EditTextProps;

/**
 * Created by nantaphop on 17-Jan-16.
 */
class FluentEditText<T extends EditText> extends FluentTextView<T> implements EditTextProps {

    public FluentEditText(T view) {
        super(view);
    }

    @Override
    public EditTextProps setSelection(int index) {
        view.setSelection(index);
        return this;
    }

    @Override
    public EditTextProps setSelection(int start, int stop) {
        view.setSelection(start, stop);
        return this;
    }

}
