package com.github.nantaphop.fluentview;

import android.animation.StateListAnimator;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;

import com.github.nantaphop.fluentview.properties.ViewProps;


/**
 * Created by nantaphop on 17-Jan-16.
 */
class FluentView<T extends View> implements ViewProps {

    T view;

    public FluentView(T view) {
        this.view = view;
    }

    @Override
    public Fluency and() {
        return Fluency.instance();
    }

    @Override
    public ViewProps setAccessibilityDelegate(View.AccessibilityDelegate delegate) {
        view.setAccessibilityDelegate(delegate);
        return this;
    }

    @TargetApi(19)
    @Override
    public ViewProps setAccessibilityLiveRegion(int mode) {
        view.setAccessibilityLiveRegion(mode);
        return this;
    }

    @TargetApi(22)
    @Override
    public ViewProps setAccessibilityTraversalAfter(int afterId) {
        view.setAccessibilityTraversalAfter(afterId);
        return this;
    }

    @TargetApi(22)
    @Override
    public ViewProps setAccessibilityTraversalBefore(int beforeId) {
        view.setAccessibilityTraversalBefore(beforeId);
        return this;
    }

    @Override
    public ViewProps setActivated(boolean activated) {
        view.setActivated(activated);
        return this;
    }

    @Override
    public ViewProps setAlpha(float alpha) {
        view.setAlpha(alpha);
        return this;
    }

    @Override
    public ViewProps setAnimation(Animation animation) {
        view.setAnimation(animation);
        return this;
    }

    @TargetApi(16)
    @Override
    public ViewProps setBackground(Drawable background) {
        view.setBackground(background);
        return this;
    }

    @Override
    public ViewProps setBackgroundColor(int color) {
        view.setBackgroundColor(color);
        return this;
    }

    @Override
    public ViewProps setBackgroundDrawable(Drawable background) {
        view.setBackgroundDrawable(background);
        return this;
    }

    @Override
    public ViewProps setBackgroundResource(int resid) {
        view.setBackgroundResource(resid);
        return this;
    }

    @TargetApi(21)
    @Override
    public ViewProps setBackgroundTintList(ColorStateList tint) {
        view.setBackgroundTintList(tint);
        return this;
    }

    @TargetApi(21)
    @Override
    public ViewProps setBackgroundTintMode(PorterDuff.Mode tintMode) {
        view.setBackgroundTintMode(tintMode);
        return this;
    }

    @Override
    public ViewProps setCameraDistance(float distance) {
        view.setCameraDistance(distance);
        return this;
    }

    @Override
    public ViewProps setClickable(boolean clickable) {
        view.setClickable(clickable);
        return this;
    }

    @TargetApi(18)
    @Override
    public ViewProps setClipBounds(Rect clipBounds) {
        view.setClipBounds(clipBounds);
        return this;
    }

    @TargetApi(21)
    @Override
    public ViewProps setClipToOutline(boolean clipToOutline) {
        view.setClipToOutline(clipToOutline);
        return this;
    }

    @Override
    public ViewProps setContentDescription(CharSequence contentDescription) {
        view.setContentDescription(contentDescription);
        return this;
    }

    @TargetApi(23)
    @Override
    public ViewProps setContextClickable(boolean contextClickable) {
        view.setContextClickable(contextClickable);
        return this;
    }

    @Override
    public ViewProps setDrawingCacheBackgroundColor(int color) {
        view.setDrawingCacheBackgroundColor(color);
        return this;
    }

    @Override
    public ViewProps setDrawingCacheEnabled(boolean enabled) {
        view.setDrawingCacheEnabled(enabled);
        return this;
    }

    @Override
    public ViewProps setDrawingCacheQuality(int quality) {
        view.setDrawingCacheQuality(quality);
        return this;
    }

    @Override
    public ViewProps setDuplicateParentStateEnabled(boolean enabled) {
        view.setDuplicateParentStateEnabled(enabled);
        return this;
    }

    @TargetApi(21)
    @Override
    public ViewProps setElevation(float elevation) {
        view.setElevation(elevation);
        return this;
    }

    @Override
    public ViewProps setEnabled(boolean enabled) {
        view.setEnabled(enabled);
        return this;
    }

    @Override
    public ViewProps setFadingEdgeLength(int length) {
        view.setFadingEdgeLength(length);
        return this;
    }

    @Override
    public ViewProps setFilterTouchesWhenObscured(boolean enabled) {
        view.setFilterTouchesWhenObscured(enabled);
        return this;
    }

    @Override
    public ViewProps setFitsSystemWindows(boolean fitSystemWindows) {
        view.setFitsSystemWindows(fitSystemWindows);
        return this;
    }

    @Override
    public ViewProps setFocusable(boolean focusable) {
        view.setFocusable(focusable);
        return this;
    }

    @Override
    public ViewProps setFocusableInTouchMode(boolean focusableInTouchMode) {
        view.setFocusableInTouchMode(focusableInTouchMode);
        return this;
    }

    @TargetApi(23)
    @Override
    public ViewProps setForeground(Drawable foreground) {
        view.setForeground(foreground);
        return this;
    }

    @TargetApi(23)
    @Override
    public ViewProps setForegroundGravity(int gravity) {
        view.setForegroundGravity(gravity);
        return this;
    }

    @TargetApi(23)
    @Override
    public ViewProps setForegroundTintList(ColorStateList tint) {
        view.setForegroundTintList(tint);
        return this;
    }

    @TargetApi(23)
    @Override
    public ViewProps setForegroundTintMode(PorterDuff.Mode tintMode) {
        view.setForegroundTintMode(tintMode);
        return this;
    }

    @Override
    public ViewProps setHapticFeedbackEnabled(boolean hapticFeedbackEnabled) {
        view.setHapticFeedbackEnabled(hapticFeedbackEnabled);
        return this;
    }

    @TargetApi(16)
    @Override
    public ViewProps setHasTransientState(boolean hasTransientState) {
        view.setHasTransientState(hasTransientState);
        return this;
    }

    @Override
    public ViewProps setHorizontalFadingEdgeEnabled(boolean horizontalFadingEdgeEnabled) {
        view.setHorizontalFadingEdgeEnabled(horizontalFadingEdgeEnabled);
        return this;
    }

    @Override
    public ViewProps setHorizontalScrollBarEnabled(boolean horizontalScrollBarEnabled) {
        view.setHorizontalScrollBarEnabled(horizontalScrollBarEnabled);
        return this;
    }

    @Override
    public ViewProps setHovered(boolean hovered) {
        view.setHovered(hovered);
        return this;
    }

    @Override
    public ViewProps setId(int id) {
        view.setId(id);
        return this;
    }

    @TargetApi(16)
    @Override
    public ViewProps setImportantForAccessibility(int mode) {
        view.setImportantForAccessibility(mode);
        return this;
    }

    @Override
    public ViewProps setKeepScreenOn(boolean keepScreenOn) {
        view.setKeepScreenOn(keepScreenOn);
        return this;
    }

    @TargetApi(17)
    @Override
    public ViewProps setLabelFor(int id) {
        view.setLabelFor(id);
        return this;
    }

    @TargetApi(17)
    @Override
    public ViewProps setLayerPaint(Paint paint) {
        view.setLayerPaint(paint);
        return this;
    }

    @Override
    public ViewProps setLayerType(int layerType, Paint paint) {
        view.setLayerType(layerType, paint);
        return this;
    }

    @TargetApi(17)
    @Override
    public ViewProps setLayoutDirection(int layoutDirection) {
        view.setLayoutDirection(layoutDirection);
        return this;
    }

    @Override
    public ViewProps setLayoutParams(ViewGroup.LayoutParams params) {
        view.setLayoutParams(params);
        return this;
    }

    @Override
    public ViewProps setLongClickable(boolean longClickable) {
        view.setLongClickable(longClickable);
        return this;
    }

    @Override
    public ViewProps setMinimumHeight(int minHeight) {
        view.setMinimumHeight(minHeight);
        return this;
    }

    @Override
    public ViewProps setMinimumWidth(int minWidth) {
        view.setMinimumWidth(minWidth);
        return this;
    }

    @TargetApi(21)
    @Override
    public ViewProps setNestedScrollingEnabled(boolean enabled) {
        view.setNestedScrollingEnabled(enabled);
        return this;
    }

    @Override
    public ViewProps setNextFocusDownId(int nextFocusDownId) {
        view.setNextFocusDownId(nextFocusDownId);
        return this;
    }

    @Override
    public ViewProps setNextFocusForwardId(int nextFocusForwardId) {
        view.setNextFocusForwardId(nextFocusForwardId);
        return this;
    }

    @Override
    public ViewProps setNextFocusLeftId(int nextFocusLeftId) {
        view.setNextFocusLeftId(nextFocusLeftId);
        return this;
    }

    @Override
    public ViewProps setNextFocusRightId(int nextFocusRightId) {
        view.setNextFocusRightId(nextFocusRightId);
        return this;
    }

    @Override
    public ViewProps setNextFocusUpId(int nextFocusUpId) {
        view.setNextFocusUpId(nextFocusUpId);
        return this;
    }

    @TargetApi(20)
    @Override
    public ViewProps setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        view.setOnApplyWindowInsetsListener(listener);
        return this;
    }

    @Override
    public ViewProps setOnClickListener(View.OnClickListener l) {
        view.setOnClickListener(l);
        return this;
    }

    @TargetApi(23)
    @Override
    public ViewProps setOnContextClickListener(View.OnContextClickListener l) {
        view.setOnContextClickListener(l);
        return this;
    }

    @Override
    public ViewProps setOnCreateContextMenuListener(View.OnCreateContextMenuListener l) {
        view.setOnCreateContextMenuListener(l);
        return this;
    }

    @Override
    public ViewProps setOnDragListener(View.OnDragListener l) {
        view.setOnDragListener(l);
        return this;
    }

    @Override
    public ViewProps setOnFocusChangeListener(View.OnFocusChangeListener l) {
        view.setOnFocusChangeListener(l);
        return this;
    }

    @Override
    public ViewProps setOnGenericMotionListener(View.OnGenericMotionListener l) {
        view.setOnGenericMotionListener(l);
        return this;
    }

    @Override
    public ViewProps setOnHoverListener(View.OnHoverListener l) {
        view.setOnHoverListener(l);
        return this;
    }

    @Override
    public ViewProps setOnKeyListener(View.OnKeyListener l) {
        view.setOnKeyListener(l);
        return this;
    }

    @Override
    public ViewProps setOnLongClickListener(View.OnLongClickListener l) {
        view.setOnLongClickListener(l);
        return this;
    }

    @TargetApi(23)
    @Override
    public ViewProps setOnScrollChangeListener(View.OnScrollChangeListener l) {
        view.setOnScrollChangeListener(l);
        return this;
    }

    @Override
    public ViewProps setOnSystemUiVisibilityChangeListener(View.OnSystemUiVisibilityChangeListener l) {
        view.setOnSystemUiVisibilityChangeListener(l);
        return this;
    }

    @Override
    public ViewProps setOnTouchListener(View.OnTouchListener l) {
        view.setOnTouchListener(l);
        return this;
    }

    @TargetApi(21)
    @Override
    public ViewProps setOutlineProvider(ViewOutlineProvider provider) {
        view.setOutlineProvider(provider);
        return this;
    }

    @Override
    public ViewProps setOverScrollMode(int overScrollMode) {
        view.setOverScrollMode(overScrollMode);
        return this;
    }

    @Override
    public ViewProps setPadding(int left, int top, int right, int bottom) {
        view.setPadding(left, top, right, bottom);
        return this;
    }

    @TargetApi(17)
    @Override
    public ViewProps setPaddingRelative(int start, int top, int end, int bottom) {
        view.setPaddingRelative(start, top, end, bottom);
        return this;
    }

    @Override
    public ViewProps setPivotX(float pivotX) {
        view.setPivotX(pivotX);
        return this;
    }

    @Override
    public ViewProps setPivotY(float pivotY) {
        view.setPivotY(pivotY);
        return this;
    }

    @Override
    public ViewProps setPressed(boolean pressed) {
        view.setPressed(pressed);
        return this;
    }

    @Override
    public ViewProps setRotation(float rotation) {
        view.setRotation(rotation);
        return this;
    }

    @Override
    public ViewProps setRotationX(float rotationX) {
        view.setRotationX(rotationX);
        return this;
    }

    @Override
    public ViewProps setRotationY(float rotationY) {
        view.setRotationY(rotationY);
        return this;
    }

    @Override
    public ViewProps setSaveEnabled(boolean enabled) {
        view.setSaveEnabled(enabled);
        return this;
    }

    @Override
    public ViewProps setSaveFromParentEnabled(boolean enabled) {
        view.setSaveFromParentEnabled(enabled);
        return this;
    }

    @Override
    public ViewProps setScaleX(float scaleX) {
        view.setScaleX(scaleX);
        return this;
    }

    @Override
    public ViewProps setScaleY(float scaleY) {
        view.setScaleY(scaleY);
        return this;
    }

    @TargetApi(16)
    @Override
    public ViewProps setScrollBarDefaultDelayBeforeFade(int scrollBarDefaultDelayBeforeFade) {
        view.setScrollBarDefaultDelayBeforeFade(scrollBarDefaultDelayBeforeFade);
        return this;
    }

    @TargetApi(16)
    @Override
    public ViewProps setScrollBarFadeDuration(int scrollBarFadeDuration) {
        view.setScrollBarFadeDuration(scrollBarFadeDuration);
        return this;
    }

    @Override
    public ViewProps setScrollbarFadingEnabled(boolean fadeScrollbars) {
        view.setScrollbarFadingEnabled(fadeScrollbars);
        return this;
    }

    @TargetApi(16)
    @Override
    public ViewProps setScrollBarSize(int scrollBarSize) {
        view.setScrollBarSize(scrollBarSize);
        return this;
    }

    @Override
    public ViewProps setScrollBarStyle(int style) {
        view.setScrollBarStyle(style);
        return this;
    }

    @Override
    public ViewProps setScrollContainer(boolean isScrollContainer) {
        view.setScrollContainer(isScrollContainer);
        return this;
    }

    @TargetApi(23)
    @Override
    public ViewProps setScrollIndicators(int indicators) {
        view.setScrollIndicators(indicators);
        return this;
    }

    @TargetApi(23)
    @Override
    public ViewProps setScrollIndicators(int indicators, int mask) {
        view.setScrollIndicators(indicators, mask);
        return this;
    }

    @Override
    public ViewProps setScrollX(int value) {
        view.setScrollX(value);
        return this;
    }

    @Override
    public ViewProps setScrollY(int value) {
        view.setScrollY(value);
        return this;
    }

    @Override
    public ViewProps setSelected(boolean selected) {
        view.setSelected(selected);
        return this;
    }

    @Override
    public ViewProps setSoundEffectsEnabled(boolean soundEffectsEnabled) {
        view.setSoundEffectsEnabled(soundEffectsEnabled);
        return this;
    }

    @TargetApi(21)
    @Override
    public ViewProps setStateListAnimator(StateListAnimator stateListAnimator) {
        view.setStateListAnimator(stateListAnimator);
        return this;
    }

    @Override
    public ViewProps setSystemUiVisibility(int visibility) {
        view.setSystemUiVisibility(visibility);
        return this;
    }

    @Override
    public ViewProps setTag(int key, Object tag) {
        view.setTag(key, tag);
        return this;
    }

    @Override
    public ViewProps setTag(Object tag) {
        view.setTag(tag);
        return this;
    }

    @TargetApi(17)
    @Override
    public ViewProps setTextAlignment(int textAlignment) {
        view.setTextAlignment(textAlignment);
        return this;
    }

    @TargetApi(17)
    @Override
    public ViewProps setTextDirection(int textDirection) {
        view.setTextDirection(textDirection);
        return this;
    }

    @Override
    public ViewProps setTouchDelegate(TouchDelegate delegate) {
        view.setTouchDelegate(delegate);
        return this;
    }

    @Override
    public ViewProps setTranslationX(float translationX) {
        view.setTranslationX(translationX);
        return this;
    }

    @Override
    public ViewProps setTranslationY(float translationY) {
        view.setTranslationY(translationY);
        return this;
    }

    @TargetApi(21)
    @Override
    public ViewProps setTranslationZ(float translationZ) {
        view.setTranslationZ(translationZ);
        return this;
    }

    @Override
    public ViewProps setVerticalFadingEdgeEnabled(boolean verticalFadingEdgeEnabled) {
        view.setVerticalFadingEdgeEnabled(verticalFadingEdgeEnabled);
        return this;
    }

    @Override
    public ViewProps setVerticalScrollBarEnabled(boolean verticalScrollBarEnabled) {
        view.setVerticalScrollBarEnabled(verticalScrollBarEnabled);
        return this;
    }

    @Override
    public ViewProps setVerticalScrollbarPosition(int position) {
        view.setVerticalScrollbarPosition(position);
        return this;
    }

    @Override
    public ViewProps setVisibility(int visibility) {
        view.setVisibility(visibility);
        return this;
    }

    @Override
    public ViewProps setWillNotCacheDrawing(boolean willNotCacheDrawing) {
        view.setWillNotCacheDrawing(willNotCacheDrawing);
        return this;
    }

    @Override
    public ViewProps setWillNotDraw(boolean willNotDraw) {
        view.setWillNotDraw(willNotDraw);
        return this;
    }

    @Override
    public ViewProps setX(float x) {
        view.setX(x);
        return this;
    }

    @Override
    public ViewProps setY(float y) {
        view.setY(y);
        return this;
    }

    @TargetApi(21)
    @Override
    public ViewProps setZ(float z) {
        view.setZ(z);
        return this;
    }
}
