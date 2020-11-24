package com.sun.algorithm.twoListAdd;

import com.sun.algorithm.twoNumSum.TwoNumSum;

public class TestMain {
    public static void main(String[] args) {
        TwoListAdd add = new TwoListAdd();
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, new ListNode())));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode())));
        add.addTwoNumbers(l1, l2);
    }
}
