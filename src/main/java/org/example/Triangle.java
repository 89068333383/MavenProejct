package org.example;

public class Triangle {
    private double a;
    private double b;
    private double c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getArea() {
        return Math.sqrt(getPerimeter()/2*(getPerimeter()/2-a)*(getPerimeter()/2-b)*(getPerimeter()/2-c));
    }
    public double getPerimeter() {
        return a + b + c;
    }
}
