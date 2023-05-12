package basic.classwork;

import java.util.Scanner;

public class ClassWork6 {
    static final Scanner SCANNER = new Scanner(System.in);

    private enum Figure {
        TRIANGLE, CIRCLE, RECTANGLE;
    }

    public static void main(String[] args) {
        calculateArea(Figure.TRIANGLE);
    }

    static void calculateArea(Figure figureType) {
        switch (figureType) {
            case CIRCLE -> System.out.println("Square of  CIRCLE equals " + calculateCircleArea());
            case TRIANGLE -> System.out.println("Square of  TRIANGLE equals " + calculateTriangleArea());
            case RECTANGLE -> System.out.println("Square of  RECTANGLE equals " + calculateRectangleArea());
        }
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
