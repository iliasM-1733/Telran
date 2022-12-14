package basiс;


import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class LessonThree {
    public static void main(String[] args) {

    }

    static void primitiveOperation(){
        /** не явное приведение тпипов не требует от программиста указывать и подтверждать данную операцию
         */
        byte myByte = 10;
        short myShort = myByte;
        int myInt = myShort;
        long myLong = myInt;
        float myFloat = myLong;
        double myDouble = myFloat;

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);


        /** при этом все равно следует учитвать размерность каждого типа
         */
        myFloat = Long.MAX_VALUE;
        System.out.println(Long.MAX_VALUE);
        System.out.println(myFloat);

        /** явное приведение работает в том случае, когда мы не можем прямо кастирвоать данные из одного типа в другой,
         *  по причине того, что это может вызвать ошибки.
         */
        System.out.println("явное приведение");
        myDouble = 1_000.00;
        myFloat = (float) myDouble;
        myLong = (long) myFloat;
        myInt = (int) myLong;
        myShort = (short) myInt;
        myByte = (byte) myShort;

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);

        /** также допустимо указать в скобках другой тип данных, который не требует явного приведения */
        myLong = 1_000;
        myInt = (short) myLong;
    }

    static void informationAboutString() {
        /** Операции со строками */

        /**
         * Строка представляет собой последовательность символов. Для работы со строками в Java определен класс String,
         * который предоставляет ряд методов для манипуляции строками. Физически объект String представляет собой ссылку
         * на область в памяти, в которой размещены символы.
         *
         * Для создания новой строки мы можем использовать один из конструкторов класса String, либо напрямую
         * присвоить строку в двойных кавычках:
         */
        String str1 = "Java";
        String str2 = new String(); // пустая строка
        String str3 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
        String str4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);//3 -начальный индекс, 4 -кол-во символов

        System.out.println(str1); // Java
        System.out.println(str2); //
        System.out.println(str3); // hello
        System.out.println(str4); // come


        /**
         * При работе со строками важно понимать, что объект String является неизменяемым (immutable).
         * То есть при любых операциях над строкой, которые изменяют эту строку, фактически будет создаваться новая
         * строка.
         *
         * Поскольку строка рассматривается как набор символов, то мы можем применить метод length() для нахождения
         * длины строки или длины набора символов:
         */

        String str5 = "Java";
        System.out.println(str5.length()); // 4

        /** А с помощью метода toCharArray() можно обратно преобразовать строку в массив символов: */

        String str6 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
        System.out.println(str6);
        char[] helloArray = str6.toCharArray();
        System.out.println(Arrays.toString(helloArray));

        /** Строка может быть пустой. Для этого ей можно присвоить пустые кавычки или удалить из стоки все символы
         * В этом случае длина строки, возвращаемая методом length(), равна 0.
         * Класс String имеет специальный метод, который позволяет проверить строку на пустоту - isEmpty().
         * Если строка пуста, он возвращает true:
         * */

        String str7 = "";   // пустая строка
        System.out.println(str7.isEmpty()); // true
        System.out.println(str7.isBlank()); // true

        /** метод isBlank возвращает true даже в том слечае, если строка не пустая, но в ней нет символов кроме пробелов */

        String str8 = " ";   // не пустая строка
        System.out.println(str8.isEmpty()); // false
        System.out.println(str8.isBlank()); // true

        /** Переменная String может не указывать на какой-либо объект и иметь значение null: */
        String str9 = null;   // строка не указывает на объект
        System.out.println(str9 == null); // true

        /** Значение null не эквивалентно пустой строке. Например, в следующем случае мы столкнемся с ошибкой выполнения: */

        String str10 = null;   // строка не указывает на объект
        // System.out.println(str10.length() == 0);
    }

    static void basicStringOperations() {
        /** Основные методы класса String
         Основные операции со строками раскрывается через методы класса String, среди которых можно выделить следующие:
         concat(): объединяет строки
         valueOf(): преобразует объект в строковый вид
         join(): соединяет строки с учетом разделителя
         сompareTo(): сравнивает две строки
         charAt(): возвращает символ строки по индексу
         getChars(): возвращает группу символов
         equals(): сравнивает строки с учетом регистра
         equalsIgnoreCase(): сравнивает строки без учета регистра
         regionMatches(): сравнивает подстроки в строках
         indexOf(): находит индекс первого вхождения подстроки в строку
         lastIndexOf(): находит индекс последнего вхождения подстроки в строку
         startsWith(): определяет, начинается ли строка с подстроки
         endsWith(): определяет, заканчивается ли строка на определенную подстроку
         replace(): заменяет в строке одну подстроку на другую
         trim(): удаляет начальные и конечные пробелы
         substring(): возвращает подстроку, начиная с определенного индекса до конца или до определенного индекса
         toLowerCase(): переводит все символы строки в нижний регистр
         toUpperCase(): переводит все символы строки в верхний регистр
         */

        /** Соединение строк
         *
         * Для соединения строк можно использовать операцию сложения ("+"):
         */

        String str1 = "Java";
        String str2 = "Hello";
        String str3 = str1 + " " + str2;

        System.out.println(str3); // Hello Java

        /** При этом если в операции сложения строк используется нестроковый объект, например, число,
         * то этот объект преобразуется к строке:
         */
        String str4 = "Год " + 2022;
        System.out.println(str4);

        /**
         * Фактически же при сложении строк с нестроковыми объектами будет вызываться метод
         * valueOf() класса String. Данный метод имеет множество перегрузок и преобразует практически все типы
         * данных к строке. Для преобразования объектов различных классов метод valueOf вызывает метод toString()
         * этих классов.
         * Другой способ объединения строк представляет метод concat():
         */
        String str5 = "Java";
        String str6 = "Hello";
        str5 = str6.concat(str5); // HelloJava
        System.out.println(str5);


        /** Метод concat() принимает строку, с которой надо объединить вызывающую строку, и возвращает соединенную строку.
         *         Еще один метод объединения - метод join() позволяет объединить строки с учетом разделителя.
         *         Например, выше две строки сливались в одно слово "HelloJava", но в идеале мы бы хотели, чтобы две
         *         подстроки были разделены пробелом. И для этого используем метод join():
         *
         *        Метод join является статическим. Первым параметром идет разделитель, которым будут разделяться
         *        подстроки в общей строке, а все последующие параметры передают через запятую произвольный набор
         *        объединяемых подстрок - в данном случае две строки, хотя их может быть и больше
         */

        String str7 = "Java";
        String str8 = "Hello";
        String str9 = String.join("; ", str2, str1); // Hello Java
        System.out.println(str9);


        /**         Извлечение символов и подстрок
         *
         *         Для извлечения символов по индексу в классе String определен метод char charAt(int index).
         *         Он принимает индекс, по которому надо получить символов, и возвращает извлеченный символ:
         */

        String str10 = "Java";
        char c = str10.charAt(2);
        System.out.println(c); // v

        /** Как и в массивах индексация начинается с нуля.
         *         Если надо извлечь сразу группу символов или подстроку, то можно использовать метод
         *         getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin). Он принимает следующие параметры:
         *         srcBegin: индекс в строке, с которого начинается извлечение символов
         *         srcEnd: индекс в строке, до которого идет извлечение символов
         *         dst: массив символов, в который будут извлекаться символы
         *         dstBegin: индекс в массиве dst, с которого надо добавлять извлеченные из строки символы
         */

        String str11 = "Hello world!";
        int start = 6;
        int end = 11;
        char[] dst=new char[end - start];
        str11.getChars(start, end, dst, 0);
        System.out.println(dst); // world


        /**
         * Сравнение строк
         * Для сравнения строк используются методы equals() (с учетом регистра) и equalsIgnoreCase() (без учета регистра).
         * Оба метода в качестве параметра принимают строку, с которой надо сравнить:
         */
        String str12 = "Hello";
        String str13 = "hello";
        System.out.println(str12.equals(str13)); // false
        System.out.println(str12.equalsIgnoreCase(str13)); // true
        /**
         * В отличие от сравнения числовых и других данных примитивных типов для строк не применяется знак равенства ==.
         * Вместо него надо использовать метод equals().
         * Еще один специальный метод regionMatches() сравнивает отдельные подстроки в рамках двух строк.
         * Он имеет следующие формы:
         */

        String str14 = "Hello world";
        String str15 = "I work";
        boolean result = str14.regionMatches(6, str15, 2, 3);
        System.out.println(result); // true

        /** В данном случае метод сравнивает 3 символа с 6-го индекса первой строки ("wor") и 3 символа со 2-го индекса
         * второй строки ("wor"). Так как эти подстроки одинаковы, то возвращается true.
         *
         * И еще одна пара методов int compareTo(String str) и int compareToIgnoreCase(String str) также позволяют
         * сравнить две строки, но при этом они также позволяют узнать больше ли одна строка, чем другая или нет.
         * Если возвращаемое значение больше 0, то первая строка больше второй, если меньше нуля, то, наоборот,
         * вторая больше первой. Если строки равны, то возвращается 0.
         * Для определения больше или меньше одна строка, чем другая, используется лексикографический порядок.
         * То есть, например, строка "A" меньше, чем строка "B", так как символ 'A' в алфавите стоит перед символом 'B'.
         * Если первые символы строк равны, то в расчет берутся следующие символы. Например:
         */
        String str16 = "hello";
        String str17 = "world";
        String str18 = "hell";

        System.out.println(str16.compareTo(str17)); // -15 - str16 меньше чем str17
        System.out.println(str16.compareTo(str18)); // 1 - str16 больше чем str18

        /**
         * Поиск в строке
         * Метод indexOf() находит индекс первого вхождения подстроки в строку, а метод lastIndexOf() - индекс
         * последнего вхождения. Если подстрока не будет найдена, то оба метода возвращают -1:
         *
         * Метод startsWith() позволяют определить начинается ли строка с определенной подстроки, а метод endsWith()
         * позволяет определить заканчивается строка на определенную подстроку:
         */

        String str19 = "Hello world";
        int index1 = str19.indexOf('l'); // 2
        int index2 = str19.indexOf("world"); //6
        int index3 = str19.lastIndexOf('l'); //9
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);

        String str20 = "myfile.exe";
        boolean startsWith = str20.startsWith("my"); //true
        boolean endsWith = str20.endsWith("exe"); //true

        /** Метод replace() позволяет заменить в строке одну последовательность символов на другую: */
        String str21 = "Hello world";
        String replStr1 = str21.replace('l', 'd'); // Heddo wordd
        String replStr2 = str21.replace("Hello", "Bye"); // Bye world
        System.out.println(replStr1);
        System.out.println(replStr2);

        /** Метод trim() позволяет удалить начальные и конечные пробелы: */
        String str22 = "  hello world  ";
        str22 = str22.trim(); // hello world

        /** Метод toLowerCase() переводит все символы строки в нижний регистр, а метод toUpperCase() - в верхний: */
        String str23 = "Hello World";
        System.out.println(str23.toLowerCase()); // hello world
        System.out.println(str23.toUpperCase()); // HELLO WORLD

        /**
         * Метод split() позволяет разбить строку на подстроки по определенному разделителю. Разделитель -
         * какой-нибудь символ или набор символов передается в качестве параметра в метод. Например, разобьем
         * текст на отдельные слова:
         */
        String text = "Hello, dear friends!";
        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));
    }
}
