/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;
        Node result = head;
        result.prev = null;
        traverse(head);
        return result;
    }
    
    private Node traverse(Node curr) {
        Node last = curr;

        while (curr != null) {
            Node next = curr.next;
            if (curr.child != null) {
                Node childHead = curr.child;
                Node childTail = traverse(childHead);

                curr.next = childHead;
                childHead.prev = curr;

                childTail.next = next;
                if (next != null) next.prev = childTail;

                curr.child = null;
                last = childTail;
            } else {
                last = curr;
            }
            curr = next;
        }
        return last;
    }
}