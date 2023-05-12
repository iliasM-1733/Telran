package basic.homeworks.decisions.hw6ifelse;

/**
 * Напишите метод, который определяет время года (весна, лето, осень, зима) в зависимости от заданного месяца.
 * используйте конструкции if-else-if. Метод принимает строку и возвращает тоже строку
 */
public class Task5 {
    public static void main(String[] args) {
        String month = "январь";
        String season = determineSeason(month);
        System.out.println("Время года для месяца " + month + ": " + season);
    }

    /**
     * В этом примере создается метод determineSeason, принимающий месяц в виде
     * строки и возвращающий соответствующее время года.
     *
     * В методе main задается значение переменной month (месяц), затем вызывается метод determineSeason, передавая ему
     * этот месяц. Результат (время года) выводится в консоль.
     *
     * Метод determineSeason использует конструкцию if-else if-else для сравнения заданного месяца с определенными
     * значениями строк. В зависимости от соответствия, возвращается соответствующее время года в виде строки.
     */
    public static String determineSeason(String month) {
        if (month.equals("декабрь") || month.equals("январь") || month.equals("февраль")) {
            return "зима";
        } else if (month.equals("март") || month.equals("апрель") || month.equals("май")) {
            return "весна";
        } else if (month.equals("июнь") || month.equals("июль") || month.equals("август")) {
            return "лето";
        } else if (month.equals("сентябрь") || month.equals("октябрь") || month.equals("ноябрь")) {
            return "осень";
        } else {
            return "неверный месяц";
        }
    }
}

