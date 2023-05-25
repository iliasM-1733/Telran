import java.util.Scanner;

public class Chetnoe {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово :");
        String firstWord = scanner.nextLine();
        System.out.println("Введите второе слово :");
        String secondWord = scanner.nextLine();

        String total = returnNewWord(firstWord, secondWord);
        System.out.println("Итог :" + total);

    }

    static String returnNewWord(String strOne, String strTwo) {

        int firstWordLength = strOne.length();
        int middleOfFirstWord = firstWordLength / 2;
        String firstHalf = strOne.substring(0, middleOfFirstWord);
        int secondWordLength = strTwo.length();
        int middleOfSecondWord = secondWordLength / 2;
        String secondHalf = strTwo.substring(middleOfSecondWord, strTwo.length());
        String resultstr = firstHalf + secondHalf;

        return resultstr;


    }


}
