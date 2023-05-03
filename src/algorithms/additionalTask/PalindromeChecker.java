package algorithms.additionalTask;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность целых чисел: ");
        String input = scanner.nextLine();

        boolean isPalindrome = checkPalindrome(input);
        if (isPalindrome) {
            System.out.println("Эта последовательность является палиндромом");
        } else {
            System.out.println("Эта последовательность не является палиндромом");
        }
    }

    public static boolean checkPalindrome(String input) {
        Stack<Character> stack = new Stack<>();

        // кладем каждый символ строки в стек
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // сравниваем символы из стека и строки
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

