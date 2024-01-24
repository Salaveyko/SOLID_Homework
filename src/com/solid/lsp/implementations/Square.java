package com.solid.lsp.implementations;

import com.solid.lsp.interfaces.Shape;

public class Square implements Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double perimeter() {
        return a * 4;
    }
}
