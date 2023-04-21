package algorithms.additionalTask;

import java.util.HashMap;
import java.util.Map;

public class RomanDigit {

    // Тестовый пример
    public static void main(String[] args) {

        //System.out.println(romanToDecimal("XVI"));
        System.out.println(romanToDecimal("")); // 24
    }

    // Метод для конвертации римской цифры в десятичное число
    //
    public static int romanToDecimal(String romanNumeral) {

        // Создаем хэш-таблицу для хранения соответствия римских цифр и их значения в десятичной системе счисления
        Map<Character, Integer> romanToDecimalMap = new HashMap<Character, Integer>();
        romanToDecimalMap.put('I', 1);
        romanToDecimalMap.put('V', 5);
        romanToDecimalMap.put('X', 10);
        romanToDecimalMap.put('L', 50);
        romanToDecimalMap.put('C', 100);
        romanToDecimalMap.put('D', 500);
        romanToDecimalMap.put('M', 1000);

        int decimalNumber = 0;
        int previousValue = 0;

        // Проходим по римской цифре справа налево
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {

            int currentValue = romanToDecimalMap.get(romanNumeral.charAt(i));

            // Если текущее значение меньше предыдущего, то вычитаем его из суммы
            if (currentValue < previousValue) {
                decimalNumber -= currentValue;
            }

            // Иначе добавляем его к сумме
            else {
                decimalNumber += currentValue;
            }

            previousValue = currentValue;
        }

        return decimalNumber;
    }
}
