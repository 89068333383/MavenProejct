package org.example;

public class GeometryComparator {
    public static boolean isSameArea(Circle c1, Circle c2) {
        return Math.abs(c1.getArea() - c2.getArea()) < 0.001;
    }

    public static boolean isSameArea(Rectangle r1, Rectangle r2) {
        return Math.abs(r1.getArea() - r2.getArea()) < 0.001;
    }

    public static boolean isSameArea(Triangle t1, Triangle t2) {
        return Math.abs(t1.getArea() - t2.getArea()) < 0.001;
    }
}
