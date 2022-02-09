package com.example.hw1again;

import android.widget.SeekBar;
import android.widget.TextView;

//found in Nuxoll's 301 section A notes on Jan 24 - Jan 30
public class SeekBarHandler implements SeekBar.OnSeekBarChangeListener{
    private TextView updateMe = null;

    public SeekBarHandler(TextView initTV) {
        this.updateMe = initTV;
    }

    @Override
    public void onProgressChanged(SeekBar sb, int i, boolean b) {
        this.updateMe.setText("" + i);
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
