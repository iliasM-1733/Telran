package basiс.homeworks.decisions.hw4methods;

/**
 * - реализовать метод getChars, которы принмиает строку и два числа, при этом возвращает строку, состоящую из символов,
 * стоящих под этими индексами. Подразумеваем, что данные введены верно и доп проверки не нужны. Воспользуйтесь методом
 * charAt() класса строк
 * пример
 * "hello" 0, 4 -> "ho"
 * "java" 1, 3 -> "aa"
 * "method" 5, 1 -> "de"
 */
public class Task6 {
    // Метод main для проверки работы метода getChars
    public static void main(String[] args) {
        // Вызов метода getChars и вывод результата на экран
        System.out.println(getChars("hello", 0, 4)); // ожидаемый результат: "ho"
        System.out.println(getChars("java", 1, 3)); // ожидаемый результат: "aa"
        System.out.println(getChars("method", 5, 1)); // ожидаемый результат: "de"
    }

    // Объявление метода getChars
    public static String getChars(String str, int first, int second) {
        // Объявление переменной результата
        String result = "";
        // Добавление в результирующую строку символа под индексом first
        result = result + str.charAt(first);
        // Добавление в результирующую строку символа под индексом second
        result = result + str.charAt(second);

        // Возвращение результирующей строки
        return result;
    }
}
