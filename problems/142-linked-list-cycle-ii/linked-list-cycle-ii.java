/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle) { 
            return null;
        }

        while (head != slow) {
            if (head == slow) {
                break;
            }
            slow = slow.next;
            head = head.next;
        }
        return head;
    }
}