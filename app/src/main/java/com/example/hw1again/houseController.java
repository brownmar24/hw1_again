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


    public houseController(houseView hv, TextView redTV, TextView greenTV, TextView blueTV, TextView currTV) {
        this.hv = hv;
        this.hm = hv.getHouseModel();
        this.redTV = redTV;
        this.greenTV = greenTV;
        this.blueTV = blueTV;
        this.currTV = currTV;
    }

    //for the SurfaceView
    @Override
    public boolean onTouch(View v, MotionEvent me) {
        int x = (int)me.getX();
        int y = (int)me.getY();

        if (hv.testCircle1.containsPoint(x, y)) {
            currTV.setText("Circle 1");
        }
        else if (hv.testCircle2.containsPoint(x, y)) {
            currTV.setText("Circle 2");
        }
        return true;
    }

    //all the abstract methods for SeekBars
    @Override
    public void onProgressChanged(SeekBar sb, int i, boolean b) {
        if (sb.getId() == R.id.redVal_seekBar) {
            hm.testRed1 = i;
            redTV.setText("" + i);
        }else if (sb.getId() == R.id.greenVal_seekBar) {
            hm.testGreen1 = i;
            greenTV.setText("" + i);
        }else if (sb.getId() == R.id.blueVal_seekBar) {
            hm.testBlue1 = i;
            blueTV.setText("" + i);
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
