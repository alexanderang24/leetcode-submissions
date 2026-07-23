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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode prev = new ListNode(-1, head);

        while (temp != null) {
            // System.out.println("temp: " + temp.val);

            if (temp.val == val) {
                // System.out.println("in");
                prev.next = temp.next;
                temp = prev;
                // System.out.println("prev " + prev.val);
                // System.out.println("temp " + temp.val);
            
            } else {
                prev = temp;
            }
            temp = temp.next;

            if (prev.val == -1) {
                head = temp;
            }
        }

        return head;
    }
}