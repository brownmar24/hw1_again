package com.example.hw1again;

import android.graphics.Color;
import android.graphics.Paint;

import java.util.ArrayList;

/**
 * HouseModel Class
 *
 * holds information on the HouseView
 *
 * @Author Margaret Brown
 * @Version 2/10/2022
 */
public class HouseModel {
    //Colors
    public int skyRed = 124;
    public int skyGreen = 187;
    public int skyBlue = 214;
    public int skyColor = Color.rgb(skyRed, skyGreen, skyBlue);
    public int grassRed = 100;
    public int grassGreen = 175;
    public int grassBlue = 82;
    public int grassColor = Color.rgb(grassRed, grassGreen, grassBlue);
    public int houseRed = 172;
    public int houseGreen = 144;
    public int houseBlue = 113;
    public int houseColor = Color.rgb(houseRed, houseGreen, houseBlue);
    public int roofRed = 217;
    public int roofGreen = 36;
    public int roofBlue = 20;
    public int roofColor = Color.rgb(roofRed, roofGreen, roofBlue);
    public int chimneyRed = 172;
    public int chimneyGreen = 144;
    public int chimneyBlue = 113;
    public int chimneyColor = Color.rgb(chimneyRed, chimneyGreen, chimneyBlue);
    public int doorRed = 217;
    public int doorGreen = 36;
    public int doorBlue = 20;
    public int doorColor = Color.rgb(doorRed, doorGreen, doorBlue);


    //lastTouched element
    public String lastTouched = null;
}//HouseModel
