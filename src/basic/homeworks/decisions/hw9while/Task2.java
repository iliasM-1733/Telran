package basic.homeworks.decisions.hw9while;


import java.util.Scanner;

/**
 * В классе N учеников, по завершению теста диктуются оценки A, B, C или D.
 * Необходимо посчиать количество каждыъ оценок.
 * <p>
 * реализовать метод counter(int n)
 * оценки задаются через консоль
 */
public class Task2 {

    /**
     * В данном решении используется цикл for для считывания оценок от каждого ученика. Внутри цикла происходит запрос
     * на ввод оценки для каждого ученика с помощью Scanner. Затем оценка сравнивается с использованием конструкции
     * switch, и соответствующий счетчик увеличивается. Если введена некорректная оценка, выводится сообщение об ошибке,
     * и мы возвращаемся к предыдущему ученику путем декремента переменной i. По завершении цикла выводится количество
     * оценок каждого типа.
     */
    public static void counter(int n) {
        int countA = 0; // Количество оценок A
        int countB = 0; // Количество оценок B
        int countC = 0; // Количество оценок C
        int countD = 0; // Количество оценок D

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("Введите оценку для ученика " + (i + 1) + ": ");
            String grade = scanner.nextLine();

            switch (grade.toUpperCase()) {
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "C":
                    countC++;
                    break;
                case "D":
                    countD++;
                    break;
                default:
                    System.out.println("Ошибка! Некорректная оценка: " + grade);
                    i--; // Возвращаемся к предыдущему ученику
                    break;
            }
        }

        System.out.println("Количество оценок:");
        System.out.println("A: " + countA);
        System.out.println("B: " + countB);
        System.out.println("C: " + countC);
        System.out.println("D: " + countD);
    }

    public static void main(String[] args) {
        System.out.print("Введите количество учеников: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Очищаем буфер после считывания числа учеников
        scanner.nextLine();

        counter(n);
    }
}

