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
        merged.next = list1 != null ? list1 : list2;
        return head.next;
    }
}