class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.equals("")) return true;
        int cur = 0;
        for (int i = 0; i < t.length() && cur < s.length(); i++) {
            if (s.charAt(cur) == t.charAt(i)) {
                cur++;
            }

            if (cur == s.length()) {
                return true;
            }
        }
        return false;
    }
}