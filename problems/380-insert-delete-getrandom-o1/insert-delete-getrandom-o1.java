class RandomizedSet {

    private List<Integer> list;
    private Map<Integer, Integer> map;
    private Random rand;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        } else {
            list.add(val);
            map.put(val, list.size()-1);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if (map.containsKey(val)) {
            int lastIndex = list.size() - 1;
            int lastValue = list.get(lastIndex);

            int targetIndex = map.get(val);
            list.set(targetIndex, lastValue);
            map.put(lastValue, targetIndex);

            list.remove(lastIndex);
            map.remove(val);
            return true;
        } else {
            return false;
        }
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