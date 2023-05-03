package algorithms.lesson8;

public class SimpleTaskCreator {
    private SimpleManager manager;

    public SimpleTaskCreator(SimpleManager manager) {
        this.manager = manager;
    }

    public void setTasksToQueue(int tasks) throws InterruptedException {
        for (int i = 0; i < tasks; i++) {
            Task task = new Task("Task N " + i);
            Thread.sleep(10);
            manager.addTaskToQueue(task);
        }
    }

    public void setTasksToStack(int tasks) {
        for (int i = 0; i < tasks; i++) {
            Task task = new Task("Task N " + i);
            manager.addTaskToStack(task);
        }
    }
}
