package org.example;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double getArea() {
        return a * b;
    }
    public double getPerimeter() {
        return 2 * (a + b);
    }
}
