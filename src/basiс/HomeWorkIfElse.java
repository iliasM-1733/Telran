package basiс;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HomeWorkIfElse {

    private enum Figure {
        TRIANGLE, CIRCLE, RECTANGLE;
    }

    private static final Scanner SCANNER = new Scanner(System.in);


    public static void main(String[] args)  {

    }

    private static void checkFigure(Figure figure) {

        switch (figure){
            case CIRCLE -> circleSquare();
            case TRIANGLE -> triangleSquare();
            case RECTANGLE -> rectangleSquare();
        }
    }

    private static void triangleSquare() {
        System.out.println("Введите размер стороны А:");
        double a = SCANNER.nextDouble();
        System.out.println("Введите размер стороны B:");
        double b = SCANNER.nextDouble();
        System.out.println("Введите размер стороны C:");
        double c = SCANNER.nextDouble();

        // циклическая проверка, что такая фигура может существовать.
        // отдельный метод, в качестве аргумента
        // "boolean isTriangleValid(double a, double b, double c)"
        // 1. сумма двух сторон всегда больше размера третьей. для каждой стороны
        // 2. стороны имеют положительный размер и больше 0.
        // while(isTriangleValid(///)) { введите значения повторно }

        double halfP = (a + b + c) / 2;

        double square = Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
        System.out.printf("Площадь треугольника равна %f\n", square);
    }

    private static void circleSquare() {
        System.out.println("Введите размер радиуса:");
        double r = SCANNER.nextDouble();

        // циклическая проверка, что такая фигура может существовать.
        // "boolean isCircleValid(double r)"
        // радиус положителен и не равен нулю

//        while (isCircleValid(r)) { // если число отрицательное
//            // пользователь, введи пожалуйста корректные данные для радиуса
//            // r = SCANNER.nextDouble();
//        }



        double square = Math.PI * r * r;

        System.out.printf("Площадь круга с радиусом %f равна %f\n", r, square);
    }

    private static void rectangleSquare() {
        System.out.println("Введите размер стороны А:");
        double a = SCANNER.nextDouble();
        System.out.println("Введите размер стороны B:");
        double b = SCANNER.nextDouble();

        // циклическая проверка, что такая фигура может существовать.
        // "boolean isRectangleValid(double a, double b)"
        // обе стороны больше нуля.

        double square = a * b;

        System.out.printf("Площадь прямоугольника равна %f\n", square);
    }
}
