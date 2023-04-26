package basiс;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class HW {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter count of boxes please:");
        int countOfBoxes = 3;
        System.out.println("Enter weight of each single box in kg:");
        double weightOfSingleBox = 1.3;
        System.out.println("Enter please full name of recipient:");
        //scanner.nextLine(); // stub
        String nameOfRecipient = "John Smith";
        System.out.println("Enter please address of recipient:");
        String addressOfRecipient = "White str 31";

        double totalParcelWeight = countOfBoxes * weightOfSingleBox;

        String label =
                createLabel(nameOfRecipient, addressOfRecipient, totalParcelWeight);

        System.out.println(label);
    }


    static String createLabel(String name, String address, double weight) {
        String ticket = "\nRecipient name: \"" + name.toUpperCase() + "\"\n"
                + "Recipient address: \"" + address.toUpperCase() + "\"\n"
                + "Parcel weight: " + weight + " kg";

        return ticket;
    }





}

