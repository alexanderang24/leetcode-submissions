class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character key : s.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            // System.out.println("Key: " + key);
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}