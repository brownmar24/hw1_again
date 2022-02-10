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

    //objects
    CustomCircle testCircle1;
    CustomCircle testCircle2;
    CustomRect customHouse;
    CustomRect customSky;


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
        hm.testColor1 = Color.rgb(hm.testRed1, hm.testGreen1, hm.testBlue1);
        hm.testColor2 = Color.rgb(hm.testRed2, hm.testGreen2, hm.testBlue2);
        hm.houseColor = Color.rgb(hm.houseRed, hm.houseGreen, hm.houseBlue);
        hm.doorColor = Color.rgb(hm.doorRed, hm.doorGreen, hm.doorBlue);
        hm.roofColor = Color.rgb(hm.roofRed, hm.roofGreen, hm.roofBlue);
        hm.chimneyColor = Color.rgb(hm.chimneyRed, hm.chimneyGreen, hm.chimneyBlue);
        hm.skyColor = Color.rgb(hm.skyRed, hm.skyGreen, hm.skyBlue);
        hm.grassColor = Color.rgb(hm.grassRed, hm.grassGreen, hm.grassBlue);
    }



    @Override
    public void onDraw(Canvas canvas) {
        updateColors();

        //draw objects
        testCircle1 = new CustomCircle("testCircle1", hm.testColor1, 150, 150, 100);
        testCircle2 = new CustomCircle("testCircle1", hm.testColor2, 300, 300, 50);
        customHouse = new CustomRect("customHouse", hm.houseColor, 500, 125, 600, 175);
        customSky = new CustomRect("customSky", hm.skyColor, -1, -1, 2000, 500);

        testCircle1.drawMe(canvas);
        testCircle2.drawMe(canvas);
        customHouse.drawMe(canvas);
        customSky.drawMe(canvas);
    }
}
