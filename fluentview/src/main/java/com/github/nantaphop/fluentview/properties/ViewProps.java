package com.github.nantaphop.fluentview.properties;

import android.animation.StateListAnimator;
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

/**
 * Created by greenfrvr
 */
public interface ViewProps {

    ViewProps setAccessibilityDelegate(View.AccessibilityDelegate delegate);

    ViewProps setAccessibilityLiveRegion(int mode);

    ViewProps setAccessibilityTraversalAfter(int afterId);

    ViewProps setAccessibilityTraversalBefore(int beforeId);

    ViewProps setActivated(boolean activated);

    ViewProps setAlpha(float alpha);

    ViewProps setAnimation(Animation animation);

    ViewProps setBackground(Drawable background);

    ViewProps setBackgroundColor(int color);

    ViewProps setBackgroundDrawable(Drawable background);

    ViewProps setBackgroundResource(int resid);

    ViewProps setBackgroundTintList(ColorStateList tint);

    ViewProps setBackgroundTintMode(PorterDuff.Mode tintMode);

    ViewProps setCameraDistance(float distance);

    ViewProps setClickable(boolean clickable);

    ViewProps setClipBounds(Rect clipBounds);

    ViewProps setClipToOutline(boolean clipToOutline);

    ViewProps setContentDescription(CharSequence contentDescription);

    ViewProps setContextClickable(boolean contextClickable);

    ViewProps setDrawingCacheBackgroundColor(int color);

    ViewProps setDrawingCacheEnabled(boolean enabled);

    ViewProps setDrawingCacheQuality(int quality);

    ViewProps setDuplicateParentStateEnabled(boolean enabled);

    ViewProps setElevation(float elevation);

    ViewProps setEnabled(boolean enabled);

    ViewProps setFadingEdgeLength(int length);

    ViewProps setFilterTouchesWhenObscured(boolean enabled);

    ViewProps setFitsSystemWindows(boolean fitSystemWindows);

    ViewProps setFocusable(boolean focusable);

    ViewProps setFocusableInTouchMode(boolean focusableInTouchMode);

    ViewProps setForeground(Drawable foreground);

    ViewProps setForegroundGravity(int gravity);

    ViewProps setForegroundTintList(ColorStateList tint);

    ViewProps setForegroundTintMode(PorterDuff.Mode tintMode);

    ViewProps setHapticFeedbackEnabled(boolean hapticFeedbackEnabled);

    ViewProps setHasTransientState(boolean hasTransientState);

    ViewProps setHorizontalFadingEdgeEnabled(boolean horizontalFadingEdgeEnabled);

    ViewProps setHorizontalScrollBarEnabled(boolean horizontalScrollBarEnabled);

    ViewProps setHovered(boolean hovered);

    ViewProps setId(int id);

    ViewProps setImportantForAccessibility(int mode);

    ViewProps setKeepScreenOn(boolean keepScreenOn);

    ViewProps setLabelFor(int id);

    ViewProps setLayerPaint(Paint paint);

    ViewProps setLayerType(int layerType, Paint paint);

    ViewProps setLayoutDirection(int layoutDirection);

    ViewProps setLayoutParams(ViewGroup.LayoutParams params);

    ViewProps setLongClickable(boolean longClickable);

    ViewProps setMinimumHeight(int minHeight);

    ViewProps setMinimumWidth(int minWidth);

    ViewProps setNestedScrollingEnabled(boolean enabled);

    ViewProps setNextFocusDownId(int nextFocusDownId);

    ViewProps setNextFocusForwardId(int nextFocusForwardId);

    ViewProps setNextFocusLeftId(int nextFocusLeftId);

    ViewProps setNextFocusRightId(int nextFocusRightId);

    ViewProps setNextFocusUpId(int nextFocusUpId);

    ViewProps setOnApplyWindowInsetsListener(android.view.View.OnApplyWindowInsetsListener listener);

    ViewProps setOnClickListener(android.view.View.OnClickListener l);

    ViewProps setOnContextClickListener(android.view.View.OnContextClickListener l);

    ViewProps setOnCreateContextMenuListener(android.view.View.OnCreateContextMenuListener l);

    ViewProps setOnDragListener(android.view.View.OnDragListener l);

    ViewProps setOnFocusChangeListener(android.view.View.OnFocusChangeListener l);

    ViewProps setOnGenericMotionListener(android.view.View.OnGenericMotionListener l);

    ViewProps setOnHoverListener(android.view.View.OnHoverListener l);

    ViewProps setOnKeyListener(android.view.View.OnKeyListener l);

    ViewProps setOnLongClickListener(android.view.View.OnLongClickListener l);

    ViewProps setOnScrollChangeListener(android.view.View.OnScrollChangeListener l);

    ViewProps setOnSystemUiVisibilityChangeListener(android.view.View.OnSystemUiVisibilityChangeListener l);

    ViewProps setOnTouchListener(android.view.View.OnTouchListener l);

    ViewProps setOutlineProvider(ViewOutlineProvider provider);

    ViewProps setOverScrollMode(int overScrollMode);

    ViewProps setPadding(int left, int top, int right, int bottom);

    ViewProps setPaddingRelative(int start, int top, int end, int bottom);

    ViewProps setPivotX(float pivotX);

    ViewProps setPivotY(float pivotY);

    ViewProps setPressed(boolean pressed);

    ViewProps setRotation(float rotation);

    ViewProps setRotationX(float rotationX);

    ViewProps setRotationY(float rotationY);

    ViewProps setSaveEnabled(boolean enabled);

    ViewProps setSaveFromParentEnabled(boolean enabled);

    ViewProps setScaleX(float scaleX);

    ViewProps setScaleY(float scaleY);

    ViewProps setScrollBarDefaultDelayBeforeFade(int scrollBarDefaultDelayBeforeFade);

    ViewProps setScrollBarFadeDuration(int scrollBarFadeDuration);

    ViewProps setScrollbarFadingEnabled(boolean fadeScrollbars);

    ViewProps setScrollBarSize(int scrollBarSize);

    ViewProps setScrollBarStyle(int style);

    ViewProps setScrollContainer(boolean isScrollContainer);

    ViewProps setScrollIndicators(int indicators);

    ViewProps setScrollIndicators(int indicators, int mask);

    ViewProps setScrollX(int value);

    ViewProps setScrollY(int value);

    ViewProps setSelected(boolean selected);

    ViewProps setSoundEffectsEnabled(boolean soundEffectsEnabled);

    ViewProps setStateListAnimator(StateListAnimator stateListAnimator);

    ViewProps setSystemUiVisibility(int visibility);

    ViewProps setTag(int key, Object tag);

    ViewProps setTag(Object tag);

    ViewProps setTextAlignment(int textAlignment);

    ViewProps setTextDirection(int textDirection);

    ViewProps setTouchDelegate(TouchDelegate delegate);

    ViewProps setTranslationX(float translationX);

    ViewProps setTranslationY(float translationY);

    ViewProps setTranslationZ(float translationZ);

    ViewProps setVerticalFadingEdgeEnabled(boolean verticalFadingEdgeEnabled);

    ViewProps setVerticalScrollBarEnabled(boolean verticalScrollBarEnabled);

    ViewProps setVerticalScrollbarPosition(int position);

    ViewProps setVisibility(int visibility);

    ViewProps setWillNotCacheDrawing(boolean willNotCacheDrawing);

    ViewProps setWillNotDraw(boolean willNotDraw);

    ViewProps setX(float x);

    ViewProps setY(float y);

    ViewProps setZ(float z);

}
