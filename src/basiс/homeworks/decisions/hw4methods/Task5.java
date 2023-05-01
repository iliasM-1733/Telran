package basiс.homeworks.decisions.hw4methods;

public class Task5 {
    public static void main(String[] args) {
        // Пример использования методов для расчёта площадей фигур
        double rectangleArea = calculateAreaRectangle(5, 10); // расчёт площади прямоугольника со сторонами 5 и 10
        double circleArea = calculateAreaCircle(4); // расчёт площади круга с радиусом 4
        double triangleArea = calculateAreaTriangle(3, 4, 5); // расчёт площади треугольника со сторонами 3, 4 и 5
        System.out.println("Площадь прямоугольника: " + rectangleArea);
        System.out.println("Площадь круга: " + circleArea);
        System.out.println("Площадь треугольника: " + triangleArea);
    }

    // Метод для расчёта площади прямоугольника
    // метод calculateAreaRectangle вычисляет площадь прямоугольника по формуле a * b, где a и b - длины сторон
    // прямоугольника.
    public static double calculateAreaRectangle(double a, double b) {
        double result = a * b; // формула для вычисления площади прямоугольника
        return result;
    }

    // Метод для расчёта площади круга
    // метод calculateAreaCircle вычисляет площадь круга по формуле π * r^2, где r - радиус круга.
    public static double calculateAreaCircle(double r) {
        double result = Math.PI * Math.pow(r, 2); // формула для вычисления площади круга
        return result;
    }

    // Метод для расчёта площади треугольника по формуле Герона
    // метод calculateAreaTriangle вычисляет площадь треугольника по формуле Герона, которая выглядит так:
    // sqrt(p * (p - a) * (p - b) * (p - c)), где
    // a, b, и c - длины сторон треугольника,
    // p - полупериметр треугольника (p = (a + b + c) / 2).
    public static double calculateAreaTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2; // полупериметр треугольника
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c)); // формула для вычисления площади треугольника
        return result;
    }
}
