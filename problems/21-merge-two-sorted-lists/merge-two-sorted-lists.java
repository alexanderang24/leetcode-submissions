/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode();
        ListNode head = merged;
        // if (list1.val < list2.val) {
        //     // System.out.println("use1");
        //     merged = list1;
        //     list1 = list1.next;
        //     head = merged;
        // } else if (list2.val < list1.val) {
        //     // System.out.println("use2");
        //     merged = list2;
        //     list2 = list2.next;
        //     head = merged;
        // } else {
        //     // System.out.println("same");
        //     merged = list1;
        //     list1 = list1.next;
        //     head = merged;

        //     merged.next = list2;
        //     list2 = list2.next;

        //     merged = merged.next;
        // }

        while (list1 != null && list2 != null) {
            // System.out.println("processing 1 | 2: " + list1.val + " | " + list2.val);
            if (list1.val < list2.val) {
                // System.out.println("use1");
                merged.next = list1;
                list1 = list1.next;
            } else if (list2.val < list1.val) {
                // System.out.println("use2");
                merged.next = list2;
                list2 = list2.next;
            } else {
                // System.out.println("same");
                merged.next = list1;
                list1 = list1.next;
                merged = merged.next;

                merged.next = list2;
                list2 = list2.next;
            }
            merged = merged.next;
        }

        if (list1 != null) {
            // System.out.println("add remaining 1");
            merged.next = list1;
        } else if (list2 != null) {
            // System.out.println("add remaining 2");
            merged.next = list2;
        }
        return head.next;
    }
}