package basic.homeworks.decisions.hw4methods;


/**
 * - Реализовать программу, которая выводит на экран результаты сложения, вычитания, умножения и деления двух чисел.
 * Каждая из арифметических операций должна быть реализована как отдельный метод.
 * каждый отдельный метод принимает в качестве аргументов два числа и возвращает тоже число
 */

/**
 * Каждый метод арифметической операции имеет следующую сигнатуру:
 * public static double operation(double num1, double num2)
 * где:
 * operation - название операции (add, subtract, multiply или divide)
 * num1 и num2 - два числа, над которыми нужно выполнить операцию
 * double - тип возвращаемого значения
 */
public class Task2 {
    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 5.0;

        // Вызов методов и печать результатов
        System.out.println("Результат сложения: " + add(num1, num2));
        System.out.println("Результат вычитания: " + subtract(num1, num2));
        System.out.println("Результат умножения: " + multiply(num1, num2));
        System.out.println("Результат деления: " + divide(num1, num2));
    }

    /**
     * Метод, который складывает два числа и возвращает результат
     * @param num1 первое число
     * @param num2 второе число
     * @return результат сложения num1 и num2
     */
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Метод, который вычитает два числа и возвращает результат
     * @param num1 первое число
     * @param num2 второе число
     * @return результат вычитания num2 из num1
     */
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Метод, который умножает два числа и возвращает результат
     * @param num1 первое число
     * @param num2 второе число
     * @return результат умножения num1 и num2
     */
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Метод, который делит два числа и возвращает результат
     * @param num1 первое число
     * @param num2 второе число
     * @return результат деления num1 на num2
     */
    public static double divide(double num1, double num2)  {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return num1 / num2;
    }




}
