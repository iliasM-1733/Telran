package basiс;

// methods and encapsulation
// LocalDate
// inheritance

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class HW {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String string = "MXLIX"; // 1049
        System.out.println(romanToDecimal(string));
    } //

    private static int romanToDecimal(String romanNumeral) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        map.put('I', 1);
//        map.put('V', 5);
//        map.put('X', 10);
//        map.put('L', 50);
//        map.put('C', 100);
//        map.put('D', 500);
//        map.put('M', 100);


        // "VII"

        int end = romanNumeral.length()- 1; // 2
        char[] arr = romanNumeral.toCharArray(); // {'V', 'I', 'I'}
        int current;
        int result = mapping(romanNumeral.charAt(end)); // charAt(2) = 'I' -> 1


        for (int i = end - 1; i >= 0; i--) { //цикл идет справа на лево
            current = mapping(romanNumeral.charAt(i)); // charAt(0) = 'V' -> 5
            int prev = mapping(romanNumeral.charAt(i + 1));


            if (current >= prev) { //сравниваем больше или меньше число числа которое слева, если меньше то вычитаем
                result = result + current; // 7
            } else {
                result -= current;
            }

        }
        return result; // 7
    }


    static int mapping(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}

