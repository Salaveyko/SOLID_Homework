package com.solid.lsp;

/**
 * Liskov Substitution Principle
 * Let q(x) be a property provable about objects of x of type T. Then q(y) should be provable
 * for objects y of type S where S is a subtype of T.
 * ----
 * Realize a classical example of violation of Liskov's substitution principle (The problem of
 * square-rectangle problem). Solve this problem.
 * --
 * In this example, all classes implement the Shape interface, but each has its own way of
 * calculating the perimeter. This design allows you to avoid the issue of violating the
 * Liskov substitution principle.
 */
public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(3, 6);
        Shape square = new Square(5);
        Shape triangle = new Triangle(3, 4, 6);

        System.out.println("Rectangle perimeter: " + rect.perimeter());
        System.out.println("Square perimeter: " + square.perimeter());
        System.out.println("Triangle perimeter: " + triangle.perimeter());
    }
}
