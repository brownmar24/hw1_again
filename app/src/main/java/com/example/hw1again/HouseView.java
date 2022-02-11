package com.example.hw1again;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

import java.util.ArrayList;


/**
 * HouseView Class
 *
 * controls what is displayed to the SurfaceView and, by extension, the GUI
 *
 * @Author Margaret Brown
 * @Version 2/10/2022
 */
public class HouseView extends SurfaceView{
    //instance variables
    private HouseModel hm;
    //objects for onDraw
    public CustomRect houseElement;
    public CustomRect skyElement;
    public CustomRect grassElement;
    public CustomRect doorElement;
    public CustomRect roofElement;
    public CustomRect chimneyElement;
    public ArrayList<CustomRect> allElements;


    /**
     * HouseView ctor
     *
     * creates a new HouseModel for the HouseView, sets draw on, sets background color
     *
     * @param context passed directly to super
     * @param attrs passed directly to super
     */
    public HouseView(Context context, AttributeSet attrs) {
        super(context, attrs);
        hm = new HouseModel();
        setWillNotDraw(false);
        setBackgroundColor(Color.WHITE);
    }//ctor

    /**
     * getHouseModel
     *
     * getter method
     *
     * @return HouseModel the HouseModel created in pair with this HouseView
     */
    public HouseModel getHouseModel() {
        return this.hm;
    }


    /**
     * updateColors
     *
     * helper method to update the colors after every change
     */
    private void updateColors() {
        hm.skyColor = Color.rgb(hm.skyRed, hm.skyGreen, hm.skyBlue);
        hm.grassColor = Color.rgb(hm.grassRed, hm.grassGreen, hm.grassBlue);
        hm.houseColor = Color.rgb(hm.houseRed, hm.houseGreen, hm.houseBlue);
        hm.roofColor = Color.rgb(hm.roofRed, hm.roofGreen, hm.roofBlue);
        hm.chimneyColor = Color.rgb(hm.chimneyRed, hm.chimneyGreen, hm.chimneyBlue);
        hm.doorColor = Color.rgb(hm.doorRed, hm.doorGreen, hm.doorBlue);
    }//updateColors


    /**
     * onDraw
     *
     * drawing method inherited from the SurfaceView
     *
     * @param canvas the .drawMe method draws the image objects onto the canvas, to be
     *               displayed on the SurfaceView
     */
    @Override
    public void onDraw(Canvas canvas) {
        updateColors();

        skyElement =  new CustomRect("Sky", hm.skyColor, -1, -1, 2000, 500);
        skyElement.drawMe(canvas);
        grassElement = new CustomRect("Grass", hm.grassColor, 0, 500, 2000, 710);
        grassElement.drawMe(canvas);
        houseElement = new CustomRect("House", hm.houseColor, 666, 242, 1332, 668);
        houseElement.drawMe(canvas);
        roofElement = new CustomRect("Roof", hm.roofColor, 616, 202, 1382, 282);
        roofElement.drawMe(canvas);
        chimneyElement = new CustomRect("Chimney", hm.chimneyColor, 1165, 100,
                1245, 202);
        chimneyElement.drawMe(canvas);
        doorElement = new CustomRect("Door", hm.doorColor, 932, 400, 1065, 668);
        doorElement.drawMe(canvas);
    }//onDraw


    /**
     * elementArrayList
     *
     * put all the elements into an ArrayList for easy use
     */
    public void elementArrayList() {
        allElements = new ArrayList<CustomRect>(6);
        allElements.add(skyElement);
        allElements.add(grassElement);
        allElements.add(houseElement);
        allElements.add(roofElement);
        allElements.add(chimneyElement);
        allElements.add(doorElement);
    }//elementArrayList
}//HouseView
