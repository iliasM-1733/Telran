package basic.homeworks.decisions.hw6ifelse;

public class Task2 {
    /**
     * Напишите метод, который определяет, является ли заданное число чётным или нечётным и печатает ответ в консоль
     */
    public static void main(String[] args) {
        int number = 7;
        checkEvenOdd(number);
    }

    /**
     * В этой реализации есть метод checkEvenOdd, который принимает число в качестве параметра
     * и проверяет его на чётность или нечётность. Если число делится на 2 без остатка, то оно считается чётным,
     * иначе - нечётным. Результат проверки выводится в консоль с помощью метода System.out.println().
     * В примере выше число 7 передается в метод checkEvenOdd для проверки.
     */
    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " является чётным числом.");
        } else {
            System.out.println(number + " является нечётным числом.");
        }
    }
}
