package com.sun.algorithm.twoListAdd;

public class TwoListAdd {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int nextVal = 0;
        ListNode back = new ListNode();
        ListNode current = back;
        int next = 0;
        while (l1.next != null) {
            int sum = (l1.val + l2.val + nextVal) % 10;
            nextVal = (l1.val + l2.val + nextVal) / 10;
            current.val = sum;
            current.next = new ListNode();
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        return back;

    }

}
