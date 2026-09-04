class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) != null) {
                int val = map.get(s.charAt(i));
                map.put(s.charAt(i), ++val);
                System.out.println("+char: " + s.charAt(i) + " val: " + val);
            } else {
                map.put(s.charAt(i), 1);
                System.out.println("+char: " + s.charAt(i) + " val: " + 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (map.get(t.charAt(i)) != null && map.get(t.charAt(i)) > 0) {
                int val = map.get(t.charAt(i));
                map.put(t.charAt(i), --val);
                System.out.println("-char: " + t.charAt(i) + " val: " + val);
            } else {
                return false;
            }
        }

        for (int i = 0; i < map.size(); i++) {
            if (map.get(s.charAt(i)) != 0) {
                System.out.println("not null: " + s.charAt(i) + " val: " + map.get(s.charAt(i)));
                return false;
            }
        }
        return true;
    }
}