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
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        boolean cycle = false;
        ListNode slow = head;
        ListNode fast = head;
        
        while (slow.next != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            
            // System.out.println("slow: " + slow);
            // System.out.println("fast: " + fast);
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        return cycle;
    }
}