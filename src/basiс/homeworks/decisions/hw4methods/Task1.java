package basiс.homeworks.decisions.hw4methods;


import java.util.Scanner;

/**
 * - введите 2 слова используя сканер, состоящие из четного количества букв (проверьте количество букв в слове).
 * <p>
 * создайте метод "returnNewWord", который принимает в качестве аргумента 2 строки и возвращает тоже строку.
 * Получите слово, состоящее из первой половины первого слова и второй половины второго слова.
 * Предполагаем, что пользователь вводит корректные данные.
 * <p>
 * "aabb", "ccdd" -> "aadd"
 * "12", "abcd" -> "1cd"
 * убедитесь, что ваш код работает, прежде чем сдавать.
 * убедитесь, что ваш код возвращает корректные значения для слов разной длины.
 * слова считываются НЕ в методе returnNewWord, там происходит только обработка
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое слово состоящее из четного числа символов:");
        String firstWord = scanner.nextLine();

        System.out.println("Введите второе слово состоящее из четного числа символов:");
        String secondWord = scanner.nextLine();

        String sum = returnNewWord(firstWord, secondWord);
        System.out.println("В результате сложения первой половины первого слова и второй половины второго слова " +
                "получилось: " + sum);

        // следующий код нежун для проверки:

        System.out.println("returnNewWord(\"aabb\", \"ffgg\") = " + returnNewWord("aabb", "ffgg"));
        System.out.println("returnNewWord(\"11112222\", \"we\") = " + returnNewWord("11112222", "we"));
        System.out.println("returnNewWord(\"....!!!!\", \"asdf\") = " + returnNewWord("....!!!!", "asdf"));
        System.out.println("returnNewWord(\"qwer\", \"rewq\") = " + returnNewWord("qwer", "rewq"));
    }

    // при создании метода указываем:
    // 1. тип возвращаемого значения - результат выполнения метода должен вернуть нам строку, мы сами решаем,
    // что мы с ней будем дальше делать (печатать или использовать где-то в другом месте и сдругой логикой)
    // 2. аргументы метода - метод принимает 2 строки и оперирует с ними, выполняя определенную логику:
    // (String strOne, String strTwo), при этом имена переменных не имеют значения, если они легальны для Java
    static String returnNewWord (String strOne, String strTwo) {
        // получаем длину первой строки и длину второй строки (количество символов в строках)
        int lengthOfFirstString = strOne.length(); // "длинаПервойСтроки"
        int lengthOfSecondString = strTwo.length(); // "длинаВторойСтроки"

        // находим индекс середины строки для каждого аргумента
        // делим длину строки пополам и получаем таким образом середину
        int midIndexOfFirstString = lengthOfFirstString / 2; // "среднийИндексПервойСтроки"
        int midIndexOfSecondString = lengthOfSecondString / 2; // "среднийИндексВторойСтроки"

        // при помощи метода substring класса String получаем первую половину первого слова:
        // firstHalfOfFirstString - "перваяПоловинаПервойСтроки", получаем ее в диапозоне от индекса 0 включительно, до
        // индекса midIndexOfFirstString не включая его.
        // secondHalfOfSecondString - "втораяПоловинаВторойСтроки", получаем ее в диапозоне от индекса
        // midIndexOfSecondString включительно, до индекса lengthOfSecondString ("длинаВторойСтроки") не включая
        // последний

        String firstHalfOfFirstString = strOne.substring(0, midIndexOfFirstString);
        String secondHalfOfSecondString = strTwo.substring(midIndexOfSecondString, lengthOfSecondString);

        // создаем переменную в которой будет зраниться результат сложения строк
        // resultOfConcatenation - "результатСцепления"
        String resultOfConcatenation = firstHalfOfFirstString + secondHalfOfSecondString;

        // возвращаем значение, которое записано в переменной resultOfConcatenation туда, откуда вызван метод
        // метод мог быть вызван откуда угодно, не только из метода main, но и из другого метода. Главное правильно
        // передать аргументы
        return resultOfConcatenation;
    }
}
