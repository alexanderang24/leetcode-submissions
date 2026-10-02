class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character key : s.toCharArray()) {
            if (map.containsKey(key)) {
                int value = map.get(key)+1;
                // System.out.println("update key " + key + " to " + value);
                map.put(key, value);
            } else {
                // System.out.println("new key " + key);
                map.put(key, 1);
            }
        }

        for (Character key : s.toCharArray()) {
            // System.out.println("Key: " + key);
            if (map.get(key) == 1) {
                return s.indexOf(key);
            }
        }
        return -1;
    }
}