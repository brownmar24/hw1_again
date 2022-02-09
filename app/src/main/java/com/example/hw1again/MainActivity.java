package com.example.hw1again;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        //initial colorVals
        //redVal_textView
        TextView redVal_textView = findViewById(R.id.redVal_textView);

        //greenVal_textView
        TextView greenVal_textView = findViewById(R.id.greenVal_textView);

        //blueVal_textView
        TextView blueVal_textView = findViewById(R.id.blueVal_textView);






        //set houseView to the surfaceView & set houseController to that houseView
        houseView hv = findViewById(R.id.houseView);
        houseController hc = new houseController(hv, redVal_textView);






        //get colorVals from houseModel
        int tempRed = hv.getHouseModel().testRed;
        int tempGreen = hv.getHouseModel().testGreen;
        int tempBlue = hv.getHouseModel().testBlue;

        //seekBars
        //redVal_seekBar
        SeekBar redVal_seekBar = findViewById(R.id.redVal_seekBar);
        redVal_seekBar.setOnSeekBarChangeListener(hc);
        redVal_seekBar.setProgress(tempRed);
        //greenVal_seekBar
        SeekBar greenVal_seekBar = findViewById(R.id.greenVal_seekBar);
        greenVal_seekBar.setOnSeekBarChangeListener(hc);
        greenVal_seekBar.setProgress(tempGreen);
        //blueVal_seekBar
        SeekBar blueVal_seekBar = findViewById(R.id.blueVal_seekBar);
        blueVal_seekBar.setOnSeekBarChangeListener(hc);
        blueVal_seekBar.setProgress(tempBlue);


    }
}