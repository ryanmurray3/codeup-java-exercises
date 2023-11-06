package shapes;

import java.util.Scanner;


public class Circle {
    private double radius;
    private static int totalCircles = 0;

    public Circle(double radius) {
        this.radius = radius;
        totalCircles++;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static int getTotalCircles() {
        return totalCircles;
    }
}
