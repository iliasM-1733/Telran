package algorithms;

import java.util.*;

public class Temp {
    private static int[] data; // хранит отсортированные данные


    public static void main(String[] args) {
        TreeMap <String, String>map = new TreeMap();


    }


// 1, 2, 3, 4, 8, 10, 20

    static Node balanceTree(int[] data) {
        Node root = new Node();
        if (!isSorted(data))
            Arrays.sort(data);

        int mid = -1;
        int head = 0;
        int tail = data.length - 1;


        // array.length > 1
        if (head < tail) {
            root.nodeData = data[mid];
            root.left = balanceTree(Arrays.copyOfRange(data, head, mid)); // 1, 2, 3
            root.right = balanceTree(Arrays.copyOfRange(data, mid + 1, tail)); // 8, 10, 20
        } else {
            return new Node(data[mid]);
        }
        //...

        return root;
    }


    static boolean isSorted(int[] data) {
        return false;
    }

    static class Node {
        int nodeData;
        Node left;
        Node right;

        Node parent;
        public Node() {
        }

        public Node(int nodeData) {
            this.nodeData = nodeData;
        }

        public Node(Node left, Node right) {
            this.left = left;
            this.right = right;
        }

        public int getNodeData() {
            return nodeData;
        }

        public void setNodeData(int nodeData) {
            this.nodeData = nodeData;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

}
