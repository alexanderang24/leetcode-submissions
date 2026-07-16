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
        ListNode a = head;
        ListNode b = head;
        int counter = 0;
        
        // set pointer A on head, pointer B with n step ahead of it
        while (b.next != null) {
            if (counter >= n) {
                a = a.next;
            }
            b = b.next;
            counter++;
        }

        // in case we need to delete the head
        // also covers if there's only 1 node in the list (set head to null)
        if (counter < n) {
            head = a.next;
        } else { // set next node to next next node (or null if we're deleting the last node in the list)
            a.next = a.next.next;
        }
        return head;
    }
}