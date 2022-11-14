package basiс;


import java.util.Scanner;

/**
 * Иногда нам нужно повторить блок кода определенное количество раз. Для этого в Java предусмотрен цикл for-loop.
 * Этот цикл часто используется для перебора диапазона значений или массива. Если количество итераций или границы
 * диапазона известны, рекомендуется использовать for-loop. Если они границы неизвестны, предпочтительным решением
 * может быть цикл while-loop.
 *
 *          Основной синтаксис цикла for
 * for(initialization; condition; modification) {
 *     // some code
 * }
 * Части цикла:
 * оператор инициализации выполняется один раз перед началом цикла. Обычно здесь инициализируются переменные цикла;
 * условие — логическое выражение, определяющее необходимость следующей итерации, если это false, цикл завершается;
 * модификация — это оператор, который изменяет значение переменных цикла, он вызывается после каждой итерации цикла.
 * Обычно он использует увеличение или уменьшение для изменения переменной цикла.
 */

public class LessonEightForLoop {
    public static void main(String[] args) {

    }

    private static void simpleCounter() {
        for(int i = 0; i <= 5; i++) {
            System.out.print(i);
        }

    }

    private static void simpleReversCounter() {
        for(int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    private static void endlessForLoop(){
        for(int i = 0; i >= 0; i++) {
            System.out.println(i);
        }
    }

    private static void calculateSumWithFor(int num) {
        int sum = 0;
        for(int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    private static boolean calculateIsPrimeNumber(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }

        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void nestedForLoop() {
        for(int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(i + ";" + j + " ");
            }
            System.out.println();
        }
    }

    /**
     * Оператор continue и оператор break влияют только на цикл, в котором они находятся.
     * Операторы continue и break не могут пропустить текущую итерацию внешнего цикла
     */

    private static void tryingBreak() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                continue;
            }

            if (i % 6 == 0) {
                System.out.printf("before i'll complete this loop i would like to say, that i equals %d\n", i);
                break;
            }

            System.out.printf("i equals %d\n", i);
        }
    }

    private static void nestedForLoopWithBreak() {

        for(int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (j == i) {
                    break;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("I've finished nestedForLoopWithBreak() method");
    }

    private static void nestedForLoopWithContinue() {
        for(int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (j == i) {
                    continue;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("I've finished nestedForLoopWithContinue() method");
    }

    private static void nestedForLoopWithReturn() {
        System.out.println("I start nestedForLoopWithReturn() method");
        for(int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (j == i) {
                    return;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("I've finished nestedForLoopWithReturn() method");
    }

    private static void someMethod() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; true; i = 0) {
            int x = scanner.nextInt();
            if(x == 10) {
                System.out.println("stop it!");
                return;
            }
        }
    }

    private static void simpleMathOperation() {
        int x = 5;
        System.out.println(x++); // сначала выполнит операцию с x, только потом увеличит его на 1
        System.out.println(++x); // сначала выполнит увеличение х на 1, только потом выполнит с ним операцию
        System.out.println(x--); // сначала выполнит операцию с x, только потом уменьшит его на 1
        System.out.println(--x); // сначала выполнит уменьшение х на 1, только потом выполнит с ним операцию

        x += 10; // заменяет x = x + 10
        System.out.println(x);
        x -= 10; // заменяет x = x - 10
        System.out.println(x);
        x *= 10; // заменяет x = x * 10
        System.out.println(x);
        x /= 10; // заменяет x = x / 10
        System.out.println(x);
        x %= 10; // заменяет x = x % 10
        System.out.println(x);

        int i = 3;
        int j = 4;
        x = 5;
        System.out.println((i + j) + x);
        System.out.println((i + j) + x++);
        System.out.printf("x = %d\n", x);
        x = 5;
        System.out.println((i + j) + ++x);
        System.out.printf("x = %d\n", x);

        x = 5;
        int y = x++ + (--x * ++x );

        System.out.println(y);
        System.out.println(x);
    }
}
