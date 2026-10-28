class RandomizedSet {

    private List<Integer> list;
    private Random rand;

    public RandomizedSet() {
        list = new ArrayList<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if (list.contains(val)) {
            return false;
        } else {
            list.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        int index = list.indexOf(val);
        if (index != -1) {
            list.remove(index);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */