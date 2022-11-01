package basik;

import java.util.Locale;

public class LessonFourMethods {
    public static void main(String[] args) {
//        methodOne("some arg");
//        methodOne();

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


    }

    static void methodOne() {
        System.out.println("do Something");
    }

    static void methodOne(String str) {
        System.out.println("this is argument of methodOne with string: " + str);
    }

    static void methodOne(int str) {
        System.out.println("this is argument of methodOne with int: " + str);
    }

    static String methodTwo(String str) { // String str = "one two three";
        str = str.toUpperCase(Locale.ROOT) + str;
        System.out.println("i print it from methodTwo : " + str);
        return str; //обязаны вернуть тип String
    }

    static int methodThree(int x) {
        // ккаие-то вычисления
        return x * x; //обязаны вернуть тип int
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
