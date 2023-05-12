package basic.homeworks.decisions.hw6ifelse;

public class Task1 {

    /**
     * Напишите метод, который проверяет, является ли заданное число положительным, отрицательным или нулём и печатает
     * ответ в консоль
     */
    public static void main(String[] args) {
        checkNumber(10);
        checkNumber(-10);
        checkNumber(0);
    }

    /**
     * В данной реализации метод checkNumber принимает целочисленный параметр number. Затем используется конструкция
     * if-else-if для проверки значения числа. Если число больше 0, выводится сообщение о положительном числе.
     * Если число меньше 0, выводится сообщение об отрицательном числе. Если число равно 0, выводится сообщение о нуле.
     * Пример в методе main показывает, как вызвать метод checkNumber и передать ему число для проверки.
     */
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("Число " + number + " является положительным.");
        } else if (number < 0) {
            System.out.println("Число " + number + " является отрицательным.");
        } else {
            System.out.println("Число " + number + " является нулём.");
        }
    }

}
