package com.example.hw1again;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;



public class houseView extends SurfaceView{
    //instance variables
    private houseModel hm;

    //paints
    Paint testPaint = new Paint();
    Paint housePaint = new Paint();
    Paint doorPaint = new Paint();
    Paint roofPaint = new Paint();
    Paint chimneyPaint = new Paint();
    Paint skyPaint = new Paint();
    Paint grassPaint = new Paint();


    public houseView(Context context, AttributeSet attrs) {
        super(context, attrs);

        //create new houseModel when creating a houseView
        hm = new houseModel();

        setWillNotDraw(false);

        setBackgroundColor(Color.WHITE);
    }


    public houseModel getHouseModel() {
        return this.hm;
    }

    private void updateColors() {
        /*update all Colors
         * 1 create an int for color
         * 2 put color into paint
        */
        //testColor
        int testColor = Color.rgb(hm.testRed, hm.testGreen, hm.testBlue);
        testPaint.setColor(testColor);
        //houseColor
        int houseColor = Color.rgb(hm.houseRed, hm.houseGreen, hm.houseBlue);
        housePaint.setColor(houseColor);
        //doorColor
        int doorColor = Color.rgb(hm.doorRed, hm.doorGreen, hm.doorBlue);
        doorPaint.setColor(doorColor);
        //roofColor
    }



    @Override
    public void onDraw(Canvas canvas) {
        //update color
            //1 create an int for color
            int testColor = Color.rgb(hm.testRed, hm.testGreen, hm.testBlue);
            //2 put color in paint
            testPaint.setColor(testColor);
        canvas.drawCircle(100, 100, 30, testPaint);

    }
}
