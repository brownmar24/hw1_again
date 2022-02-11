package com.example.hw1again;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.SeekBar;
import android.widget.TextView;


/**
 * MainActivity Class
 *
 * the main program for the app
 *
 * @Author Margaret Brown
 * @Version 2/10/2022
 */
public class MainActivity extends AppCompatActivity {
    /**
     * onCreate
     *
     * creates the GUI
     *
     * @param savedInstanceState unused param with the state of the activity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        //minor_seekBar_layout variables
            //TextViews
            TextView element_textView = findViewById(R.id.element_textView);
            TextView redVal_textView = findViewById(R.id.redVal_textView);
            TextView greenVal_textView = findViewById(R.id.greenVal_textView);
            TextView blueVal_textView = findViewById(R.id.blueVal_textView);
            //SeekBars
            SeekBar redVal_seekBar = findViewById(R.id.redVal_seekBar);
            SeekBar greenVal_seekBar = findViewById(R.id.greenVal_seekBar);
            SeekBar blueVal_seekBar = findViewById(R.id.blueVal_seekBar);

        //set the HouseView and initialize a HouseController
        HouseView hv = findViewById(R.id.houseView_surfaceView);
        HouseController hc = new HouseController(hv, redVal_textView, greenVal_textView,
                blueVal_textView, element_textView, redVal_seekBar, greenVal_seekBar,
                blueVal_seekBar);

        //Event Handling -- SeekBars & Touch Events
        redVal_seekBar.setOnSeekBarChangeListener(hc);
        greenVal_seekBar.setOnSeekBarChangeListener(hc);
        blueVal_seekBar.setOnSeekBarChangeListener(hc);
        hv.setOnTouchListener(hc);
    }//onCreate method
}//MainActivity Class