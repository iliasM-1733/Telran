package basic;

import java.util.Arrays;

public class LessonThree {
    public static void main(String[] args) {
        //primitives();
        // primitiveOperation();
        //informationAboutString();
        //basicStringOperations();
        //simpleMathOperationsInt();
        //simpleMathOperationsDouble();
    }


    static void primitives() {
        // для целых чисел
        byte myByte = 127; // 8 bit -128 to 127 -> total 256 dif digits -> 2^8 ->
        short myShort = 32_767; // 16 bit -32_768 to 32_767 -> 2^16
        int myInt = 2_147_483_647; // default 32 bit
        long myLong = 9_223_372_036_854_775_807L; // 64 bit


        // дробные числа
        float myFloat = 1.0F; // 32 bit
        double myDouble = 1.0; // default 64 bit


        // символы см ASCII table
        char myChar = 'r'; // 16 bit
        char mySecondChar = 107; // U

        // логический тип данных
        boolean myBoolean = false; // true or false


        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);

        System.out.println("myFloat / 3 = " + myFloat / 3);
        System.out.println("myDouble / 3 = " + myDouble / 3);

        System.out.println(myChar);
        System.out.println("mySecondChar = " + mySecondChar);
        System.out.println(myBoolean);
    }

    static void primitiveOperation() {
        /**
         * не явное приведение типов не требует от программиста указывать и подтверждать данную операцию
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
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("myFloat = Long.MAX_VALUE = " + myFloat);

        /** явное приведение работает в том случае, когда мы не можем прямо кастирвоать данные из одного типа в другой,
         *  по причине того, что это может вызвать ошибки.
         */
        System.out.println("\nявное приведение");
        myDouble = 1_000.453401234567;
        myFloat = (float) myDouble; //

        myLong = (long) myFloat;
        myInt = (int) myLong;
        myShort = (short) myInt; // 32_765 32_766 32_767 -32_768
        myByte = (byte) myShort; // 125 126 127 -128 -127 -126


        System.out.println("myDouble = " + myDouble);
        System.out.println("myFloat = (float) myDouble; = " + myFloat);

        System.out.println("myLong = (long) myFloat; = " + myLong);
        System.out.println("myInt = (int) myLong; = " + myInt);
        System.out.println("myShort = (short) myInt; = " + myShort);
        System.out.println("myByte = (byte) myShort; =" + myByte);
        System.out.println();





        /** также допустимо указать в скобках другой тип данных, который не требует явного приведения */
        myLong = 1_000;
        myInt = (short) myLong;

        // simpleMathOperationsInt();
        simpleMathOperationsDouble();
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
        String str3 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        String str4 = new String(new char[]{'w', 'e', 'l', ' ', 'c', 'o', 'm', 'e'}, 3, 5);//3 -начальный индекс, 4 -кол-во символов

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
        System.out.println(
                str5.length()
        ); // 4

        /** А с помощью метода toCharArray() можно обратно преобразовать строку в массив символов: */

        String str6 = "any string";
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

    /** Основные методы класса String

     toLowerCase(): переводит все символы строки в нижний регистр
     toUpperCase(): переводит все символы строки в верхний регистр
     replace(): заменяет в строке одну подстроку на другую
     trim(): удаляет начальные и конечные пробелы
     charAt(): возвращает символ строки по индексу
     equals(): сравнивает строки с учетом регистра
     equalsIgnoreCase(): сравнивает строки без учета регистра
     indexOf(): находит индекс первого вхождения подстроки в строку
     substring(): возвращает подстроку, начиная с определенного индекса до конца или до определенного индекса
     */
    static void basicStringOperations() {


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
        String str4 = "Год " + 20 + 23; // -> "Год 20" + 23 -> "Год 2023"
        System.out.println(str4);
        str4 = 20 + 23 + " Год"; // 43 + " Год" -> "43 Год"
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

        /**         Извлечение символов и подстрок
         *
         *         Для извлечения символов по индексу в классе String определен метод char charAt(int index).
         *         Он принимает индекс, по которому надо получить символов, и возвращает извлеченный символ:
         */

        String str7 = "Java"; // ['J', 'a', 'v', 'a']   str.length() - 1
        char c = str7.charAt(0); // - первый символ
        System.out.println(c); // v
        int indexOfLastSymbol = str7.length() - 1; // индекс последнего символа всегда длина строки - 1
        c = str7.charAt(indexOfLastSymbol);
        System.out.println(c);


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
    }

    /**
     * В этом примере мы объявляем две переменные operand1 и operand2, содержащие целочисленные значения.
     * Затем мы выполняем простые математические операции с этими значениями, такие как сложение, вычитание,
     * умножение, целочисленное деление и остаток от деления. Результат каждой операции сохраняется в отдельной
     * переменной и выводится на экран вместе с соответствующими комментариями.
     */
    public static void simpleMathOperationsInt() {
        // Объявляем переменные для операндов
        int operand1 = 5;
        int operand2 = 3;

        // Сложение
        int resultAddition = operand1 + operand2;
        System.out.println(operand1 + " + " + operand2 + " = " + resultAddition);

        // Вычитание
        int resultSubtraction = operand1 - operand2;
        System.out.println(operand1 + " - " + operand2 + " = " + resultSubtraction);

        // Умножение
        int resultMultiplication = operand1 * operand2;
        System.out.println(operand1 + " * " + operand2 + " = " + resultMultiplication);

        // Целочисленное деление
        int resultDivision = operand1 / operand2;
        System.out.println(operand1 + " / " + operand2 + " = " + resultDivision);

        // 5 / 3 - > 1 (2/3)
        // 17 / 5 -> 3 (2/5)
        // 21 / 7 -> 3 (0/ 7)
        // 7 / 21 -> 0 (7 / 21)
        // 19999 / 10000 -> 1 (9999/10_000)
        //5 / 17 -> 0 (5 /17)

        // Остаток от деления
        int resultModulus = operand1 % operand2;
        System.out.println(operand1 + " % " + operand2 + " = " + resultModulus);
        // 5 % 3 -> 1 (2 / 3)

        // 6 % 4 -> 1 (2 / 4) ->

        // 9 % 5 -> 9 - 1*5 -> 4/5
        // 4 % 3 ->
        // 8 % 3 -> 2
        // 15 % 7 -> 1
        // 7 % 15 -> 7
    //  1034 -> "10.34$" -> 10.25 -> 0.07 + opt.10.25

        // int  f = 10.4;
        // error
        }



    /**
     * В этом примере кода мы объявляем две переменные типа double (a и b) и выполняем на них простые математические
     * операции, такие как сложение, вычитание, умножение, деление и нахождение остатка от деления.
     *
     * Обратите внимание, что для чисел типа double используются точки вместо запятых для разделения
     * дробной и целой части числа. Кроме того, для операции нахождения остатка от деления используется знак %,
     * а не mod, как в примере для целочисленных значений.
     */
    public static void simpleMathOperationsDouble() {
        // Объявляем две переменные типа double
        double a = 10.5;
        double b = 3.2;

        // Примеры математических операций
        double sum = a + b; // Сложение
        double diff = a - b; // Вычитание
        double product = a * b; // Умножение
        double quotient = a / b; // Деление


        double remainder = a % b; // Остаток от деления

        // Выводим результаты операций
        System.out.println("Сумма a и b = " + sum);
        System.out.println("Разность a и b = " + diff);
        System.out.println("Произведение a и b = " + product);
        System.out.println("Частное a и b = " + quotient);
        System.out.println("Остаток от деления a на b = " + remainder);
    }
}
