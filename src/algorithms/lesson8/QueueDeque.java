package algorithms.lesson8;

import java.util.*;

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
        System.out.println(queue);

        // remove  и poll похожие методы, но если элементов больше нет, то remove выбросит exception
        //removeElem(queue);
        pollElement(queue);
        System.out.println("queue.poll() = " + queue.poll());
        fillQueue(queue);

        // element и peek, показывает кто в очереди первый, но element выбросит исключение
        // queue.clear();
        System.out.println(queue.element());
        System.out.println("queue.peek() = " + queue.peek());


        queue.remove();
        System.out.println(queue);
        queue.remove("Maksim");
        System.out.println(queue);


        System.out.println("======= PriorityQueue ========");
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(8);
        priorityQueue.add(14);
        priorityQueue.add(0);
        priorityQueue.add(0);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());

        ArrayList<Integer> list = new ArrayList<>(priorityQueue); // для итерации

        priorityQueue.add(23);
        priorityQueue.add(24);
        priorityQueue.add(25);
        for(int i : priorityQueue) {
            System.out.print(i + " ");
        }

        // можем получить доступ как к первому, так и к последнему элементу
        System.out.println("\n======= DEQUE ========");
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.add(9);
        deque.addLast(10);
        deque.addFirst(17);
        System.out.println(deque);

        deque.offerFirst(33);
        deque.offerLast(15);
        deque.offer(11);
        System.out.println(deque);

        System.out.println(deque.peekFirst());
        System.out.println(deque.peek());
        System.out.println(deque.peekLast());

        System.out.println(deque);
        System.out.println(deque.poll());
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque);

        System.out.println(deque.removeLast());
        System.out.println(deque);

        Deque<Integer> listAsDeque = new LinkedList<>();

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

