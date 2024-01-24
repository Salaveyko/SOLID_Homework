package com.solid.isp.implementations;

import com.solid.isp.interfaces.TriangleDrawer;

public class TriangleDrawerImpl implements TriangleDrawer {
    @Override
    public void drawTriangle() {
        System.out.println("Triangle drawing..");
    }
}
