package basic.classwork;

import java.util.Scanner;

public class ClassWork6 {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        calculateArea();
    }

    static void calculateArea() {
        String figure = SCANNER.nextLine();

        // if-else
        // площадь круга/прямоугольника/треугольника равна ...
    }

    static double calculateCircleArea() {
        double r = SCANNER.nextDouble();

        return Math.PI * Math.pow(2, r);
    }

    static double calculateTriangleArea() {
        double a = SCANNER.nextDouble();
        double b = SCANNER.nextDouble();
        double c = SCANNER.nextDouble();

        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return s;
    }

    static double calculateRectangleArea() {
        double a = SCANNER.nextDouble();
        double b = SCANNER.nextDouble();

        return a * b;
    }

}
