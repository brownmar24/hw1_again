package com.example.hw1again;

import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class houseController implements View.OnTouchListener, SeekBar.OnSeekBarChangeListener {
    //instance variables
    private houseView hv;
    private houseModel hm;
    private TextView redTV;
    private TextView greenTV;
    private TextView blueTV;
    private TextView currTV;
    private SeekBar redSeek;
    private SeekBar greenSeek;
    private SeekBar blueSeek;


    public houseController(houseView hv, TextView redTV, TextView greenTV, TextView blueTV, TextView currTV, SeekBar redSeek, SeekBar greenSeek, SeekBar blueSeek) {
        this.hv = hv;
        this.hm = hv.getHouseModel();
        this.redTV = redTV;
        this.greenTV = greenTV;
        this.blueTV = blueTV;
        this.currTV = currTV;
        this.redSeek = redSeek;
        this.greenSeek = greenSeek;
        this.blueSeek = blueSeek;
    }

    //for the SurfaceView
    @Override
    public boolean onTouch(View v, MotionEvent me) {
        int x = (int)me.getX();
        int y = (int)me.getY();

        if (hv.testCircle1.containsPoint(x, y)) {
            currTV.setText("Circle 1");
            hm.lastTouched = "Circle 1";
            redSeek.setProgress(hm.testRed1);
            greenSeek.setProgress(hm.testGreen1);
            blueSeek.setProgress(hm.testBlue1);

        }
        else if (hv.testCircle2.containsPoint(x, y)) {
            currTV.setText("Circle 2");
            hm.lastTouched = "Circle 2";
            redSeek.setProgress(hm.testRed2);
            greenSeek.setProgress(hm.testGreen2);
            blueSeek.setProgress(hm.testBlue2);
        }
        else if (hv.customHouse.containsPoint(x, y)) {
            currTV.setText("House");
            hm.lastTouched = "House";
            redSeek.setProgress(hm.houseRed);
            greenSeek.setProgress(hm.houseGreen);
            blueSeek.setProgress(hm.houseBlue);
        }
        else if (hv.customSky.containsPoint(x, y)) {
            currTV.setText("Sky");
            hm.lastTouched = "Sky";
            redSeek.setProgress(hm.skyRed);
            greenSeek.setProgress(hm.skyGreen);
            blueSeek.setProgress(hm.skyBlue);
        }
        else if (hv.customGrass.containsPoint(x,y)) {
            currTV.setText("Grass");
            hm.lastTouched = "Grass";
            redSeek.setProgress(hm.grassRed);
            greenSeek.setProgress(hm.grassGreen);
            blueSeek.setProgress(hm.grassBlue);
        }
        return true;
    }

    //all the abstract methods for SeekBars
    @Override
    public void onProgressChanged(SeekBar sb, int i, boolean b) {
        if (hm.lastTouched.equals("Circle 1")) {
            if (sb.getId() == R.id.redVal_seekBar) {
                hm.testRed1 = i;
                redTV.setText("" + i);
            } else if (sb.getId() == R.id.greenVal_seekBar) {
                hm.testGreen1 = i;
                greenTV.setText("" + i);
            } else if (sb.getId() == R.id.blueVal_seekBar) {
                hm.testBlue1 = i;
                blueTV.setText("" + i);
            }
        }else if (hm.lastTouched.equals("Circle 2")) {
            if (sb.getId() == R.id.redVal_seekBar) {
                hm.testRed2 = i;
                redTV.setText("" + i);
            } else if (sb.getId() == R.id.greenVal_seekBar) {
                hm.testGreen2 = i;
                greenTV.setText("" + i);
            } else if (sb.getId() == R.id.blueVal_seekBar) {
                hm.testBlue2 = i;
                blueTV.setText("" + i);
            }
        }else if (hm.lastTouched.equals("House")) {
            if (sb.getId() == R.id.redVal_seekBar) {
                hm.houseRed = i;
                redTV.setText("" + i);
            } else if (sb.getId() == R.id.greenVal_seekBar) {
                hm.houseGreen = i;
                greenTV.setText("" + i);
            } else if (sb.getId() == R.id.blueVal_seekBar) {
                hm.houseBlue = i;
                blueTV.setText("" + i);
            }
        }else if(hm.lastTouched.equals("Sky")) {
            if (sb.getId() == R.id.redVal_seekBar) {
                hm.skyRed = i;
                redTV.setText("" + i);
            } else if (sb.getId() == R.id.greenVal_seekBar) {
                hm.skyGreen = i;
                greenTV.setText("" + i);
            } else if (sb.getId() == R.id.blueVal_seekBar) {
                hm.skyBlue = i;
                blueTV.setText("" + i);
            }
        }

        hv.invalidate();
    }
    //unnecessary
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }
    //unnecessary
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
