package com.example.hw1again;

import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class houseController implements View.OnTouchListener, SeekBar.OnSeekBarChangeListener {
    //instance variables
    private houseView hv;
    private houseModel hm;
    private TextView redText;


    public houseController(houseView hv, TextView redText) {
        this.hv = hv;
        this.hm = hv.getHouseModel();
        this.redText = redText;

    }

    //for the SurfaceView
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    //all the abstract methods for SeekBars
        @Override
        public void onProgressChanged(SeekBar sb, int i, boolean b) {
            if (sb.getId() == R.id.redVal_seekBar) {
                hm.testRed = i;
                this.redText.setText("" + i);
            }else if (sb.getId() == R.id.greenVal_seekBar) {
                hm.testGreen = i;
            }else if (sb.getId() == R.id.blueVal_seekBar) {
                hm.testBlue = i;
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
