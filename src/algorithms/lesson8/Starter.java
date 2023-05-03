package algorithms.lesson8;

import java.util.Stack;

public class Starter {
    public static void main(String[] args) throws InterruptedException {
        SimpleManager manager = new SimpleManager();

        SimpleTaskCreator creator = new SimpleTaskCreator(manager);
        SimpleConsumer consumer = new SimpleConsumer(manager);

        creator.setTasksToQueue(5);
        consumer.listenQueue();
        creator.setTasksToQueue(10);
        consumer.listenQueue();


    }
}