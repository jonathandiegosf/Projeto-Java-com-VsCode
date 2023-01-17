package entities;

public class Circle {

    public static final double PI = 3.14159;

    public static double area(double radius) {
        return PI * radius * radius;

    }

    public static double volume(double radius) {
        return PI * radius * radius * radius / 3.0;
    }

}
