class MyLinkedList {
    class Node {
        int val;
        Node next;
    }

    public Node head;
    int length;

    public MyLinkedList() {
        this.head = null;
        this.length = 0;
    }
    
    public int get(int index) {
        if (index >= length) {
            return -1;
        }

        var temp = head;
        while(index > 0) {
            temp = temp.next;
            index--;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        var temp = new Node();
        temp.val = val;
        temp.next = head;
        head = temp;
        length++;
    }
    
    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
        } else {
            var temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            var tail = new Node();
            tail.val = val;
            temp.next = tail;
            length++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if (index > length) {
            return;
        } else if (index == 0) {
            addAtHead(val);
        } else {
            var temp = head;
            while(index > 1) {
                temp = temp.next;
                index--;
            }
            var added = new Node();
            added.val = val;

            var next = temp.next;
            temp.next = added;
            added.next = next;
            length++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if (index >= length) {
            return;
        } else if (index == 0) {
            head = head.next;
            length--;
        } else {
            var temp = head;
            while(index > 1) {
                temp = temp.next;
                index--;
            }
            temp.next = temp.next.next;
            length--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */