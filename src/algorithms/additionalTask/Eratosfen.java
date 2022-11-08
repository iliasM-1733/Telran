package algorithms.additionalTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eratosfen {
    public static void main(String[] args) {
        RandomGenerator goodGenerator = new RandomGenerator(317, 51, 128, 1);

        for (int i = 0; i < 100; i++) {
            System.out.println(goodGenerator.get());
        }
    }

    public static List<Integer> eratosfenPrimes(int max) {
         boolean[] isPrime = new boolean[max];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i < max ; i++) {
               if(isPrime[i]) {
                   for (int j  = 2 * i; j < max; j += i) {
                       isPrime[j] = false;
                   }
               }
        }
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i < max; i++) {
            if(isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return true;
        }
        for (int i = 2; i * i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrimeOptimized(int number) {
        if (number < 2) {
            return false;
        }
        if (number % 2 == 0) {
            return number == 2;
        }
        if (number % 3 == 0) {
            return number == 3;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    private static class RandomGenerator {
        //Xnew = (a * Xold + c) mod m
        // m >=2
        // a   0 <= a <= m
        // X0  0 <= X0 <= m
        private final int a;
        private final int c;
        private final int m;
        private int xlast;

        public RandomGenerator(int a, int c, int m, int xlast) {
            this.a = a;
            this.c = c;
            this.m = m;
            this.xlast = xlast;
        }

        int get() {
            xlast = (a * xlast + c) % m;
            return Math.abs(xlast);
        }
    }
}
