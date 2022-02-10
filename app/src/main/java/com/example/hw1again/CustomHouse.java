package com.example.hw1again;

import android.graphics.Canvas;

public class CustomHouse extends CustomRect {
    /**
     * the rectangles dimensions must be defined at construction
     *
     * @param name
     * @param color
     * @param left
     * @param top
     * @param right
     * @param bottom
     */
    public CustomHouse(String name, int color, int left, int top, int right, int bottom) {
        super(name, color, left, top, right, bottom);
    }
}
