package com.github.nantaphop.fluentview.properties;

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
import android.widget.Scroller;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.Locale;

/**
 * Created by greenfrvr
 */
public interface TextProps extends ViewProps {

    TextProps setTypeface(Typeface tf, int style);

    TextProps setCompoundDrawables(Drawable left, Drawable top, Drawable right, Drawable bottom);

    TextProps setCompoundDrawablesWithIntrinsicBounds(int left, int top, int right, int bottom);

    TextProps setCompoundDrawablesWithIntrinsicBounds(Drawable left, Drawable top, Drawable right, Drawable bottom);

    TextProps setCompoundDrawablesRelative(Drawable start, Drawable top, Drawable end, Drawable bottom);

    TextProps setCompoundDrawablesRelativeWithIntrinsicBounds(int start, int top, int end, int bottom);

    TextProps setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable start, Drawable top, Drawable end, Drawable bottom);

    TextProps setCompoundDrawablePadding(int pad);

    TextProps setCompoundDrawableTintList(ColorStateList tint);

    TextProps setCompoundDrawableTintMode(PorterDuff.Mode tintMode);

    TextProps setTextAppearance(int resId);

    TextProps setTextLocale(Locale locale);

    TextProps setTextSize(float size);

    TextProps setTextSize(int unit, float size);

    TextProps setTextScaleX(float size);

    TextProps setTypeface(Typeface tf);

    TextProps setElegantTextHeight(boolean elegant);

    TextProps setLetterSpacing(float letterSpacing);

    TextProps setBreakStrategy(int breakStrategy);

    TextProps setHyphenationFrequency(int hyphenationFrequency);

    TextProps setFontFeatureSettings(String fontFeatureSettings);

    TextProps setTextColor(int color);

    TextProps setTextColor(ColorStateList colors);

    TextProps setHighlightColor(int color);

    TextProps setShadowLayer(float radius, float dx, float dy, int color);

    TextProps setGravity(int gravity);

    TextProps setPaintFlags(int flags);

    TextProps setHorizontallyScrolling(boolean whether);

    TextProps setMinLines(int minlines);

    TextProps setMinHeight(int minHeight);

    TextProps setMaxLines(int maxlines);

    TextProps setMaxHeight(int maxHeight);

    TextProps setLines(int lines);

    TextProps setHeight(int pixels);

    TextProps setMinEms(int minems);

    TextProps setMinWidth(int minpixels);

    TextProps setMaxEms(int maxems);

    TextProps setMaxWidth(int maxpixels);

    TextProps setEms(int ems);

    TextProps setWidth(int pixels);

    TextProps setLineSpacing(float add, float mult);

    TextProps setFreezesText(boolean freezesText);

    TextProps setText(CharSequence text, TextView.BufferType type);

    TextProps setText(String text);

    TextProps setText(@StringRes int stringRes);

    TextProps setCustomInsertionActionModeCallback(ActionMode.Callback actionModeCallback);

    TextProps setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback);

    TextProps setScroller(Scroller s);

    TextProps setCursorVisible(boolean visible);

    TextProps setSelectAllOnFocus(boolean selectAllOnFocus);

    TextProps setMarqueeRepeatLimit(int marqueeLimit);

    TextProps setEllipsize(TextUtils.TruncateAt where);

    TextProps setSingleLine(boolean singleLine);

    TextProps setAllCaps(boolean allCaps);

    TextProps setSingleLine();

    TextProps setIncludeFontPadding(boolean includepad);

    TextProps setExtractedText(ExtractedText text);

    TextProps setTextIsSelectable(boolean selectable);

    TextProps setFilters(InputFilter[] filters);

    TextProps setError(CharSequence error, Drawable icon);

    TextProps setError(CharSequence error);

    TextProps setInputExtras(int xmlResId) throws XmlPullParserException, IOException;

    TextProps setPrivateImeOptions(String type);

    TextProps setOnEditorActionListener(TextView.OnEditorActionListener l);

    TextProps setImeActionLabel(CharSequence label, int actionId);

    TextProps setImeOptions(int imeOptions);

    TextProps setRawInputType(int type);

    TextProps setInputType(int type);

    TextProps setKeyListener(KeyListener input);

}
