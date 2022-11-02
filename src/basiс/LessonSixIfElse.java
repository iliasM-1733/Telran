package basiс;


import java.util.Scanner;

/**
 * если условие в скобках выполняется (true), то выполнится команда_1, в противном случае - команда_2
 * if (условие) {
 *      команда_1;
 *   }
 * else {
 *      команда_2;
 *    }
 */
public class LessonSixIfElse {
    static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        boolean bool = true;


    }

    static void tryIfElseStatement(boolean bool) {
        if (bool) {
            System.out.println("i print it from \"if\" statement");
        } else {
            System.out.println("i print it from \"else\" statement");
        }
    }

    static void tryElseIfStatement(int x) {
        if (x > 0) {
            System.out.println("i print it from \"if\" statement. That means, that x is positive number.");
        } else if (x == 0){
            System.out.println("i print it from \"else if\" statement. That means, that x is equals to zero");
        } else {
            System.out.println("i print it from \"else\" statement. That means, that x is negative number.");
        }
    }

    static void ifElseWithString(String dayOfTheWeek) {
        if (dayOfTheWeek.equals("Sunday") || dayOfTheWeek.equals("Saturday")) {
            System.out.println("today is weekend,enjoy");
        } else if (dayOfTheWeek.equals("Monday")) {
            System.out.println("today is short day and tomorrow is weekend! Happy Friday!");
        } else {
            System.out.println("today is working day! Just focus on daily task;)");
        }
    }

    static void hikingCondition(boolean isWeekend, boolean isNotRainy, boolean isIamFree) {
        if(isIamFree && !isNotRainy && isWeekend) {
            System.out.println("let's go to the hiking!");
        } else {
            if (isWeekend && isNotRainy) {
                System.out.println("I am busy today, sorry");
            } else if (isWeekend && isIamFree) {
                System.out.println("It's rainy today");
            } else {
                System.out.println("Let's gon on a weekend, i'm working today");
            }
        }
    }


    static void simpleChatBot() {
        String name;
        int yearOfBirth;


        System.out.println("hello! What is your name?");
        name = SCANNER.nextLine();
        System.out.printf("Hi, %s! Nice to meet you! What is the year of your birth?\n", name);
        yearOfBirth = Integer.parseInt(SCANNER.nextLine());
        if (2022 - yearOfBirth < 18) {
            System.out.println("I'm sorry, I can't give you access to the entire music library, " +
                    "but nevertheless I still have a huge number of songs that you can listen to!");
        } else {
            System.out.println("You can choose any track from those that I have");
        }
    }

    static void isSick(boolean gotTemperature, boolean haveSoreThroat) {
        if (gotTemperature && haveSoreThroat) {
            System.out.println("it's look serious, better to call doc");
        } else if (gotTemperature || haveSoreThroat) {
            if (gotTemperature) {
                System.out.println("try to eat medicine");
            } else {
                System.out.println("drink more hot tea with lemon and honey!");
            }
        } else {
            System.out.println("Everything looks fine! You are in a good condition!");
        }
    }
}
