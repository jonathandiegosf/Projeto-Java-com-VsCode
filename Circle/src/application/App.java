package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Circle;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double area = Circle.area(radius);
        double volume = Circle.volume(radius);

        System.out.println("Area: " + String.format("%.2f", area));
        System.out.println("Volume: " + String.format("%.2f", volume));
        System.out.println("PI: " + String.format("%.4f", Circle.PI));

    }
}
