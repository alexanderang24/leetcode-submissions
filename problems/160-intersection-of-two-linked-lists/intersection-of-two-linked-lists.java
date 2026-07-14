/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode listA = headA;
        ListNode listB = headB;

        while (listA != listB) {
            if (listA == null) {
                listA = headB;
            } else {
                listA = listA.next;
            }

            if (listB == null) {
                listB = headA;
            } else {
                listB = listB.next;
            }
        }
        return listA;
    }
}