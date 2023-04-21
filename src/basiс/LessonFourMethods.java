package basiс;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;

public class LessonFourMethods {

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
    public static void main(String[] args) throws IOException { // String[] args
        /*
        String string = "one two three";
        String str = methodTwo(string);

        methodOne();
        methodOne("string");
        methodOne(123);


        System.out.println(methodThree(13));

        LessonFourMethods lessonFourMethods = new LessonFourMethods();


        //не статичные методы не могут быть использованы без экземпляра класса
        System.out.println("===non static methods===");
        lessonFourMethods.nonStaticMethodOne();
        lessonFourMethods.nonStaticMethodOne("sfdsfdssd");
        System.out.println(lessonFourMethods.nonStaticMethodThree(4));

        // также не статичный метод
        String temp = "temporary";
        temp.toUpperCase();

        // не статичная переменная - переменная экземпляра класса, допустим длинна строки
        int lenght = temp.length();

        // к статичным методам мы можем отнести методы класса Math
        Math.pow(3, 4);

        // также относится к статическим переменным
        double pi = Math.PI;

        //=====================

        methodFive(5, "string");
        methodFive("another string", 34);
*/
//        String str = methodTwo("ssf");
//        System.out.println(str);
//
//        int num = methodThree(1251);
//        System.out.println(num);

//        LessonFourMethods lsf = new LessonFourMethods();
//        lsf.methodOne();

        double myDouble = substraction(10324, 354);
        // ...

        System.out.println(myDouble);
    }

    static double substraction(double x, double y) {

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

    static String methodTwo(String str) { // String str = "one two three";
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
