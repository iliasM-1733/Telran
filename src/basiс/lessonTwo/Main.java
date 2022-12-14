package basiс.lessonTwo;


/**

 THIS
 Ключевое this слово относится к текущему объекту в методе или конструкторе.

 в восьмеричной основание 8
 8->10
 333 = 3*8^2+3*8^1+3*8^0 = 3*64+3*8+3*1 = 192+24+3 = 219

 10->8
 219 = 219/8 = 27 и 219%8 = 3, 27/8 = 3 27%8 = 3 -> (3*8+3)*8+3
 219 = 219/64 = 3 отс 27/8 = 3 ост 3/1 = 3 сот 0

 16->10
 333 = 3*16^2+3*16^1+3*16^0 = 3*256+3*16+3*1 = 768+48+3 = 819

 10->16
 819 = 819/16=51 (819-816) ост 3, 51/16=3 (51-48) ост 3

 10->16

 2->10
 отличается от десятичной тем, что в ней вместо 10 в степень возводится двойка, например, число двоичное число 101101 можно прочитать так:

 101101= 1*2^5 + 0*2^4 + 1*2^3 + 1*2^2 + 0*2^1 + 1*2^0

 = 32 + 0 + 8 + 4 + 0 + 1 = 45 (это уже в десятичной системе)

 10->2
 124 и поделим его на основание двоичной системы, то есть число 2.
 */

public class Main {
    public static void main(String[] args) {
        Human humanOne = new Human();
        Human humanTwo = new Human();
        Human humanThree = new Human();
        Human humanFour = new Human();

        humanOne.name = "Alex";
        humanTwo.name = "Bill";

        //показывает общее количество людей
        System.out.println(Human.countOfPeople);

        humanThree.name = "Chuck";
        humanFour.name = "Dilan";

        humanOne.age = 20;
        humanTwo.age = 30;
        humanThree.age = 40;
        humanFour.age = 50;

        System.out.println(humanOne.toString());
        System.out.println(humanTwo.toString());
        System.out.println(humanThree.toString());
        System.out.println(humanFour.toString());
    }
}
