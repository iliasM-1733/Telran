package basic;


import java.util.Scanner;

/**
 * если условие в скобках выполняется (true), то выполнится команда_1,
 * в противном случае - команда_2
 * if (условие 1) {
 *      команда_1;
 *   }
 * else if (условие 2){
 *      команда_2;
 *    }
 * else if (условие 3){
 *       команда_3;
 *  }
 *  else {
 *      команда_4;
 *  }
 */
public class LessonSixIfElse {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
//        tryIfElseStatement(true);
//        tryIfElseStatement(false);
//
//        tryElseIfStatement(-10);
//        tryElseIfStatement(-3);
//
//        ifElseWithString("sunday");
//        ifElseWithString("Friday");
//        ifElseWithString("Monday");
//        ifElseWithString("");
//
//        isSick(true, true);
//        isSick(false, true);
//        isSick(true, false);
//        isSick(false, false);
//
//        hikingCondition(true, true, true);
//        hikingCondition(true, false, true);
//        hikingCondition(true, true, false);
//        hikingCondition(false, true, true);
//
//        simpleChatBot();

//         shoping(false, true, false, true, false, true);



    }

    static void tryIfElseStatement(boolean bool) {
        if (bool) {
            System.out.println("i print it from \"if\" statement");
        } else {
            System.out.println("i print it from \"else\" statement");
        }
    }

    static void tryElseIfStatement(long x) { // x = -102
        boolean isEven = false;
        boolean isMultipliedToTen = false;

        if (x > 0) {
            System.out.println("i print it from \"if\" statement. That means, that x is positive number.");
        } else if (x % 2 == 0){
            System.out.println("x is even number");
            isEven = true;
            // System.out.println("i print it from \"else if\" statement. That means, that x is equals to zero");
        } else if (x % 10 == 0) {
            System.out.println("x is multiple to 10");
            isMultipliedToTen = true;
            // System.out.println("i print it from \"else\" statement. That means, that x is negative number.");
        } else if (isEven && isMultipliedToTen) {
            System.out.println("perhaps x equals to zero");
        } else {
            System.out.println("x is negative odd number");
        }
    }

    static void ifElseWithString(String dayOfTheWeek) {
        if (dayOfTheWeek.equals("Sunday") || dayOfTheWeek.equals("Saturday")) {
            System.out.println("today is weekend,enjoy");
        } else if (dayOfTheWeek.equals("Friday")) {
            System.out.println("today is short day and tomorrow is weekend! Happy Friday!");
        } else {
            System.out.println("today is working day! Just focus on daily task;)");
        }
    }

    static void hikingCondition(boolean isWeekend, boolean isRainy, boolean isIamFree) {
        if(isIamFree && !isRainy && isWeekend) {
            System.out.println("let's go to the hiking!");
        } else {
            if (isWeekend && !isRainy) {
                System.out.println("I am busy today, sorry");
            } else if (isWeekend && isIamFree) {
                System.out.println("It's rainy today");
            } else {
                System.out.println("Let's go on a weekend, i'm working today");
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
        if (2023 - yearOfBirth < 18) {
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
                System.out.println("Enter your temp in C:");
                double temperature = SCANNER.nextDouble();
                if(temperature > 43) {
                    System.out.println("Call emergency!");
                } else if (temperature <= 43 && temperature > 39 ) {
                    System.out.println("call doc");
                } else  {
                    System.out.println("try to eat medicine");
                }
            } else {
                System.out.println("drink more hot tea with lemon and honey!");
            }
        } else {
            System.out.println("Everything looks fine! You are in a good condition!");
        }
    }


    static void shoping(boolean havePotato, boolean haveChicken, boolean haveCandy, boolean haveCake,
                        boolean havePotatoCake, boolean haveCookie) {
        if(haveChicken) {
            System.out.println("я купил курицу");
        }


        if (havePotato) {
            System.out.println("я купил картошку");
        } else {
            System.out.println("я купил макароны");
        }



        if(haveCandy) {
            System.out.println("мне на всю сдачу!");
        } else if (haveCake) {

            if (havePotatoCake) {
                System.out.println("дайте три штуки");
            } else {
                System.out.println("дайте тогда заварную трубочку");
            }

        } else if (haveCookie){
            System.out.println("тогда мне печенье к чаю");
        } else {
            System.out.println("тогда палочку лакрицы");
        }
    }
}
