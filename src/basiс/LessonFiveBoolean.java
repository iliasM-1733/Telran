package basiс;

import java.util.Scanner;

public class LessonFiveBoolean {
    static final Scanner SCANNER = new Scanner(System.in);
    static final boolean b1 = true;
    static final boolean b2 = true;
    static final boolean b3 = false;
    static final boolean b4 = false;
    static final int x = 4;
    static final int y = 5;
    static final int z = -5;

    public static void main(String[] args) {
        /**
         *  могут возвращать только true или false (правда или ложь),
         *  мы не можем получить какие-то другие или промежуточные логические значения.
         *      унарные операторы (не требуют двух значений boolean для операции)
         *  == - логическое равно, можно, означает "равно ли?"
         *  > - логическое больше
         *  < - логическое меньше
         *  >= - логическое больше или равно
         *  <= - логическое меньше или равно
         *  ! - логическое отрицание
         *      бинарный оператор (требуют двух значений boolean для операции)
         *  && - логическое "и"  - возвращает true, если ОБА оператора равны true
         *  || - логическое или - возвращает true, если хотя бы один из операторов равен true
         *  ^ - XOR - возвращает true, если логические операторы имеют разное значение
         */
        //logicalComparison();
        //logicalEquality();
        //logicalNegation();
        //logicalBinaryOperation();
        //logicalNegation();
        logicalPriority();

    }

    static void logicalEquality() {
        // b1 = true     b2 = true      b3 = false      b4 = false
        String stringTrue = "true";
        String stringFalse = "false";

        System.out.println(b1 == b2);
        System.out.println(b1 == b3);
        System.out.println(b3 == b4);
        System.out.println(x == y);
        System.out.println(x == 4);
        System.out.println(stringFalse == "false");
        System.out.println(stringTrue == stringFalse);
        System.out.println(stringTrue.equals(stringFalse));
        // System.out.println(stringFalse == x);
    }

    static void logicalComparison() {
        // x = 4    y = 5   z = -5
        System.out.println(x > y);
        System.out.println(x > 4);
        System.out.println(x < 4);
        System.out.println(y >= z);
        System.out.println(y <= z);
        System.out.println(z <= -5);
        // System.out.println(b1 > b2);
    }

    static void logicalBinaryOperation() {
        boolean isCupFull = true;
        boolean isBottleFull = false;

        System.out.println(isCupFull && isBottleFull);
        System.out.println(b1 && b2);
        System.out.println(b1 && b3);
        System.out.println(b4 && b4);


        System.out.println("isCupFull || isBottleFull = " + (isCupFull || isBottleFull));
        System.out.println(b1 || b2);
        System.out.println(b1 || b3);
        System.out.println(b4 || b4);

        System.out.println("isCupFull ^ isBottleFull = " + (isCupFull ^ isBottleFull));
        System.out.println(b1 ^ b2); // false
        System.out.println(b1 ^ b3); // true
        System.out.println(b4 ^ b4); // false
    }

    static void logicalNegation() {
        System.out.println(x != 4); // false
        System.out.println(x != 5); // true
        System.out.println(!(x == 4)); // false
        System.out.println(!(x == 5)); // true
        System.out.println(!b1); // false
        System.out.println(!b3); // true

        System.out.println(!b1 && b2);// false потому что b1 = false
        System.out.println(!(b1 && b2)); // false потому что результат в скобках равен true и мы берем обратное
        System.out.println(!(b1 && b3)); // true
        System.out.println(!(b3 && b4)); // true

        System.out.println(!b1 || b2); // true
        System.out.println(!(b1 || b2));
        System.out.println(!(b1 || b3));
        System.out.println(!(b3 || b4));

        System.out.println(!b1 ^ b2);
        System.out.println(!(b1 ^ b2));
        System.out.println(!(b1 ^ b3));
        System.out.println(!(b3 ^ b4));
    }

    static void logicalPriority() {
        /**
         * приоритет логических операций по убыванию:
         * 1. операции в скобках
         * 2. логическое отрицание
         * 3. унарные опреации
         * 4. логическое XOR
         * 5. логическое OR
         * 6. логическое И
         */

        System.out.println((true && (false || false) ^ !(4 > x)));
    }


    static boolean isSomething(boolean b1, boolean b2) {
        boolean result = b1 && b2;

        return result;
    }
}
