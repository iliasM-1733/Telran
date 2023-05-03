package algorithms.lesson8;

import java.util.Stack;

public class Starter {
    public static void main(String[] args) throws InterruptedException {
        SimpleManager manager = new SimpleManager();

        SimpleConsumer consumer = new SimpleConsumer(manager);
        SimpleTaskCreator taskCreator = new SimpleTaskCreator(manager);

        // создаем поток для запуска SimpleConsumer.listenQueue()
        Thread consumerThread1 = new Thread(() -> {
            try {
                consumer.listenQueue();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        consumerThread1.start();


        // создаем поток для запуска SimpleConsumer.listenStack()
        Thread consumerThread2 = new Thread(() -> {
            try {
                consumer.listenStack();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        consumerThread2.start();

        // создаем поток для запуска SimpleTaskCreator.setTasksToQueue()
        Thread consumerCreator1 = new Thread(() -> {
            try {
                taskCreator.setTasksToQueue(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        consumerCreator1.start();

        // создаем поток для запуска SimpleTaskCreator.setTasksToStack(), запускаем его не сразу, а через 3 сек
        Thread consumerCreator2 = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            taskCreator.setTasksToStack(10);
        });
        consumerCreator2.start();
    }
}