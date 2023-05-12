package basic.homeworks.decisions.hw7switch;


/**
 * Напишите метод, который принимает на вход номер значение месяца enum и возвращает количество дней в этом месяце.
 *    Необходимо написать enum с перечислением всех месяцев.
 *    Количество дней в феврале 28.
 */
public class Task1 {
    public enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static void main(String[] args) {
        Month month = Month.FEBRUARY;
        int days = getDaysInMonth(month);
        System.out.println("Количество дней в " + month.name() + ": " + days);
    }

    /**
     * В этом примере enum Month не содержит дополнительных полей, а логика определения количества дней в месяце
     * реализована с помощью оператора switch. Метод getDaysInMonth принимает значение месяца из enum и возвращает
     * количество дней в этом месяце.
     *
     * Пример выводит количество дней в феврале:
     */
    public static int getDaysInMonth(Month month) {

        switch (month) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                return 31;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                return 30;
            case FEBRUARY:
            default:
                return 28;
        }
    }
}

