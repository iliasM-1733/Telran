package basic.homeworks.decisions.hw6ifelse;

import java.util.Scanner;

/**
 * Напишите метод, который определяет оценку студента в зависимости от полученного балла:
 * 90-100 - A, 80-89 - B, 70-79 - C, 60-69 - D, меньше 60 - F.
 * Метод принимает число в качестве аргумента и возвращает строку
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите балл студента: ");
        int score = scanner.nextInt();

        String grade = calculateGrade(score);
        System.out.println("Оценка студента: " + grade);

        scanner.close();
    }

    /**
     * В этом примере создается  метод calculateGrade,
     * принимающий балл студента и возвращающий соответствующую оценку.
     *
     * В методе main сначала запрашивается балл студента у пользователя. Затем вызывается метод calculateGrade,
     * передавая ему полученный балл. Результат (оценка) выводится в консоль.
     *
     * Метод calculateGrade использует оператор if-else if-else для проверки диапазона баллов и возвращает
     * соответствующую оценку в виде строки.
     */
    public static String calculateGrade(int score) {
        if (score >= 90 && score <= 100) {
            return "A";
        } else if (score >= 80 && score <= 89) {
            return "B";
        } else if (score >= 70 && score <= 79) {
            return "C";
        } else if (score >= 60 && score <= 69) {
            return "D";
        } else {
            return "F";
        }
    }
}

