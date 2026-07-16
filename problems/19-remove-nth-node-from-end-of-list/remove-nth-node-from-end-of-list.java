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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // pointer A on head, pointer B with n step ahead of it
        // if pointer B reach end, delete node on pointer A

        ListNode a = head;
        ListNode b = head;
        int counter = 0;
        
        while (b.next != null) {
            if (counter >= n) {
                a = a.next;
            }
            b = b.next;
            counter++;
            // System.out.println("counter " + counter);
            // System.out.println("a now at " + a.val);
            // System.out.println("b now at " + b.val);
        }

        if (counter < n) {
            head = a.next;
        } else if (a.next == null) {
            // System.out.println("a next is null");
            return null;
        } else if (a.next.next == null) {
            // System.out.println("a next next is null");
            a.next = null;
        } else {
            // System.out.println("deleting a.next and connecting a to a.next.next");
            a.next = a.next.next;
        }
        return head;
    }
}