package com.solid.isp;

/**
 * Interface Segregation Principle
 * A client should never be forced to implement an interface that it doesn’t use,
 * or clients shouldn’t be forced to depend on methods they do not use.
 * ----
 * Create the Shape interface. In it declare 4 methods: drawCircle(), drawSquare(), drawTriangle(),
 * drawRectangle(). Divide this interface and implement inherited classes.
 */
public class Main {
    public static void main(String[] args) {
        ShapeDrawer shape = new ShapeDrawerImpl();
        RectangleDrawer rect = new RectangleDrawerImpl();
        CircleDrawer circle = new CircleDrawerImpl();
        SquareDrawer square = new SquareDrawerImpl();
        TriangleDrawer triangle = new TriangleDrawerImpl();

        System.out.println("\n\tMulti-interface");
        shape.drawRectangle();
        shape.drawCircle();
        shape.drawSquare();
        shape.drawTriangle();

        System.out.println("\n\tSplit interfaces");
        rect.drawRectangle();
        circle.drawCircle();
        square.drawSquare();
        triangle.drawTriangle();
    }
}
