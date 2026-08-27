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
        Node dummyFlat = new Node();
        Node tail = traverse(head, dummyFlat);
        Node result = dummyFlat.next;
        if (result != null) result.prev = null; // head.prev must be null
        return result;
    }

    private Node traverse(Node curr, Node flat) {
        while (curr != null) {
            // System.out.println("add to flat: " + curr.val);
            Node temp = new Node();
            temp.val = curr.val;
            temp.prev = flat;
            flat.next = temp;
            flat = flat.next;

            if (curr.child != null) {
                // System.out.println("have child, going in");
                flat = traverse(curr.child, flat);
            }
            curr = curr.next;
        }
        return flat;
    }
}