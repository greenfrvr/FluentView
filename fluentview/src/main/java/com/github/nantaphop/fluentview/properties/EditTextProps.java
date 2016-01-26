package com.github.nantaphop.fluentview.properties;

/**
 * Created by greenfrvr
 */
public interface EditTextProps extends TextProps {

    EditTextProps setSelection(int index);

    EditTextProps setSelection(int start, int stop);

}