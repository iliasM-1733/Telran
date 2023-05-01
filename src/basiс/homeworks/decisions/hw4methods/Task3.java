package basiс.homeworks.decisions.hw4methods;


/**
 * - реализовать метод, который конвертирует указанную сумму в евро в сумму в долларах США
 * метод принимает два числа - сумму в евро и текущий курс (количество долларов, которое дают за 1 евро).
 * метод ничего не возвращает, но печатает в консоль:
 * "при курсе ... USD за один EUR, при обмене ... EUR, вы получте ... USD".
 */
public class Task3 {

    public static void main(String[] args) {
        convertEuroToDollar(100, 1.17);
    }

    /**
     * Метод, который конвертирует указанную сумму в евро в сумму в долларах США
     *
     * @param amountInEuro сумма в евро
     * @param exchangeRate текущий курс (количество долларов, которое дают за 1 евро)
     */
    static void convertEuroToDollar(double amountInEuro, double exchangeRate) {
        // Вычисляем сумму в долларах США, умножая сумму в евро на текущий курс
        double amountInDollars = amountInEuro * exchangeRate;

        // Печатаем результат конвертации в консоль, используя форматирование строк
        System.out.printf("При курсе %.2f USD за один EUR, при обмене %.2f EUR, вы получите %.2f USD",
                exchangeRate, amountInEuro, amountInDollars);
    }

    /**
     * В этом методе мы используем два аргумента - amountInEuro и exchangeRate, которые представляют собой сумму в
     * евро и текущий курс обмена соответственно. Далее, мы умножаем сумму в евро на текущий курс, чтобы получить
     * эквивалентную сумму в долларах США. Затем мы используем метод printf класса System.out, чтобы отформатировать
     * строку вывода в консоль и напечатать результат конвертации.
     */

}
