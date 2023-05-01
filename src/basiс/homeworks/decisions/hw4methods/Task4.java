package basiс.homeworks.decisions.hw4methods;


/**
 * - Напишите программу, которая подсчитает, сколько дополнительных калорий будет, если вы купите пиццу диаметром
 * 28 см вместо пиццы диаметром 24 см. Чтобы решить эту проблему, давайте предположим, что в каждом квадратном
 * сантиметре пиццы содержится 40 калорий. метод называется calorieCalculator и возвращает ЦЕЛОЕ число калорий.
 */
public class Task4 {
    // пример использования метода
    public static void main(String[] args) {
        int smallDiameter = 24; // диаметр меньшей пиццы
        int bigDiameter = 28; // диаметр большей пиццы
        int caloriesPerSquare = 40; // количество калорий на квадратный сантиметр
        int additionalCalories = calorieCalculator(smallDiameter, bigDiameter, caloriesPerSquare);
        System.out.println("При покупке большей пиццы в " + bigDiameter + " см вместо меньшей в " + smallDiameter
                + " см вы получите дополнительно " + additionalCalories + " калорий.");
    }

    /**Здесь объявляется метод calorieCalculator, который принимает три аргумента:
     * smallDiameter - диаметр меньшей пиццы в см,
     * bigDiameter - диаметр большей пиццы в см,
     * caloriesPerSquare - количество калорий на квадратный сантиметр пиццы.
     * Метод возвращает целое число - количество дополнительных калорий.
     */
    public static int calorieCalculator(int smallDiameter, int bigDiameter, int caloriesPerSquare) {
        // вычисляем площади меньшей и большей пиццы
        double smallArea = Math.PI * Math.pow(smallDiameter / 2.0, 2);
        double bigArea = Math.PI * Math.pow(bigDiameter / 2.0, 2);
        // вычисляем количество калорий в меньшей и большей пиццах
        int smallCalories = (int) (smallArea * caloriesPerSquare);
        int bigCalories = (int) (bigArea * caloriesPerSquare);
        // вычисляем количество дополнительных калорий
        int additionalCalories = bigCalories - smallCalories;
        // возвращаем результат
        return additionalCalories;
    }
}
