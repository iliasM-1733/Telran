package algorithms.lesson9;

import java.util.LinkedList;

public class AmortizedLinkedList {
    public static void main(String[] args) {
        int size = 10_000;
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



    static LinkedList<Integer> fillArray(int size) { // 10_000
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        return list;
    }

}
