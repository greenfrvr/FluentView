package com.github.nantaphop.fluentview;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.github.nantaphop.fluentview.internal.FluentButton;
import com.github.nantaphop.fluentview.internal.FluentCheckBox;
import com.github.nantaphop.fluentview.internal.FluentCompoundButton;
import com.github.nantaphop.fluentview.internal.FluentEditText;
import com.github.nantaphop.fluentview.internal.FluentImageButton;
import com.github.nantaphop.fluentview.internal.FluentImageView;
import com.github.nantaphop.fluentview.internal.FluentProgressBar;
import com.github.nantaphop.fluentview.internal.FluentRadioButton;
import com.github.nantaphop.fluentview.internal.FluentSeekBar;
import com.github.nantaphop.fluentview.internal.FluentSwitch;
import com.github.nantaphop.fluentview.internal.FluentTextView;
import com.github.nantaphop.fluentview.internal.FluentToggleButton;
import com.github.nantaphop.fluentview.internal.FluentView;
import com.github.nantaphop.fluentview.properties.CompoundButtonProps;
import com.github.nantaphop.fluentview.properties.EditTextProps;
import com.github.nantaphop.fluentview.properties.ImageProps;
import com.github.nantaphop.fluentview.properties.ProgressProps;
import com.github.nantaphop.fluentview.properties.SwitchProps;
import com.github.nantaphop.fluentview.properties.TextProps;
import com.github.nantaphop.fluentview.properties.ToggleProps;
import com.github.nantaphop.fluentview.properties.ViewProps;

/**
 * Created by greenfrvr
 */
public class Fluency {

    public static <T extends View> ViewProps prepare(T view){
        return new FluentView<>(view);
    }

    public static <T extends TextView> TextProps prepare(T view){
        return new FluentTextView<>(view);
    }

    public static <T extends Button> TextProps prepare(T view){
        return new FluentButton<>(view);
    }

    public static <T extends ProgressBar> ProgressProps prepare(T view) {
        return new FluentProgressBar<>(view);
    }

    public static <T extends CompoundButton> CompoundButtonProps prepare(T view) {
        return new FluentCompoundButton<>(view);
    }

    public static <T extends Switch> SwitchProps prepare(T view){
        return new FluentSwitch(view);
    }

    public static <T extends ImageView> ImageProps prepare(T view){
        return new FluentImageView<>(view);
    }

    public static <T extends EditText> EditTextProps prepare(T view){
        return new FluentEditText(view);
    }

    public static <T extends ToggleButton> ToggleProps prepare(T view){
        return new FluentToggleButton(view);
    }

    //TODO - Check documentation for properties list
    public static ImageProps prepare(ImageButton view){
        return new FluentImageButton(view);
    }

    public static ProgressProps prepare(SeekBar view){
        return new FluentSeekBar(view);
    }

    public static CompoundButtonProps prepare(CheckBox view){
        return new FluentCheckBox(view);
    }

    public static CompoundButtonProps prepare(RadioButton view){
        return new FluentRadioButton(view);
    }

}
