package com.solid.isp;

public class ShapeDrawerImpl implements ShapeDrawer {
    @Override
    public void drawCircle() {
        System.out.println("Circle");
    }

    @Override
    public void drawRectangle() {
        System.out.println("Rectangle");
    }

    @Override
    public void drawSquare() {
        System.out.println("Square");
    }

    @Override
    public void drawTriangle() {
        System.out.println("Triangle");
    }
}
