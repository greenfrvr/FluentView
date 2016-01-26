package com.github.nantaphop.fluentview.properties;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.widget.ImageView;

/**
 * Created by greenfrvr
 */
public interface ImageProps extends ViewProps {

    ImageProps setAdjustViewBounds(boolean adjustViewBounds);

    ImageProps setAlpha(int alpha);

    ImageProps setBaseline(int baseline);

    ImageProps setBaselineAlignBottom(boolean aligned);

    ImageProps setColorFilter(ColorFilter cf);

    ImageProps setCropToPadding(boolean cropToPadding);

    ImageProps setImageAlpha(int alpha);

    ImageProps setImageBitmap(Bitmap bm);

    ImageProps setImageDrawable(Drawable drawable);

    ImageProps setImageIcon(Icon icon);

    ImageProps setImageLevel(int level);

    ImageProps setImageMatrix(Matrix matrix);

    ImageProps setImageResource(int resId);

    ImageProps setImageState(int[] state, boolean merge);

    ImageProps setImageTintList(ColorStateList tint);

    ImageProps setImageTintMode(PorterDuff.Mode tintMode);

    ImageProps setImageURI(Uri uri);

    ImageProps setMaxHeight(int maxHeight);

    ImageProps setMaxWidth(int maxWidth);

    ImageProps setScaleType(ImageView.ScaleType scaleType);

}
