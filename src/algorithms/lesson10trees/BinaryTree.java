package algorithms.lesson10trees;



 //

import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;

// пример бинарного дерева с рекурсивным обходом в глубину
public class BinaryTree {
    public static void main(String[] params) {
        Tree root =
                new Tree(20,
                        new Tree(7,
                                new Tree(4, null, new Tree(6)), new Tree(9)),
                        new Tree(35,
                                new Tree(31, new Tree(28), null),
                                new Tree(40, new Tree(38), new Tree(52))));

        System.out.println("Сумма дерева: " + Tree.sumWide(root));
        //System.out.println(root.sumRecursive(root));


        Set<Integer> treeSet = new TreeSet<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();


    }

    static class Tree {
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Tree(int value) {
            this.value = value;
        }

        // пример бинарного дерева с рекурсивным обходом в глубину
        public int sumRecursive(Tree root) {
            int summ = root.value;

            System.out.println(root.value);

            if (root.left != null) {
                summ += sumRecursive(root.left);
            }

            if (root.right != null) {
                summ += sumRecursive(root.right);
            }
            return summ;
        }

        // пример бинарного дерева с итеративным обходом в глубину
        public static int sumDeep(Tree root) {
            Stack<Tree> stack = new Stack<>();
            stack.push(root);

            int summ = 0;

            while (!stack.isEmpty()) {
                Tree node = stack.pop();

                System.out.println(node.value);

                summ = summ + node.value;

                if (node.right != null) {
                    stack.push(node.right);
                }

                if (node.left != null) {
                    stack.push(node.left);
                }
            }
            return summ;
        }

        // пример бинарного дерева с итеративным обходом в ширину
        public static int sumWide(Tree root) {
            Queue<Tree> queue = new LinkedList<>();
            queue.add(root);

            int summ = 0;

            while (!queue.isEmpty()) {
                Tree node = queue.remove();

                System.out.println(node.value);

                summ = summ + node.value;

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            return summ;
        }
    }
}