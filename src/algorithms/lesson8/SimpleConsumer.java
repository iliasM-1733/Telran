package algorithms.lesson8;

public class SimpleConsumer {
    private SimpleManager manager;

    public SimpleConsumer(SimpleManager manager) {
        this.manager = manager;
    }

    public void listenQueue() throws InterruptedException {
        while (true) {
            Task task = manager.getTaskFromQueue();
            if (task != null) {
                System.out.println("Queue: " + task.getTaskName());
            }
            Thread.sleep(100);
        }
    }

    public void listenStack() throws InterruptedException {
        while (true) {
            Task task = manager.getTaskFromStack();
            if (task != null) {
                System.out.println("Stack: " + task.getTaskName());
            }
        }
    }

}
