package application;

import java.util.Locale;
import java.util.Scanner;

import entities.student;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        student stu = new student();

        System.out.print("Name of Student: ");
        stu.name = sc.nextLine();
        System.out.println("Enter with your notes: ");
        stu.nota1 = sc.nextDouble();
        stu.nota2 = sc.nextDouble();
        stu.nota3 = sc.nextDouble();

        stu.notaFinal();

        System.out.println("FINAL GRADE: " + String.format("%.2f", stu.notaFinal()));

        if (stu.notaFinal() > 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            double missed = stu.notaFinal() - 60;
            System.out.println("MISSING " + String.format("%.2f", missed) + " POINTS");
        }

        sc.close();
    }
}
