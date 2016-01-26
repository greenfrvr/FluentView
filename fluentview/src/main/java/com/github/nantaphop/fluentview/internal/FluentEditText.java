package com.github.nantaphop.fluentview.internal;

import android.widget.EditText;

import com.github.nantaphop.fluentview.properties.EditTextProps;

/**
 * Created by nantaphop on 17-Jan-16.
 */
public class FluentEditText extends FluentTextView<EditText> implements EditTextProps {

    public FluentEditText(EditText editText) {
        super(editText);
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
