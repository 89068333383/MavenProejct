package org.example;

public class Cube {
    private double a;
    public Cube(double a) {
        this.a = a;
    }
    public double getPerimetrReber() {
        return 4 * a * 3;
    }
    public double getArea() {
        return 6 *  a * a;
    }
    public double getVolume() {
        return a * a * a;
    }
}
