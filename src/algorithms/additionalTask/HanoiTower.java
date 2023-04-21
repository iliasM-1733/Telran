package algorithms.additionalTask;

import java.util.Stack;

public class HanoiTower {

    public static void main(String[] args) {
        int n = 3; // количество дисков
        Stack<Integer> from = new Stack<>(); // стержень, на котором изначально расположены диски
        Stack<Integer> to = new Stack<>(); // стержень, на который нужно перенести все диски
        Stack<Integer> aux = new Stack<>(); // промежуточный стержень

        // инициализируем стержень "from" дисками
        for (int i = n; i >= 1; i--) {
            from.push(i);
        }

        // вызываем метод рекурсивного решения Ханойской башни
        solveRecursive(n, from, to, aux);

        // вызываем метод итеративного решения Ханойской башни
        hanoiTower(3);
    }

    // метод решения Ханойской башни с помощью рекурсии
    public static void solveRecursive(int n, Stack<Integer> from, Stack<Integer> to, Stack<Integer> aux) {
        // базовый случай - только один диск на стержне "from"
        if (n == 1) {
            to.push(from.pop());
            System.out.println("Перемещаем диск с вершины " + from + " на вершину " + to);
        } else {
            // переносим n-1 диск с "from" на "aux" с помощью "to" как промежуточного стержня
            solveRecursive(n - 1, from, aux, to);
            // перемещаем оставшийся диск с "from" на "to"
            to.push(from.pop());
            System.out.println("Перемещаем диск с вершины " + from + " на вершину " + to);
            // переносим n-1 диск с "aux" на "to" с помощью "from" как промежуточного стержня
            solveRecursive(n - 1, aux, to, from);
        }
    }

    public static void hanoiTower(int n) {
        // Создаем три стека, соответствующие трем штырям башни Ханоя
        Stack<Integer> src = new Stack<>(); // Исходный штырь
        Stack<Integer> aux = new Stack<>(); // Вспомогательный штырь
        Stack<Integer> dest = new Stack<>(); // Штырь назначения

        // Заполняем стек исходного штыря начальными дисками
        for (int i = n; i > 0; i--) {
            src.push(i);
        }

        // Изначально все диски находятся на исходном штыре
        int totalMoves = (int) Math.pow(2, n) - 1; // Общее количество ходов
        boolean isEven = n % 2 == 0; // Флаг четности количества дисков

        // Итеративно переносим диски с одного штыря на другой
        for (int i = 1; i <= totalMoves; i++) {
            // В зависимости от четности количества дисков выбираем штырь для перемещения
            if (i % 3 == 1) {
                if (isEven) {
                    move(src, dest);
                } else {
                    move(src, aux);
                }
            } else if (i % 3 == 2) {
                if (isEven) {
                    move(src, aux);
                } else {
                    move(dest, aux);
                }
            } else {
                if (isEven) {
                    move(aux, dest);
                } else {
                    move(src, dest);
                }
            }
        }
    }

    // Метод для перемещения верхнего диска со штыря from на штырь to
    private static void move(Stack<Integer> from, Stack<Integer> to) {
        if (from.isEmpty()) {
            to.push(from.pop());
        } else if (to.isEmpty()) {
            from.push(to.pop());
        } else if (from.peek() > to.peek()) {
            from.push(to.pop());
        } else {
            to.push(from.pop());
        }
    }
}

