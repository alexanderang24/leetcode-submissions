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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = new ListNode();
        ListNode head = l;

        int extra = 0;
        while(l1 != null || l2 != null || extra != 0) {
            int sum = 0;
            if (l1 != null && l2 != null) {
                sum = l1.val + l2.val + extra;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                sum = l1.val + extra;
                l1 = l1.next;
            } else if (l2 != null) {
                sum = l2.val + extra;
                l2 = l2.next;
            } else { // extra not 0
                sum = extra;
            }

            extra = sum / 10;
            l.next = new ListNode(sum % 10);
            l = l.next;
        }
        return head.next;
    }
}