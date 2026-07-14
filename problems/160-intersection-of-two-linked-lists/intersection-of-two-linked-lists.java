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

        while (listA.next != null && listB.next != null) {
            listA = listA.next;
            listB = listB.next;
        }

        while (listA.next != null) {
            listA = listA.next;
            headA = headA.next;
        }
        while (listB.next != null) {
            listB = listB.next;
            headB = headB.next;
        }
        System.out.println("headA " + headA.val);
        System.out.println("headB " + headB.val);

        if (headA == headB) {
            return headA;
        }

        while (headA.next != null && headB.next != null) {
            headA = headA.next;
            headB = headB.next;
            if (headA == headB) {
                System.out.println("return " + headA);
                return headA;
            }
        }
        System.out.println("return null");
        return null;
    }
}