package com.example.hw1again;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        //TextViews
        TextView redVal_textView = findViewById(R.id.redVal_textView);
        TextView greenVal_textView = findViewById(R.id.greenVal_textView);
        TextView blueVal_textView = findViewById(R.id.blueVal_textView);
        TextView currElm_textView = findViewById(R.id.current_element_textView);

        //SeekBars
        SeekBar redVal_SeekBar = findViewById(R.id.redVal_seekBar);
        SeekBar greenVal_SeekBar = findViewById(R.id.greenVal_seekBar);
        SeekBar blueVal_SeekBar = findViewById(R.id.blueVal_seekBar);



        //set houseView to the surfaceView & set houseController to that houseView
        houseView hv = findViewById(R.id.houseView);
        houseController hc = new houseController(hv, redVal_textView, greenVal_textView, blueVal_textView, currElm_textView, redVal_SeekBar,
                greenVal_SeekBar, blueVal_SeekBar);


        //register SeekBars
        redVal_SeekBar.setOnSeekBarChangeListener(hc);
        greenVal_SeekBar.setOnSeekBarChangeListener(hc);
        blueVal_SeekBar.setOnSeekBarChangeListener(hc);

        //set colorVal_TextView to SeekBar
        int tempRed = 0;
        int tempGreen = 0;
        int tempBlue = 0;
        redVal_SeekBar.setProgress(tempRed);
        greenVal_SeekBar.setProgress(tempGreen);
        blueVal_SeekBar.setProgress(tempBlue);


        //register Touch
        hv.setOnTouchListener(hc);



    }
}