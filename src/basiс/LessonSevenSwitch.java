package basiс;

import org.w3c.dom.ls.LSOutput;

/**
 * Switch и case обязательные ключевые слова. Ключевые слова break и default являются необязательными. Ключевое слово
 * break останавливает выполнение всего оператора switch, а не только одного case.
 * Если a case не содержит break ключевого слова, case будут также оцениваться следующие элементы, включая default case.
 * Случай default также оценивается, если нет другого case, совпадающего со значением переменной. Ключевое слово break
 * в default ветке является необязательным и может быть опущено.
 * Раздел case может содержать любой блок кода, даже вложенный switch оператор, однако рекомендуется по возможности
 * избегать глубоко вложенных структур кода.
 *
 * Тип данных для оператора выбора switch в Java должен быть одним из следующих:
 *
 * byte, short, char, int.
 * Их классы-обёртки Byte, Short, Character, Integer.
 * String (начиная с Java 7).
 * Перечисление (Enum).
 */

public class LessonSevenSwitch {
    public static void main(String[] args) {
//        switchWithBreak("one");
//        switchWithBreak("four");
//        switchWithBreak("nine");
//
//
//
//        switchWithoutBreak("one");
//        switchWithoutBreak("four");
//        switchWithoutBreak("nine");
//
//        switchWithEnum(Transport.CAR);
//        switchWithEnum(Transport.BUS);
//        switchWithEnum(Transport.ON_FOOT);
//        switchWithEnum("CAR");
//
//        switchWithEnum(DayOfWeek.MONDAY);
//        switchWithEnum(DayOfWeek.THURSDAY);
//        switchWithEnum(DayOfWeek.SUNDAY);
//
        tryingTernaryOperator();
    }
    private enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    private enum Transport {
        CAR, BUS, TRAIN, BICYCLE, ON_FOOT;
    }

    public static void switchWithBreak(String num) {
        switch (num) {
            case "one":
                System.out.println("This string is meaning 1 number");
                break;
            case "two":
                System.out.println("This string is meaning 2 number");
                break;
            case "three":
                System.out.println("This string is meaning 3 number");
                break;
            case "four":
                System.out.println("This string is meaning 4 number");
                break;
            case "five":
                System.out.println("This string is meaning 5 number");
                break;
            default:
                System.out.println("i dont know what does it means");
        }
    }

    public static void switchWithoutBreak(String num) {
        switch (num) {
            case "one":
                System.out.println("This string is meaning 1 number");
            case "two":
                System.out.println("This string is meaning 2 number");
            case "three":
                System.out.println("This string is meaning 3 number");
            case "four":
                System.out.println("This string is meaning 4 number");
            case "five":
                System.out.println("This string is meaning 5 number");
            default:
                System.out.println("i dont know what does it means");
        }
    }

    public static void switchWithEnum(Transport transport) {
        switch (transport) {
            case CAR -> System.out.println("you will be on final point in 15 minutes with a car");
            case BUS -> System.out.println("you will be on final point in 20 minutes with a bus");
            case TRAIN -> System.out.println("you will be on final point in 22 minutes with a train");
            case BICYCLE -> System.out.println("you will be on final point in 17 minutes with a bicycle");
            case ON_FOOT -> System.out.println("you will be on final point in 15 minutes by foot");
        }
    }

    public static void switchWithEnum(DayOfWeek day) {
        switch (day) {
            case MONDAY:
            case WEDNESDAY:
                System.out.println("don't forget about Java basic course!");
            case THURSDAY:
            case TUESDAY:
            case FRIDAY:
                System.out.println("today is working day");
                break;
            case SATURDAY:
            default:
                System.out.println("today is weekend");
                break;
        }
    }


    public static double calculateFigureSquare(String figureType) {
        switch (figureType) {
            case "triangle":
                return calculateTriangleSquare();
            case "rectangle":
                return calculateRectangleSquare();
            case "circle":
                return calculateCircleSquare();
            default:
                System.out.println("wrong name of figure");
                return -1;
        }
    }

    public static double calculateTriangleSquare() {
        // some logic
        return 0.0;
    }

    public static double calculateRectangleSquare() {
        // some logic
        return 0.0;
    }

    public static double calculateCircleSquare() {
        // some logic
        return 0.0;
    }

    /**
     * Общий синтаксис тернарного оператора следующий:
     *      result = condition ? true : false;
     * Вот как выглядит эквивалентный тернарный оператор:
     *      int x = a > b ? a : b;
     * Он включает в себя два специальных символа ? и : .
     * Здесь condition - это логическое выражение, которое оценивается как либо , true либо false. Если это выражение
     * равно true, тернарный оператор оценивает trueCase, в противном случае оценивается elseCase. Важно, что trueCase
     * и elseCase являются выражениями, которые можно привести к общему типу. Этот тип определяет тип файла result.
     */

    public static void tryingTernaryOperator() {
        String isOdd;
        int x = 34;
        int y = 156;
        int z = 76;

        int max = x > y ? x : y;
        System.out.printf("maximum of two variables equals %d\n", max);

        int min = x > y ? y : x;
        System.out.printf("minimum of two variables equals %d\n", min);

        boolean isEven = (x % 2 == 0) ? true : false;

        if (isEven) {
            System.out.println("x is even number");
        } else {
            System.out.println("x is odd number");
        }

        // незаконная в Java запись:
        // (x % 2 == 0) ? System.out.println("x is even number") : System.out.println("x is odd number");

        int maxOfThree = (x > y)
                ? ((x > z) ? x : z)
                : ((y > z) ? y : z);
        System.out.println(maxOfThree);
    }
}


