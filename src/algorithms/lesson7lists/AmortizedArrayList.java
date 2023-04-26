package algorithms.lesson7lists;

import java.util.ArrayList;

public class AmortizedArrayList {

    public static void main(String[] args) {
        int size = 10_000;
        System.out.printf("Создание массива длинной %d\n", size);
        ArrayList<Integer> list = fillArray(size);

        System.out.printf("Время на удаление всех елементов ArrayList, с конца массива %d\n",
                removeLast(list));

        list = fillArray(size);

        System.out.printf("Время на удаление всех елементов ArrayList, с начала массива %d\n",
                removeFirst(list));

        list = fillArray(size);

        System.out.printf("Время на удаление всех елементов ArrayListArrayList, с середины массива %d\n",
                removeMid(list));
    }


    static long removeLast(ArrayList list) {
        long start = System.nanoTime();

        while (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
        return System.nanoTime() - start;
    }

    static long removeFirst(ArrayList list) {
        long start = System.nanoTime();
        while (!list.isEmpty()) {
            list.remove(0);
        }
        return System.nanoTime() - start;
    }

    static long removeMid(ArrayList list) {
        long start = System.nanoTime();
        while (!list.isEmpty()) {
            list.remove(list.size() / 2);
        }
        return System.nanoTime() - start;
    }



    static ArrayList<Integer> fillArray(int size) { // 10_000
        ArrayList<Integer> list = new ArrayList<>(1_000_000);
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        list.trimToSize(); // capacity 1_000_000 -> 10_000
        return list;
    }
}


// Size - вместимость массива (.capacity()), count - количество элементов в нем (.size())
 // {} Size = 0, count = 0 -> add(22) - > {0} Size = 1, count = 0
//  {22} Size = 1, count = 1
// {1, 2, 3, 0, 0} add(0)
