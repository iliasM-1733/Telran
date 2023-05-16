package basic.homeworks.decisions.hw8for;

/**
 * Напишите программу, которая принимает строку и символ и возвращает количество вхождений этого символа в строку:
 * - "hello", 'l' -> 2
 * - "hello", 'e' -> 1
 * - "hello", '!' -> 0
 */
public class Task5 {
    public static void main(String[] args) {
        String str = "hello";
        char ch = 'l';
        int count = countOccurrences(str, ch);
        System.out.println("Количество вхождений символа '" + ch + "' в строку \"" + str + "\": " + count);
    }

    /**
     * В данном коде мы сначала задаем строку str и символ ch, для которых мы хотим найти количество вхождений
     * символа в строку. Затем мы вызываем метод countOccurrences(), передавая ему строку и символ.
     *
     * Метод countOccurrences() проходит по каждому символу в строке с помощью цикла for. Если текущий символ равен
     * заданному символу ch, увеличиваем счетчик count на 1.
     *
     * В конце метода countOccurrences() возвращаем значение переменной count, которое представляет количество
     * вхождений символа ch в строку str.
     *
     * В главном методе main() выводим результат - количество вхождений символа в строку.
     */
    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}

