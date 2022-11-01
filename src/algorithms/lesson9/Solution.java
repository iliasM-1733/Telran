package algorithms.lesson9;


// A -> B -> C -> null  reverse
// null <- A <- B <- C
// A -> B -> C -> D -> E -> F -> null  reverse(1, 3);
// A -> D -> C -> B -> E -> F -> null

public class Solution {
    public static ListNode reverseBetween(ListNode head, int m, int n) {
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