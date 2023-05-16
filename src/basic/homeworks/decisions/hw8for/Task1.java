package basic.homeworks.decisions.hw8for;

/**
 * Напишите программу, которая выводит на экран все числа от 1 до 100, кратные 7.
 */


public class Task1 {
    public static void main(String[] args) {
        printSevens();
    }

    /**
     * В этой задаче цикл for выполняется от 1 до 100. На каждой итерации проверяется, делится ли текущее число
     * i на 7 без остатка. Если условие выполняется, то число выводится на экран.
     */
    static void printSevens() {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}