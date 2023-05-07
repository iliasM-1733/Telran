package basiс.homeworks.decisions.hw5boolean;

/**
 * Создайте две переменные *isWeekend* и *isRain*. Создайте переменную *canWalk*, значение которой должно быть истинным,
 * если это выходной день (isWeekend=true) и не идет дождь (isRain=false).
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(canWalk(true, true));
    }

    /**
     * 1. `boolean canWalk = isWeekend && !isRain;` – создание переменной `canWalk` и присвоение ей значения,
     * полученного в результате логической операции. Переменная `canWalk` будет содержать значение `true`, если
     * значение переменной `isWeekend` равно `true`, а значение переменной `isRain` равно `false`. Если хотя бы одно
     * из условий не выполняется, то значение переменной `canWalk` будет `false`.
     *
     * 2. `return canWalk;` – возврат значения переменной `canWalk` в качестве результата работы метода `canWalk`.
     * Если значение переменной `canWalk` равно `true`, то метод вернет `true`, иначе - `false`.
     */
    static boolean canWalk(boolean isWeekend,boolean isRain) {
        boolean canWalk = isWeekend && !isRain;
        return canWalk;
    }
}
