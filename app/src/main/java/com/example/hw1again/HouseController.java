package com.example.hw1again;

import static android.graphics.Color.blue;
import static android.graphics.Color.green;
import static android.graphics.Color.red;

import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;


/**
 * HouseController Class
 *
 * responsible for any responses to user inputs such as SeekBar movement or Touch
 *
 * @Author Margaret Brown
 * @Version 2/10/2022
 */
public class HouseController implements View.OnTouchListener,
        SeekBar.OnSeekBarChangeListener {
    //instance variables
    private HouseView hv;
    private HouseModel hm;
    private TextView elementTV;
    private TextView redTV;
    private TextView greenTV;
    private TextView blueTV;
    private SeekBar redSB;
    private SeekBar greenSB;
    private SeekBar blueSB;

    /**
     * HouseController ctor
     *
     * set all instance variables, links the controller to the view and the correct
     * model, initializes the elementArrayList
     *
     * @param hv the house view its working with
     * @param redTV the redVal_textView from major_seekBar_Layout
     * @param greenTV the greenVal_textView from major_seekBar_Layout
     * @param blueTV the blueVal_textView from major_seekBar_Layout
     * @param elementTV the element_textView from master_layout
     * @param redSB the redVal_seekBar from minor_seekBar_layout
     * @param greenSB the greenVal_seekBar from minor_seekBar_layout
     * @param blueSB the blueVal_seekBar from minor_seekBar_layout
     */
    public HouseController(HouseView hv, TextView redTV, TextView greenTV,
                           TextView blueTV, TextView elementTV, SeekBar redSB, SeekBar greenSB,
                           SeekBar blueSB) {
        this.hv = hv;
        this.hm = hv.getHouseModel();
        this.redTV = redTV;
        this.greenTV = greenTV;
        this.blueTV = blueTV;
        this.elementTV = elementTV;
        this.redSB = redSB;
        this.greenSB = greenSB;
        this.blueSB = blueSB;

    }//ctor


    /**
     * onTouch
     *
     * how to change the view when the screen is touched
     *
     * @return true if the touch was successful
     */
    @Override
    public boolean onTouch(View v, MotionEvent me) {
        int x = (int)me.getX();
        int y = (int)me.getY();
        hv.elementArrayList();

        //check each element for the touch, then updateSeek
        for (CustomRect cr : hv.allElements) {
            if (cr.containsPoint(x, y)) {
                updateSeek(cr);
            }
        }
        return true;
    }//onTouch


    /**
     * updateSeek
     *
     * helper method: given a object, update the seekBar values and textView values
     *
     * @param cr the CustomRect selected
     */
    private void updateSeek(CustomRect cr) {
        elementTV.setText(cr.getName());
        hm.lastTouched = cr.getName();
        redSB.setProgress(red(cr.getColor()));
        greenSB.setProgress(green(cr.getColor()));
        blueSB.setProgress(blue(cr.getColor()));
    }//updateSeek


    /**
     * onProgressChanged
     *
     * how to change the view when a seekBar is moved
     *
     * @param sb the seekBar being moved
     * @param i the value of the new seekBar position
     * @param b unused param, whether the seekBar was set by a human or by code
     */
    @Override
    public void onProgressChanged(SeekBar sb, int i, boolean b) {
        if (hm.lastTouched.equals(hv.skyElement.getName())) {
            if (sb.getId() == R.id.redVal_seekBar) {
                hm.skyRed = i;
                redTV.setText("" + i);
            }else if (sb.getId() == R.id.greenVal_seekBar) {
                hm.skyGreen = i;
                greenTV.setText("" + i);
            }else if (sb.getId() == R.id.blueVal_seekBar) {
                hm.skyBlue = i;
                blueTV.setText("" + i);
            }
        }else if (hm.lastTouched.equals(hv.grassElement.getName())) {
            if (sb.getId() == R.id.redVal_seekBar) {
                hm.grassRed = i;
                redTV.setText("" + i);
            }else if (sb.getId() == R.id.greenVal_seekBar) {
                hm.grassGreen = i;
                greenTV.setText("" + i);
            }else if (sb.getId() == R.id.blueVal_seekBar) {
                hm.grassBlue = i;
                blueTV.setText("" + i);
            }
        }else if (hm.lastTouched.equals(hv.houseElement.getName())) {
            if (sb.getId() == R.id.redVal_seekBar) {
                hm.houseRed = i;
                redTV.setText("" + i);
            }else if (sb.getId() == R.id.greenVal_seekBar) {
                hm.houseGreen = i;
                greenTV.setText("" + i);
            }else if (sb.getId() == R.id.blueVal_seekBar) {
                hm.houseBlue = i;
                blueTV.setText("" + i);
            }
        }else if (hm.lastTouched.equals(hv.roofElement.getName())) {
            if (sb.getId() == R.id.redVal_seekBar) {
                hm.roofRed = i;
                redTV.setText("" + i);
            }else if (sb.getId() == R.id.greenVal_seekBar) {
                hm.roofGreen = i;
                greenTV.setText("" + i);
            }else if (sb.getId() == R.id.blueVal_seekBar) {
                hm.roofBlue = i;
                blueTV.setText("" + i);
            }
        }else if (hm.lastTouched.equals(hv.chimneyElement.getName())) {
            if (sb.getId() == R.id.redVal_seekBar) {
                hm.chimneyRed = i;
                redTV.setText("" + i);
            }else if (sb.getId() == R.id.greenVal_seekBar) {
                hm.chimneyGreen = i;
                greenTV.setText("" + i);
            }else if (sb.getId() == R.id.blueVal_seekBar) {
                hm.chimneyBlue = i;
                blueTV.setText("" + i);
            }
        }else if (hm.lastTouched.equals(hv.doorElement.getName())) {
            if (sb.getId() == R.id.redVal_seekBar) {
                hm.doorRed = i;
                redTV.setText("" + i);
            }else if (sb.getId() == R.id.greenVal_seekBar) {
                hm.doorGreen = i;
                greenTV.setText("" + i);
            }else if (sb.getId() == R.id.blueVal_seekBar) {
                hm.doorBlue = i;
                blueTV.setText("" + i);
            }
        }
        hv.invalidate(); //redraw after updating the values
    }//onProgressChanged


    //unnecessary
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }
    //unnecessary
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}//HouseController
