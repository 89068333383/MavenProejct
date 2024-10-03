package org.example;

public class Sphere {
    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius,2);
    }
    private double getVolume(){
        return 4/3 * Math.PI * Math.pow(radius, 3);
    }
}
