package basic.homeworks.decisions.hw8for;

/**
 * Написать метод int romanToDecimal(String romanNumeral), который ковертирует римское числов его десятичное представление.
 * Число приходит в виде правильной строки "XV" - 15, "XXXIV" - 34, "XCVI" - 94
 */
public class Task6 {
    public static void main(String[] args) {
        String romanNumeral = "XXXIV";
        int decimalValue = romanToDecimal(romanNumeral);
        System.out.println("Римское число " + romanNumeral + " в десятичной системе: " + decimalValue);
    }

    /**
     * В этой версии кода был добавлен новый метод getRomanValue(), который принимает символ римской цифры и
     * возвращает соответствующее числовое значение. Метод getRomanValue() использует конструкцию switch для
     * определения числового значения на основе символа.
     *
     * Теперь в методе romanToDecimal() мы вызываем getRomanValue() для получения числовых значений текущего и
     * следующего символов, а остальная логика остается неизменной. Это позволяет вынести маппинг символов в
     * отдельный метод и упрощает чтение и поддержку кода.
     */

    public static int romanToDecimal(String romanNumeral) {
        int decimalValue = 0;
        for (int i = 0; i < romanNumeral.length(); i++) {
            char currentSymbol = romanNumeral.charAt(i);
            int currentValue = getRomanValue(currentSymbol);

            if (i < romanNumeral.length() - 1) {
                char nextSymbol = romanNumeral.charAt(i + 1);
                int nextValue = getRomanValue(nextSymbol);

                if (currentValue < nextValue) {
                    decimalValue -= currentValue;
                } else {
                    decimalValue += currentValue;
                }
            } else {
                decimalValue += currentValue;
            }
        }

        return decimalValue;
    }

    public static int getRomanValue(char symbol) {
        int value;

        switch (symbol) {
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
            default:
                throw new IllegalArgumentException("Неверный символ: " + symbol);
        }
        return value;
    }
}
