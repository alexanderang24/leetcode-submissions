class MyHashMap {

    private class Node {
        public int key;
        public int value;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }


    private static final int SIZE = 769;
    private LinkedList<Node>[] buckets;

    public MyHashMap() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<Node>();
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        LinkedList<Node> bucket = buckets[hash(key)];
        for (Node n : bucket) {
            if (n.key == key) {
                n.value = value;
                return;
            }
        }
        bucket.add(new Node(key, value));
    }
    
    public int get(int key) {
        LinkedList<Node> bucket = buckets[hash(key)];
        for (Node n : bucket) {
            if (n.key == key) {
                return n.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        LinkedList<Node> bucket = buckets[hash(key)];
        for (Node n : bucket) {
            if (n.key == key) {
                bucket.remove(n);
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
