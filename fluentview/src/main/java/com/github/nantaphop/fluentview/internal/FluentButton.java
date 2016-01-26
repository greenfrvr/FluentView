package com.github.nantaphop.fluentview.internal;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.StringRes;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.view.ActionMode;
import android.view.inputmethod.ExtractedText;
import android.widget.Button;
import android.widget.Scroller;
import android.widget.TextView;

import com.github.nantaphop.fluentview.properties.TextProps;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.Locale;

/**
 * Created by nantaphop on 17-Jan-16.
 */
public class FluentButton<T extends Button> extends FluentView<T> implements TextProps {

    public FluentButton(T button) {
        super(button);
    }

    @Override
    public TextProps setTypeface(Typeface tf, int style) {
        view.setTypeface(tf, style);
        return this;
    }

    @Override
    public TextProps setCompoundDrawables(Drawable left, Drawable top, Drawable right, Drawable bottom) {
        view.setCompoundDrawables(left, top, right, bottom);
        return this;
    }

    @Override
    public TextProps setCompoundDrawablesWithIntrinsicBounds(int left, int top, int right, int bottom) {
        view.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
        return this;
    }

    @Override
    public TextProps setCompoundDrawablesWithIntrinsicBounds(Drawable left, Drawable top, Drawable right, Drawable bottom) {
        view.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
        return this;
    }

    @Override
    public TextProps setCompoundDrawablesRelative(Drawable start, Drawable top, Drawable end, Drawable bottom) {
        view.setCompoundDrawablesRelative(start, top, end, bottom);
        return this;
    }

    @Override
    public TextProps setCompoundDrawablesRelativeWithIntrinsicBounds(int start, int top, int end, int bottom) {
        view.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
        return this;
    }

    @Override
    public TextProps setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable start, Drawable top, Drawable end, Drawable bottom) {
        view.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
        return this;
    }

    @Override
    public TextProps setCompoundDrawablePadding(int pad) {
        view.setCompoundDrawablePadding(pad);
        return this;
    }

    @Override
    public TextProps setCompoundDrawableTintList(ColorStateList tint) {
        view.setCompoundDrawableTintList(tint);
        return this;
    }

    @Override
    public TextProps setCompoundDrawableTintMode(PorterDuff.Mode tintMode) {
        view.setCompoundDrawableTintMode(tintMode);
        return this;
    }

    @Override
    public TextProps setTextAppearance(int resId) {
        view.setTextAppearance(resId);
        return this;
    }

    @Override
    public TextProps setTextLocale(Locale locale) {
        view.setTextLocale(locale);
        return this;
    }

    @Override
    public TextProps setTextSize(float size) {
        view.setTextSize(size);
        return this;
    }

    @Override
    public TextProps setTextSize(int unit, float size) {
        view.setTextSize(unit, size);
        return this;
    }

    @Override
    public TextProps setTextScaleX(float size) {
        view.setTextScaleX(size);
        return this;
    }

    @Override
    public TextProps setTypeface(Typeface tf) {
        view.setTypeface(tf);
        return this;
    }

    @Override
    public TextProps setElegantTextHeight(boolean elegant) {
        view.setElegantTextHeight(elegant);
        return this;
    }

    @Override
    public TextProps setLetterSpacing(float letterSpacing) {
        view.setLetterSpacing(letterSpacing);
        return this;
    }

    @Override
    public TextProps setBreakStrategy(int breakStrategy) {
        view.setBreakStrategy(breakStrategy);
        return this;
    }

    @Override
    public TextProps setHyphenationFrequency(int hyphenationFrequency) {
        view.setHyphenationFrequency(hyphenationFrequency);
        return this;
    }

    @Override
    public TextProps setFontFeatureSettings(String fontFeatureSettings) {
        view.setFontFeatureSettings(fontFeatureSettings);
        return this;
    }

    @Override
    public TextProps setTextColor(int color) {
        view.setTextColor(color);
        return this;
    }

    @Override
    public TextProps setTextColor(ColorStateList colors) {
        view.setTextColor(colors);
        return this;
    }

    @Override
    public TextProps setHighlightColor(int color) {
        view.setHighlightColor(color);
        return this;
    }

    @Override
    public TextProps setShadowLayer(float radius, float dx, float dy, int color) {
        view.setShadowLayer(radius, dx, dy, color);
        return this;
    }

    @Override
    public TextProps setGravity(int gravity) {
        view.setGravity(gravity);
        return this;
    }

    @Override
    public TextProps setPaintFlags(int flags) {
        view.setPaintFlags(flags);
        return this;
    }

    @Override
    public TextProps setHorizontallyScrolling(boolean whether) {
        view.setHorizontallyScrolling(whether);
        return this;
    }

    @Override
    public TextProps setMinLines(int minlines) {
        view.setMinLines(minlines);
        return this;
    }

    @Override
    public TextProps setMinHeight(int minHeight) {
        view.setMinHeight(minHeight);
        return this;
    }

    @Override
    public TextProps setMaxLines(int maxlines) {
        view.setMaxLines(maxlines);
        return this;
    }

    @Override
    public TextProps setMaxHeight(int maxHeight) {
        view.setMaxHeight(maxHeight);
        return this;
    }

    @Override
    public TextProps setLines(int lines) {
        view.setLines(lines);
        return this;
    }

    @Override
    public TextProps setHeight(int pixels) {
        view.setHeight(pixels);
        return this;
    }

    @Override
    public TextProps setMinEms(int minems) {
        view.setMinEms(minems);
        return this;
    }

    @Override
    public TextProps setMinWidth(int minpixels) {
        view.setMinWidth(minpixels);
        return this;
    }

    @Override
    public TextProps setMaxEms(int maxems) {
        view.setMaxEms(maxems);
        return this;
    }

    @Override
    public TextProps setMaxWidth(int maxpixels) {
        view.setMaxWidth(maxpixels);
        return this;
    }

    @Override
    public TextProps setEms(int ems) {
        view.setEms(ems);
        return this;
    }

    @Override
    public TextProps setWidth(int pixels) {
        view.setWidth(pixels);
        return this;
    }

    @Override
    public TextProps setLineSpacing(float add, float mult) {
        view.setLineSpacing(add, mult);
        return this;
    }

    @Override
    public TextProps setFreezesText(boolean freezesText) {
        view.setFreezesText(freezesText);
        return this;
    }

    @Override
    public TextProps setText(CharSequence text, TextView.BufferType type) {
        view.setText(text, type);
        return this;
    }

    @Override
    public TextProps setText(String text) {
        view.setText(text);
        return this;
    }

    @Override
    public TextProps setText(@StringRes int stringRes) {
        view.setText(stringRes);
        return this;
    }

    @Override
    public TextProps setCustomInsertionActionModeCallback(ActionMode.Callback actionModeCallback) {
        view.setCustomInsertionActionModeCallback(actionModeCallback);
        return this;
    }

    @Override
    public TextProps setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        view.setCustomSelectionActionModeCallback(actionModeCallback);
        return this;
    }

    @Override
    public TextProps setScroller(Scroller s) {
        view.setScroller(s);
        return this;
    }

    @Override
    public TextProps setCursorVisible(boolean visible) {
        view.setCursorVisible(visible);
        return this;
    }

    @Override
    public TextProps setSelectAllOnFocus(boolean selectAllOnFocus) {
        view.setSelectAllOnFocus(selectAllOnFocus);
        return this;
    }

    @Override
    public TextProps setMarqueeRepeatLimit(int marqueeLimit) {
        view.setMarqueeRepeatLimit(marqueeLimit);
        return this;
    }

    @Override
    public TextProps setEllipsize(TextUtils.TruncateAt where) {
        view.setEllipsize(where);
        return this;
    }

    @Override
    public TextProps setSingleLine(boolean singleLine) {
        view.setSingleLine(singleLine);
        return this;
    }

    @Override
    public TextProps setAllCaps(boolean allCaps) {
        view.setAllCaps(allCaps);
        return this;
    }

    @Override
    public TextProps setSingleLine() {
        view.setSingleLine();
        return this;
    }

    @Override
    public TextProps setIncludeFontPadding(boolean includepad) {
        view.setIncludeFontPadding(includepad);
        return this;
    }

    @Override
    public TextProps setExtractedText(ExtractedText text) {
        view.setExtractedText(text);
        return this;
    }

    @Override
    public TextProps setTextIsSelectable(boolean selectable) {
        view.setTextIsSelectable(selectable);
        return this;
    }

    @Override
    public TextProps setFilters(InputFilter[] filters) {
        view.setFilters(filters);
        return this;
    }

    @Override
    public TextProps setError(CharSequence error, Drawable icon) {
        view.setError(error, icon);
        return this;
    }

    @Override
    public TextProps setError(CharSequence error) {
        view.setError(error);
        return this;
    }

    @Override
    public TextProps setInputExtras(int xmlResId) throws XmlPullParserException, IOException {
        view.setInputExtras(xmlResId);
        return this;
    }

    @Override
    public TextProps setPrivateImeOptions(String type) {
        view.setPrivateImeOptions(type);
        return this;
    }

    @Override
    public TextProps setOnEditorActionListener(TextView.OnEditorActionListener l) {
        view.setOnEditorActionListener(l);
        return this;
    }

    @Override
    public TextProps setImeActionLabel(CharSequence label, int actionId) {
        view.setImeActionLabel(label, actionId);
        return this;
    }

    @Override
    public TextProps setImeOptions(int imeOptions) {
        view.setImeOptions(imeOptions);
        return this;
    }

    @Override
    public TextProps setRawInputType(int type) {
        view.setRawInputType(type);
        return this;
    }

    @Override
    public TextProps setInputType(int type) {
        view.setInputType(type);
        return this;
    }

    @Override
    public TextProps setKeyListener(KeyListener input) {
        view.setKeyListener(input);
        return this;
    }

}
