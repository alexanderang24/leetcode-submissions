class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character sc = s.charAt(i);
            Character tc = t.charAt(i);

            if (map.containsKey(sc)) {
                if (!map.get(sc).equals(tc)) {
                    return false;
                }
            } else if (map.containsValue(tc)) {
                return false;
            } else {
                map.put(sc, tc);
            }
        }
        return true;
    }
}