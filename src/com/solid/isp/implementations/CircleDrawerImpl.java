package com.solid.isp.implementations;

import com.solid.isp.interfaces.CircleDrawer;

public class CircleDrawerImpl implements CircleDrawer {
    @Override
    public void drawCircle() {
        System.out.println("Circle drawer..");
    }
}
