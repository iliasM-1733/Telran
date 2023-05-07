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
        logicalEquality();
        // logicalNegation();
        //logicalBinaryOperation();
        //logicalNegation();
        //logicalPriority();


        // 2 > 3
        // "sdfsdf" == "sdfsf"
        //  3 != 34

        // 101 -> 110
        //
    }

    static void logicalEquality() {
        // b1 = true     b2 = true      b3 = false      b4 = false
        // x = 4    y = 5   z = -5
        String stringTrue = "true";
        String stringFalse = "false";

        System.out.println(b1 == b2); // true
        System.out.println(b1 == b3); // false
        System.out.println(b3 == b4); // true
        System.out.println(x == y); // false
        System.out.println(x == 4); // true
        System.out.println(stringFalse == "false"); // true
        System.out.println(stringTrue == stringFalse); // false
        System.out.println(stringTrue.equals(stringFalse)); // false
//        System.out.println(stringFalse == x);
    }

    static void logicalComparison() {
        // x = 4    y = 5   z = -5
        System.out.println(x > y); // false
        System.out.println(x > 4); // false
        System.out.println(x < 4); // false
        System.out.println(y >= z); // true
        System.out.println(y <= z); // false  \
        System.out.println(z <= -5);// true
        System.out.println("\'a\' > \'A\' = " + ('a' > 'A'));
        // System.out.println(b1 > b2);
    }

    static void logicalBinaryOperation() {
        // b1 = true     b2 = true      b3 = false      b4 = false
        boolean isCupFull = true;
        boolean isBottleFull = false;

        System.out.println(isCupFull && isBottleFull); // false
        System.out.println(b1 && b2); // true
        System.out.println(b1 && b3); // false
        System.out.println(b4 && b4); // false


        System.out.println("isCupFull || isBottleFull = " + (isCupFull || isBottleFull));
        System.out.println(b1 || b2); // true
        System.out.println(b1 || b3); // true
        System.out.println(b4 || b4); // false

        // XOR - отрицающее или
        System.out.println("isCupFull ^ isBottleFull = " + (isCupFull ^ isBottleFull));
        System.out.println(b1 ^ b2); // false
        System.out.println(b1 ^ b3); // true
        System.out.println(b3 ^ b2); // true
        System.out.println(b4 ^ b4); // false
    }

    static void logicalNegation() {
        // b1 = true     b2 = true      b3 = false      b4 = false
        // x = 4    y = 5   z = -5
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

        System.out.println(!b1 || b2); // true  (false || true)
        System.out.println(!(b1 || b2)); // false  !(true || true)
        System.out.println(!(b1 || b3)); // false  !(true || false)
        System.out.println(!(b3 || b4)); // true   !(false || false)

        // XOR - отрицающее или
        System.out.println(!b1 ^ b2); // true
        System.out.println(!(b1 ^ b2)); // true
        System.out.println(!(b1 ^ b3)); // false
        System.out.println(!(b3 ^ b4)); // true
    }

    static void logicalPriority() {
        /**
         * приоритет логических операций по убыванию:
         * 1. операции в скобках
         * 2. логическое отрицание
         * 3. унарные опреации
         * 4. логическое XOR
         * 5. логическое OR
         * 6. логическое ИЛИ
         */

        System.out.println((true && (false || false) ^ !(4 > x)));
        System.out.println(true || true ^ (!false ^ true) || false && !(false && true));
        // true && false ^ !false
        // true && false ^ true
        // true && true
        // true

    }


    static boolean isSomething(boolean b1, boolean b2) {
        boolean result = b1 && b2;

        return result;
    }




}
