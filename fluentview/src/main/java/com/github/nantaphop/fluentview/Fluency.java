package com.github.nantaphop.fluentview;

import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.github.nantaphop.fluentview.properties.CompoundButtonProps;
import com.github.nantaphop.fluentview.properties.EditTextProps;
import com.github.nantaphop.fluentview.properties.ImageProps;
import com.github.nantaphop.fluentview.properties.ProgressProps;
import com.github.nantaphop.fluentview.properties.SeekProps;
import com.github.nantaphop.fluentview.properties.SwitchProps;
import com.github.nantaphop.fluentview.properties.TextProps;
import com.github.nantaphop.fluentview.properties.ToggleProps;
import com.github.nantaphop.fluentview.properties.ViewProps;

/**
 * Created by greenfrvr
 */
public final class Fluency {

    private static Fluency instance;

    private Fluency() {
    }

    public static Fluency instance() {
        if (instance == null) {
            instance = new Fluency();
        }
        return instance;
    }

    public <T extends View> ViewProps with(T view){
        return new FluentView<>(view);
    }

    public <T extends TextView> TextProps with(T view){
        return new FluentTextView<>(view);
    }

    public <T extends Button> TextProps with(T view){
        return new FluentButton<>(view);
    }

    public <T extends ProgressBar> ProgressProps with(T view) {
        return new FluentProgressBar<>(view);
    }

    public <T extends CompoundButton> CompoundButtonProps with(T view) {
        return new FluentCompoundButton<>(view);
    }

    public <T extends Switch> SwitchProps with(T view){
        return new FluentSwitch<>(view);
    }

    public <T extends ImageView> ImageProps with(T view){
        return new FluentImageView<>(view);
    }

    public <T extends EditText> EditTextProps with(T view){
        return new FluentEditText<>(view);
    }

    public <T extends ToggleButton> ToggleProps with(T view){
        return new FluentToggleButton<>(view);
    }

    public <T extends SeekBar> SeekProps with(T view){
        return new FluentSeekBar<>(view);
    }

}
