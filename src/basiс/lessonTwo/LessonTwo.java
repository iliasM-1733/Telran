package basiс.lessonTwo;


import java.util.Scanner;

public class LessonTwo {


//    SCANNER
//    Это самый простой способ чтения ввода в программе Java.

    public static void main(String[] args) {
        // Declare the object and initialize with
        // predefined standard input object
        Scanner scanner = new Scanner(System.in);

        // String input
        System.out.println("Enter your name please:");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Enter your age please:");
        double age = scanner.nextDouble();
        System.out.println("You was born in " + (2022 - age));
        System.out.println("enter char please");
        char c = scanner.next().charAt(0);
        System.out.println(c);


//        // Character input
//        char gender = scanner.next().charAt(0);
//
//        // Numerical data input
//        // byte, short and float can be read
//        // using similar-named functions.
//        int age = scanner.nextInt();
//        long mobileNo = scanner.nextLong();
//        double id = scanner.nextDouble();
//
//        // Print the values to check if the input was correctly obtained.
//        System.out.println("Name: "+name);
//        System.out.println("Gender: "+gender);
//        System.out.println("Age: "+age);
//        System.out.println("Mobile Number: "+mobileNo);
//        System.out.println("ID: "+id);
    }
}
