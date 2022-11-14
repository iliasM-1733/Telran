package basiс;

import java.util.Scanner;

/**
 * Цикл while состоит из блока кода и условия (логического выражения). Если условие равно true, выполняется код внутри
 * блока. Этот код повторяется до тех пор, пока условие не станет false. Поскольку этот цикл проверяет условие перед
 * выполнением блока, структура управления также известна как цикл предварительного тестирования. Вы можете думать о
 * цикле while как о повторяющемся условном операторе.
 * Основной синтаксис цикла while следующий:
 *         while (condition) {
 *             // body: do some logic
 *         }
 * Тело цикла может содержать любые корректные операторы Java, включая условные операторы и даже другие циклы, причем
 * последние называются вложенными циклами.
 */

public class LessonNineWhileLoop {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

    }

    private static void simpleWhileLoop() {
        int x = 0;
        while (x < 0) {
            System.out.print(x + " ");
            x++;
        }
        System.out.println();
    }

    private static void simpleWhileLoop(int x) {
        while (x < 0) {
            System.out.print(x + " ");
            x++;
        }
        System.out.println();
    }

    private static void whileLoopWithChar() {
        char letter = 'A';
        while (letter <= 'Z') {
            System.out.print(letter + " ");
            letter++;
        }
        System.out.println();
    }

    private static void simpleDoWhileLoop(int x) {
        do {
            System.out.println("i print it from do-while loop");
            x++;
        } while (x < 10);
    }

    private static void simpleWhileDoLoop(int x) {
        while (x < 10) {
            System.out.println("i print it from while-do loop");
            x++;
        }
    }

    private static void whileLoopWithScanner() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (scanner.hasNext()) {
            int elem = scanner.nextInt();
            sum += elem;
        }
        System.out.println(sum);
    }

    private static void tryBreakWithWhile() {
        int sum = 0;
        while (true) {
            int x = SCANNER.nextInt();
            if (x == 0) {
                break;
            }
            sum += x;
        }
        System.out.println(sum);
    }

    private static void tryContinueWithWhile() {
        int sum = 0;
        while (true) {
            int x = SCANNER.nextInt();
            if (x == 0) {
                continue;
            }
            sum += x;
        }
        // System.out.println(sum);
    }

    private static void tryReturnWithWhile() {
        int sum = 0;
        while (true) {
            int x = SCANNER.nextInt();
            if (x == 0) {
                return;
            }
            sum += x;
        }
        //System.out.println(sum);
    }

}
