class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character c1 = s.charAt(i);
            if (!map1.containsKey(c1)) {
                map1.put(c1, i);
                // System.out.println("put in map1: " + c1);
            }

            Character c2 = t.charAt(i);
            if (!map2.containsKey(c2)) {
                map2.put(c2, i);
                // System.out.println("put in map2: " + c2);
            }

            if (!map1.get(c1).equals(map2.get(c2))) {
                // System.out.println("map1 c1 " + map1.get(c1) + " not equals to " + map2.get(c2));
                return false;
            }
        }
        return true;
    }
}