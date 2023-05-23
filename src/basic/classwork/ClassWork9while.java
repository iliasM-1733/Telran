package basic.classwork;

import java.util.Scanner;

public class ClassWork9while {
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

        // цикл тут

        return Math.PI * Math.pow(2, r);
    }

    static double calculateTriangleArea() {
        double a = SCANNER.nextDouble();
        double b = SCANNER.nextDouble();
        double c = SCANNER.nextDouble();

        // цикл тут
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return s;
    }

    static double calculateRectangleArea() {
        double a = SCANNER.nextDouble();
        double b = SCANNER.nextDouble();

        // цикл тут
        double square = a * b;

        return square;
    }

    static boolean isTriangleSizesCorrect(double a, double b, double c) {
        if ((a < (b + c) && b < (a + c) && c < (a + b) && (a > 0 && b > 0 && c > 0))) {
            return true;
        }
        return false;
    }

    static boolean isRectangleSizesCorrect(double a, double b) {
        if (a > 0 && b > 0) {
            return true;
        }
        return false;
    }

    static boolean isRadiusCorrect(double r) {
        return r > 0;
    }
}
