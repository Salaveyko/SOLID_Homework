package com.solid.isp.implementations;

import com.solid.isp.interfaces.SquareDrawer;

public class SquareDrawerImpl implements SquareDrawer {
    @Override
    public void drawSquare() {
        System.out.println("Square drawing..");
    }
}
