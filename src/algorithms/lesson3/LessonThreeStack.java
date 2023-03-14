package algorithms.lesson3;

import java.util.Stack;

/**
 * Java Collection framework предоставляет класс Stack, который моделирует и реализует структуру данных Stack .
 * Класс основан на основном принципе «последний пришел – первый ушел» (last-in-first-out - LIFO). В дополнение к
 * основным операциям push и pop класс предоставляет еще три метода: empty, search и peek. Можно также сказать,
 * что класс расширяет Vector и рассматривает класс как стек с пятью упомянутыми функциями. Класс также можно назвать
 * подклассом Vector.
 */
public class LessonThreeStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> newStack = new Stack<>();
        stack = fillStack(stack, 5);
        printStack(stack);
        printStack(stack);
        peekElement(stack);
        popElement(stack);
        fillStack(stack, 5);
        printStack(stack);

        //определяет, существует ли объект в стеке. Если элемент найден, Он возвращает позицию элемента с вершины стека.
        // В противном случае он возвращает -1.
        System.out.println(stack.search(4));



        stack.clear();
        printStack(stack);
        stack.addAll(fillStack(newStack, 10));
        printStack(stack);
        stack.addAll(4, newStack);
        printStack(stack);

        // capacity() - Возвращает текущую емкость
        System.out.println(stack.capacity());

        //trimToSize() - Обрезает емкость этого стека до текущего размера.
        stack.trimToSize();



        System.out.println(stack.capacity());
        printStack(stack);
    }

    // push(element) - Помещает элемент на вершину стека.
    private static Stack<Integer> fillStack(Stack<Integer> stack, int x) {
        for (int i = 0; i <= x; i++) {
            stack.push(i);
        }
        return stack;
    }

    // get(int index) - Возвращает элемент в указанной позиции в этом Stack.
    private static void printStack(Stack<Integer> stack) {
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }

    private static void peekElement(Stack<Integer> stack) {
        for(int i = 0; i < stack.size(); i++) {
            System.out.print(stack.peek() + " ");
        }
        System.out.println();
    }


    private static void popElement(Stack<Integer> stack) {
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
