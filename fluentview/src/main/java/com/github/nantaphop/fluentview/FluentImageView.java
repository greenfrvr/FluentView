package com.github.nantaphop.fluentview;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.widget.ImageView;

import com.github.nantaphop.fluentview.properties.ImageProps;

/**
 * Created by nantaphop on 17-Jan-16.
 */
class FluentImageView<T extends ImageView> extends FluentView<T> implements ImageProps {

    public FluentImageView(T view) {
        super(view);
    }
    
    @Override
    public ImageProps setAdjustViewBounds(boolean adjustViewBounds) {
        view.setAdjustViewBounds(adjustViewBounds);
        return this;
    }
    
    @Override
    public ImageProps setAlpha(int alpha) {
        view.setAlpha(alpha);
        return this;
    }
    
    @Override
    public ImageProps setBaseline(int baseline) {
        view.setBaseline(baseline);
        return this;
    }
    
    @Override
    public ImageProps setBaselineAlignBottom(boolean aligned) {
        view.setBaselineAlignBottom(aligned);
        return this;
    }
    
    @Override
    public ImageProps setColorFilter(ColorFilter cf) {
        view.setColorFilter(cf);
        return this;
    }

    @TargetApi(16)
    @Override
    public ImageProps setCropToPadding(boolean cropToPadding) {
        view.setCropToPadding(cropToPadding);
        return this;
    }

    @TargetApi(16)
    @Override
    public ImageProps setImageAlpha(int alpha) {
        view.setImageAlpha(alpha);
        return this;
    }
    
    @Override
    public ImageProps setImageBitmap(Bitmap bm) {
        view.setImageBitmap(bm);
        return this;
    }
    
    @Override
    public ImageProps setImageDrawable(Drawable drawable) {
        view.setImageDrawable(drawable);
        return this;
    }

    @TargetApi(23)
    @Override
    public ImageProps setImageIcon(Icon icon) {
        view.setImageIcon(icon);
        return this;
    }
    
    @Override
    public ImageProps setImageLevel(int level) {
        view.setImageLevel(level);
        return this;
    }
    
    @Override
    public ImageProps setImageMatrix(Matrix matrix) {
        view.setImageMatrix(matrix);
        return this;
    }
    
    @Override
    public ImageProps setImageResource(int resId) {
        view.setImageResource(resId);
        return this;
    }
    
    @Override
    public ImageProps setImageState(int[] state, boolean merge) {
        view.setImageState(state, merge);
        return this;
    }

    @TargetApi(21)
    @Override
    public ImageProps setImageTintList(ColorStateList tint) {
        view.setImageTintList(tint);
        return this;
    }

    @TargetApi(21)
    @Override
    public ImageProps setImageTintMode(PorterDuff.Mode tintMode) {
        view.setImageTintMode(tintMode);
        return this;
    }
    
    @Override
    public ImageProps setImageURI(Uri uri) {
        view.setImageURI(uri);
        return this;
    }
    
    @Override
    public ImageProps setMaxHeight(int maxHeight) {
        view.setMaxHeight(maxHeight);
        return this;
    }
    
    @Override
    public ImageProps setMaxWidth(int maxWidth) {
        view.setMaxWidth(maxWidth);
        return this;
    }
    
    @Override
    public ImageProps setScaleType(ImageView.ScaleType scaleType) {
        view.setScaleType(scaleType);
        return this;
    }
    
    @Override
    public ImageProps setSelected(boolean selected) {
        view.setSelected(selected);
        return this;
    }
    
    @Override
    public ImageProps setVisibility(int visibility) {
        view.setVisibility(visibility);
        return this;
    }
}
