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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (odd.next != null && even.next != null) {
            if (odd.next.next != null) {
                // System.out.println("odd connecting " + odd.val + " to " + odd.next.next.val);
                odd.next = odd.next.next;
                odd = odd.next;
            }
            if (even.next.next != null) {
                // System.out.println("even connecting " + even.val + " to " + even.next.next.val);
                even.next = even.next.next;
                even = even.next;
            }
        }
        odd.next = evenHead;
        even.next = null;
        // System.out.println("connecting " + odd.val + " to " + evenHead.val);
        return head;
    }
}