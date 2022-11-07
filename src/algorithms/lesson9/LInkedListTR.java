package algorithms.lesson9;

// https://leetcode.com/problems/reverse-linked-list-ii/solution/
// https://leetcode.com/problems/reverse-linked-list/

import java.util.*;

public class LInkedListTR {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");

        Stack<String> stack = new Stack<>();
        stack.push("Zero");


        LinkedList <String> list = new LinkedList<>(stack);
        list.addAll(queue);
        System.out.println(list);

        list.add("Four");
        list.add("Five");
        list.add("Six");
        System.out.println(list);


        list.clear();
        list = fillList();
        System.out.println(list.containsAll(queue));

        System.out.println("LinkedList: " + list);

        ListIterator list_Iter = list.listIterator(4);

        System.out.println("The list is as follows: ");
        while(list_Iter.hasNext()){
            System.out.println(list_Iter.next());
        }

        // peek(): этот метод извлекает, но не удаляет заголовок (первый элемент) этого списка.
        System.out.println("list.peek() " + list.peek());
        list.peekFirst();
        list.peekLast();
        System.out.println(list);

        // offer(E e): этот метод добавляет указанный элемент в хвост (последний элемент) этого списка.
        list.offer("Seven");
        list.offerLast("Eight");
        list.offerFirst("zero");
        System.out.println(list);

        // get(int index): этот метод возвращает элемент в указанной позиции в этом списке.
        list.get(0);
        list.getFirst();
        list.getLast();

        // indexOf(Object o): этот метод возвращает индекс первого появления указанного элемента в этом списке или -1,
        // если этот список не содержит элемента.
        // lastIndexOf(Object o): этот метод возвращает индекс последнего появления указанного элемента в этом списке
        // или -1, если этот список не содержит элемента.
        list.indexOf("zero");
        list.lastIndexOf("One");

        // poll() : этот метод извлекает и удаляет заголовок (первый элемент) этого списка.
        list.poll();
        list.pollFirst();
        list.pollLast();
        System.out.println(list);

        // remove(), removeFirst() - используется для удаления первого элемента из связанного списка. Эта функция также возвращает первый элемент после его удаления.
        list.remove();
        list.remove(2);
        list.remove("Five");
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }


    static LinkedList<String> fillList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        return list;
    }


    static void compareArrayAndLinkedLists() {
        ArrayList<Integer> temp = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            temp.add(i);
        }


        ArrayList<Integer> arrayList = new ArrayList<>(temp);
        LinkedList<Integer> linkedList = new LinkedList<>(temp);

        long arrayStart = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            arrayList.add(0, i);
        }
        long arrayResult = System.currentTimeMillis() - arrayStart;


        long linkedStart = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            linkedList.add(0, i);
        }
        long linkedResult = System.currentTimeMillis() - linkedStart;


        System.out.printf("Time for adding 1m elem to ArrayList = %d,\nTime for adding 1m elem to LinkedList = %d\n", arrayResult, linkedResult);
        if (arrayResult < linkedResult) {
            System.out.printf("Adding 1m elem to the middle of ArrayList faster, than adding 1m elem to the middle of LinkedList faster on %d", arrayResult - linkedResult);
        } else {
            System.out.printf("Adding 1m elem to the middle of LinkedList faster, than adding 1m elem to the middle of ArrayList faster on %d", linkedResult - arrayResult);
        }

    }
}
