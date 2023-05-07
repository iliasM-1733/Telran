package basiс;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class LessonFourMethods {


    // <type> calculateSquare(<some args>) {
    // - triangle square
    // - circle square
    // - rectangle square










    /**
     * Метод в Java – это комплекс выражений, совокупность которых позволяет выполнить определенную операцию.
     * Так, например, при вызове метода System.out.println(), система выполняет ряд команд для выведения сообщения
     * в консоль.
     *
     *          Синтаксис
     * modifier returnType nameOfMethod (Parameter List) {
     *    // тело метода
     * }
     * Приведенный выше синтаксис включает:
     * modifier – определяет тип доступа для метода и возможность его использования.
     * returnType – метод может возвратить значение.
     * nameOfMethod – указывает имя метода. Сигнатура метода включает имя метода и перечень параметров.
     * Parameter List – перечень параметров представлен типом, порядком и количеством параметров метода.
     * Данная опция задается произвольно, в методе может присутствовать нулевой параметр.
     * method body – тело метода определяет метод работы с командами.
     *
     * Методы с возвращаемым знаечением типа void в Java не производят возврат каких-либо значений,
     * лишь выполняет какую-то логику
     *
     * Перегрузка методов в Java – случай, когда в классе присутствуют два и более метода с одинаковым именем, но
     * различными параметрами. Данный процесс отличен от переопределения методов. При переопределении методов,
     * метод характеризуется аналогичным именем, типом, числом параметров и т.д.
     */
    public static void main(String[] args) {
        int x = methodThree();
        int a = methodThree();
        int b = methodThree();

        int y = methodThree(66);
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("y = " + y);

    }

    static double substraction(double x, double y) {
        // сложная логика подсчетов

        double result = x - y;

        return result;
    }


    static void methodOne(int num) { // int num = 33;

        System.out.println("я испек " + num + " круассанов!");

    }

    static void methodOne() {

        System.out.println("я испек круассан");

    }

    static void methodOne(String str) {
        System.out.println("я не знаю, что это значит!? " + str);
    }

    static String methodTwo(String str) { // String str = "String";
        String result = str.toUpperCase() + str;
        System.out.println("i print it from methodTwo : " + str);
        return result; //обязаны вернуть тип String
    }

    static int methodThree(int x) {
        // ккаие-то вычисления

        return x * x; //обязаны вернуть тип int
    }

    static int methodThree() {
        // ккаие-то вычисления
        return 12; //обязаны вернуть тип int
    }

    int nonStaticMethodThree(int x) {
        return x * x * x;
    }

    void nonStaticMethodOne() {
        System.out.println("this is non static method");
    }

    void nonStaticMethodOne(String str) {
        System.out.println("this is argeument of non static method: " + str);
    }



    static void methodFive(int x, String str) {
        System.out.println("methodFive  first - int, second - String");
        System.out.println("methodFive(); with two arguments. x = " + x + ", str = " + str);
    }

    static void methodFive(String str, int x) {
        System.out.println("\nmethod five with new logic. First - string, second - int");
        System.out.println("methodFive(); with two arguments. str = " + str + ", x = " + x);
    }

    public static void methodFive(int x) {
        System.out.println("methodFive(); with one int  argument. x = " + x);
        privateMethod();
    }

    static void methodFive(String str) {
        System.out.println("methodFive(); with one String argument. str = " + str);
    }

    static void methodFive() {
        System.out.println("methodFive(); without arguments");
    }

    private static void privateMethod() {
        System.out.println("this is private method");
    }
}
