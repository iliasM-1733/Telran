package algorithms.lesson8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SimpleManager {
    private Queue <Task> taskQueue;
    private Stack <Task> taskStack;

    public SimpleManager() {
        this.taskQueue = new LinkedList<>();
        this.taskStack = new Stack<>();
    }

    public void addTaskToQueue(Task task) {
        taskQueue.add(task);
    }

    public Task getTaskFromQueue() {
        return taskQueue.poll();
    }

    public void addTaskToStack (Task task) {
        taskStack.add(task);
    }

    public Task getTaskFromStack() {
        if (!taskStack.isEmpty())
            return taskStack.pop();
        return null;
    }
}
