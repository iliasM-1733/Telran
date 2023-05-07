package algorithms.lesson9;

public class ListNode {
    int val;
    ListNode next;


    public ListNode(int val) {
        this.val = val;
        this.next = null;

    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }


    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
