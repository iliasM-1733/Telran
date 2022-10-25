package algorithms.lesson8;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(23);
        stack.push(3);
        stack.push(6);
        stack.push(76);
        stack.push(90);
        stack.push(12);
        stack.push(43);

        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.capacity());
        System.out.println(stack.search(12));
        System.out.println(stack.search(120));
        System.out.println("stack.peek(): " + stack.peek());
        System.out.println(stack);
        System.out.println("stack.pop(): " + stack.pop());
        System.out.println(stack);

        stack.remove((Integer) 6);
        System.out.println("stack.remove((Integer) 6)" + stack);


    }
}
