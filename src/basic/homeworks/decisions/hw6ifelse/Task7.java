package basic.homeworks.decisions.hw6ifelse;

/**
 * Напишите метод, который определяет, является ли заданное число кратным 3, 5 или обоим и возвращает строку
 */
public class Task7 {
    public static void main(String[] args) {
        int number = 15;
        String result = checkNumberDivisibility(number);
        System.out.println(result);
    }

    /**
     * В этом примере создается  метод checkNumberDivisibility, принимающий число в виде целого числа и возвращающий
     * соответствующую строку в зависимости от его кратности.
     *
     * В методе main задается значение переменной number (проверяемое число), затем вызывается метод
     * checkNumberDivisibility, передавая ему это значение. Результат (строка, описывающая кратность числа)
     * выводится в консоль.
     *
     * Метод checkNumberDivisibility использует операторы остатка от деления (%) для проверки кратности числа 3 и 5.
     * Если число кратно и 3, и 5, то возвращается строка "Кратно 3 и 5". Если число кратно только 3, то возвращается
     * строка "Кратно 3". Если число кратно только 5, то возвращается строка "Кратно 5". Если число не кратно ни 3,
     * ни 5, то возвращается строка "Не кратно ни 3, ни 5".
     * @param number
     * @return
     */
    public static String checkNumberDivisibility(int number) {
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;

        if (isDivisibleBy3 && isDivisibleBy5) {
            return "Кратно 3 и 5";
        } else if (isDivisibleBy3) {
            return "Кратно 3";
        } else if (isDivisibleBy5) {
            return "Кратно 5";
        } else {
            return "Не кратно ни 3, ни 5";
        }
    }
}
