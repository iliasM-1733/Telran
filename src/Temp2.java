import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Temp2 {

    public static void main(String[] args) {
 //       ArrayList arrayList = new ArrayList(); // @link546  [null, null, ..., null]

        Object[] arr = new Object[10]; // @link213  [null, null, ..., null]

        List<String> linkedList = new LinkedList<>();
        linkedList =  doIt(linkedList);

        List<String> arrayList = new ArrayList<>(10_001);
        arrayList = doIt(arrayList);


        System.out.println("Iteretion of ArrayList: " + iterate(arrayList));
        System.out.println("Iteretion of LinkedList: " + iterate(linkedList));

        System.out.println();
        System.out.println("Iteretion of ArrayList: " + iterate(arrayList));
        System.out.println("Iteretion of LinkedList: " + iterate(linkedList));


        // int[]
        // [1, 2, 3, 4, 5, 0, 0, 0, 0, 0] // set element
        // set(2, 22) - > [1, 2, 22, 4, 5, 0, 0, 0, 0, 0]
        // set(8, 40) - > [1, 2, 22, 4, 5, 0, 0, 0, 40, 0]

        // add - втавляет эелемент, если ячейка занята, то двигает все на 1 вправо
        // [1, 2, 3, 4, 5, 0, 0, 0, 0, 0]
        // add(6) -> [1, 2, 3, 4, 5, 6, 0, 0, 0, 0]  - const
        // add(3, 15) -> [1, 2, 3, 15, 4, 5, 6, 0, 0, 0]
        // [1, 2, 3, 4, 5, 6, 0, 0, 0, 0] ->[1, 2, 3, 0, 4, 5, 6, 0, 0, 0]
        // add(0, 33) -> [33, 1, 2, 3, 4, 5, 6, 0, 0, 0]

        // (1 + n/2  n) / 3 -> (n n/2) / 3 -> 3n / 6 -> n / 2



        // [1, 2, 3, 4, 5, 0, 0, 0, 0, 0]
        // add(6) -> [1, 2, 3, 4, 5, 6, 0, 0, 0, 0]
        // add(7) -> [1, 2, 3, 4, 5, 6, 7, 0, 0, 0]
        // add(8) -> [1, 2, 3, 4, 5, 6, 7, 8, 0, 0]
        // add(9) -> [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
        // add(10) -> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        // add(11)
        //              [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        // new int[] -> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, 0]
        // arr= new int[] -> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0,..., 0, 0] // size = 20

        // arr link was @link213
        // arr link mow @link6897
        // arr [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 0, 0, 0, 0]
        // add(12) -> const
        // add(13) -> const
        // add(14) -> const
        // add(15) -> const

        // ((10 * const) + (10 * grow size) + (10 * const)) / 20 -> 30 / 20 -> 1.5
    }


    static List<String> doIt(List<String> list) {
        Random random = new Random();

        for (int i = 0; i < 10_000; i++) {
            byte[] bytes = new byte[5];
            random.nextBytes(bytes);

            String temp = new String(bytes, 128);
            list.add(temp);
        }

        return list;
    }


    static long iterate(List<String> list) {
        long start = System.nanoTime();
        list.stream()
                .filter(i -> i.contains("s"))
                .collect(Collectors.toList());
        long end = System.nanoTime() - start;
        return end;
    }


}
