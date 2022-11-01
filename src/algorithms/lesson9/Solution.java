package algorithms.lesson9;

public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // Пустой list
        if (head == null) {
            return null;
        }

        // Перемещайте два указателя до тех пор, пока они не достигнут нужной начальной точки
        // в листе
        ListNode cur = head, prev = null;
        while (m > 1) {
            prev = cur;
            cur = cur.next;
            m--;
            n--;
        }

        // Два указателя, которые зафиксируют окончательные соединения.
        ListNode con = prev, tail = cur;

        // Итеративно меняйте местами узлы, пока n не станет 0.
        ListNode third = null;
        while (n > 0) {
            third = cur.next;
            cur.next = prev;
            prev = cur;
            cur = third;
            n--;
        }

        // Adjust the final connections as explained in the algorithm
        if (con != null) {
            con.next = prev;
        } else {
            head = prev;
        }

        tail.next = cur;
        return head;
    }
}