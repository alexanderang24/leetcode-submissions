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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0 || head.next == null) {
            // System.out.println("return immediately");
            return head;
        }

        ListNode curr = head;
        ListNode tail = head;
        int length = 1;

        while (k > 0 && tail.next != null) {
            tail = tail.next;
            k--;
            length++;
        }
        
        if (k != 0) {
            k = (k-1) % length;
            if (k == 0) {
                // System.out.println("rotation will end up the same, return head");
                return head;
            }
            // System.out.println("k more than length, real k: " + k);
            tail = head;
            while (k > 0) {
                tail = tail.next;
                k--;
            }
        }

        while (tail.next != null) {
            tail = tail.next;
            curr = curr.next;
        }
        // System.out.println("tail ends at " + tail.val);
        // System.out.println("curr ends at " + tail.val);
        ListNode newHead = curr.next;
        curr.next = null;
        tail.next = head;

        return newHead;
    }
}