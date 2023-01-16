package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rec.width = sc.nextDouble();
        rec.height = sc.nextDouble();

        rec.area();
        rec.perimeter();
        rec.diagonal();

        System.out.println("AREA = " + String.format("%.2f", rec.area()));
        System.out.println("PERIMETER = " + String.format("%.2f", rec.perimeter()));
        System.out.println("DIAGONAL = " + String.format("%.2f", rec.diagonal()));

        sc.close();

    }
}
