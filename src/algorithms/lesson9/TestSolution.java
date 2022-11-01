package algorithms.lesson9;

public class TestSolution {
    public static void main(String[] args) {
        ListNode listNode = fillLinkedList();
        printListNode(listNode);
        //listNode = Solution.reverseBetween(listNode, 0, 7);
        //printListNode(listNode);

        listNode = fillLinkedList();
        listNode = Solution.reverseBetween(listNode, 2, 5);
        printListNode(listNode);
    }


    static void printListNode(ListNode head) {
        ListNode cur = head.getNext();
        while (cur != null) {
            System.out.print(head.getVal() + " ");
            head = cur;
            cur = head.getNext();
        }
        if (head.getNext() == null) {
            System.out.print(head.getVal() + " ");
        }
        System.out.println();
    }

    static ListNode fillLinkedList() {
        ListNode head = new ListNode(0);
        head.setNext(new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,
                                                new ListNode(6)))))));
        return head;
    }
}
