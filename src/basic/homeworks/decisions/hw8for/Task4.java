package basic.homeworks.decisions.hw8for;

/**
 * Напишите программу, которая принимает число вычисляет сумму всех простых чисел, которые меньше этого числа
 */
public class Task4 {
    public static void main(String[] args) {
        countPrimes(100);
    }

    /**
     * В данном коде мы сначала задаем число number, для которого мы хотим найти сумму простых чисел, меньших этого
     * числа. Затем мы инициализируем переменную sum с нулевым значением.
     *
     * Затем мы используем цикл for для перебора чисел от 2 до number - 1. Для каждого числа мы вызываем метод
     * isPrime(), который проверяет, является ли число простым. Если число является простым, мы добавляем его к
     * переменной sum.
     *
     * В конце программы мы выводим результат - сумму всех простых чисел, меньших заданного числа.
     */
    public static void countPrimes(int number) {
        int sum = 0;

        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println("Сумма простых чисел меньше " + number + " равна: " + sum);
    }

    // Метод для проверки, является ли число простым
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

