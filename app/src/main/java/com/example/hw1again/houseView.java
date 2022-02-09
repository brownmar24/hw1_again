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

    //Colors
    int testColor1;
    int testColor2;
    int houseColor;
    int roofColor;
    int doorColor;
    int chimneyColor;
    int skyColor;
    int grassColor;

    //objects
    CustomCircle testCircle1;
    CustomCircle testCircle2;


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
        //update all Colors
        testColor1 = Color.rgb(hm.testRed1, hm.testGreen1, hm.testBlue1);
        testColor2 = Color.rgb(hm.testRed2, hm.testGreen2, hm.testBlue2);
        houseColor = Color.rgb(hm.houseRed, hm.houseGreen, hm.houseBlue);
        doorColor = Color.rgb(hm.doorRed, hm.doorGreen, hm.doorBlue);
        roofColor = Color.rgb(hm.roofRed, hm.roofGreen, hm.roofBlue);
        chimneyColor = Color.rgb(hm.chimneyRed, hm.chimneyGreen, hm.chimneyBlue);
        skyColor = Color.rgb(hm.skyRed, hm.skyGreen, hm.skyBlue);
        grassColor = Color.rgb(hm.grassRed, hm.grassGreen, hm.grassBlue);
    }



    @Override
    public void onDraw(Canvas canvas) {
        updateColors();

        //draw objects
        testCircle1 = new CustomCircle("testCircle1", testColor1, 150, 150, 100);
        testCircle1.drawMe(canvas);
        testCircle2 = new CustomCircle("testCircle1", testColor2, 300, 300, 50);
        testCircle2.drawMe(canvas);

    }
}
