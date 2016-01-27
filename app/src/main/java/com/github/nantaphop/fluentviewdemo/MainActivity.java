package com.github.nantaphop.fluentviewdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.nantaphop.fluentview.Fluency;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Bind(R.id.text) TextView textView;
    @Bind(R.id.imageView) ImageView imageView;
    @Bind(R.id.button) Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Fluency.instance()
                .with(textView)
                .setText("Hello From FluentView").setTextColor(Color.parseColor("#ff00ff"))
                .and()
                .with(imageView)
                .setImageResource(R.drawable.ic_action_action_history).setScaleType(ImageView.ScaleType.FIT_CENTER)
                .and()
                .with(button)
                .setText("Hello From FluentButton").setAllCaps(true).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Log.i(TAG, "onClick: button was clicked");
    }
}
