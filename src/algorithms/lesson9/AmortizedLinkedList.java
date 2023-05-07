package algorithms.lesson9;

import java.util.LinkedList;
import java.util.Queue;

public class AmortizedLinkedList {
    public static void main(String[] args) {
        int size = 100_000;
        System.out.printf("Создание массива длинной %d\n", size);
        LinkedList<Integer> list = fillArray(size);

        System.out.printf("Время на удаление всех елементов LinkedList, с конца массива %d\n",
                removeLast(list));

        list = fillArray(size);

        System.out.printf("Время на удаление всех елементов LinkedList, с начала массива %d\n",
                removeFirst(list));

        list = fillArray(size);

        System.out.printf("Время на удаление всех елементов LinkedList, с середины массива %d\n",
                removeMid(list));
    }


    static long removeLast(LinkedList list) {
        long start = System.nanoTime();

        while (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
        return System.nanoTime() - start;
    }

    static long removeFirst(LinkedList list) {
        long start = System.nanoTime();
        while (!list.isEmpty()) {
            list.remove(0);
        }
        return System.nanoTime() - start;
    }

    static long removeMid(LinkedList list) {
        long start = System.nanoTime();
        while (!list.isEmpty()) {
            list.remove(list.size() / 2);
        }
        return System.nanoTime() - start;
    }



    static LinkedList<Integer> fillArray(int size) { // 100_000
        long start = System.nanoTime();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        long totalTime = System.nanoTime() - start;
        System.out.printf("Заполнение LinkedList %d элементами заняло %d нс\n", size, totalTime);
        return list;

    }

}

//              10_000

//        Создание массива длинной 10000                                          687_792         912_209
//
//                                                                               ArrayList      LinkedList
//        Время на удаление всех елементов ArrayList, с конца массива             971_708       1_083_041
//        Время на удаление всех елементов ArrayList, с начала массива            5_090_459     400_083
//        Время на удаление всех елементов ArrayListArrayList, с середины массива 2_680_333     45_721_917

//          100_000


//                                                                                750_916         1_493_833
//                                                                                ArrayList       LinkedList
//        Время на удаление всех елементов ArrayList, с конца массива             3_629_375       4_286_500
//        Время на удаление всех елементов ArrayList, с начала массива            495_684_958     3_470_541
//        Время на удаление всех елементов ArrayListArrayList, с середины массива 238_555_916     4_323_412_791
