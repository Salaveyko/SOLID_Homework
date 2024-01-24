package com.solid.isp.implementations;

import com.solid.isp.interfaces.RectangleDrawer;

public class RectangleDrawerImpl implements RectangleDrawer {
    @Override
    public void drawRectangle() {
        System.out.println("Rectangle drawing..");
    }
}
