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
        System.out.println("stack.pop(): " + stack.pop());
        System.out.println(stack);
        System.out.println(stack.get(0)); // возвращает элемент по индексу

        stack.remove((Integer) 6); // удаляет элемент из стека по его значению
        System.out.println("stack.remove((Integer) 6) " + stack);


        System.out.println(getMin(stack));
        System.out.println(stack);
        stack.clear(); // очистит
    }


    static int getMin(Stack<Integer> temp) {
        int min = temp.get(0);
        for(int i = 1; i < temp.size(); i++) {
            if (min > temp.get(i)){
                min = temp.get(i);
            }
        }

        int count = temp.search(min);
        int result = temp.peek();
        for(int i = 0; i < count; i++) {
            result = temp.pop();
        }
        return result;
    }
}
