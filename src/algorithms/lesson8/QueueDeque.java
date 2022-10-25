package algorithms.lesson8;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDeque {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(4);
        // add и offer похожие методы, но если очередь ограничена, то add выбросит exception
        queue.add("Il'yas");
        queue.add("Maria");
        queue.add("Ivan");
        queue.offer("Lidia");
        queue.offer("Maksim");
        queue.offer("Tim");

        //
        System.out.println(queue);

        // remove  и poll похожие методы, но если элементов больше нет, то remove выбросит exception
        //removeElem(queue);
        pollElement(queue);
        fillQueue(queue);

        // element и peek, показывает кто в очереди первый, но element выбросит исключение
        System.out.println(queue.element());


        System.out.println(queue);
        queue.remove("Lidia");
        System.out.println(queue);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(8);
        priorityQueue.add(14);
        priorityQueue.add(0);
        priorityQueue.add(0);
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());


        // можем получить доступ как к первому, так и к последнему элементу
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.add(9);
        deque.addLast(10);
        deque.addFirst(17);
        System.out.println(deque);





    }



    static void removeElem(Queue queue) {
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
    }


    static void pollElement(Queue queue) {
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
    }

    static void fillQueue(Queue queue) {
        queue.add("Il'yas");
        queue.add("Maria");
        queue.add("Ivan");
        queue.offer("Lidia");
        queue.offer("Maksim");
        queue.offer("Tim");
    }
}
