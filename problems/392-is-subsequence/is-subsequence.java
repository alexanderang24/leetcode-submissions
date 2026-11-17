class Solution {
    public boolean isSubsequence(String s, String t) {
        int cur = 0;
        for (int i = 0; i < t.length() && cur < s.length(); i++) {
            if (s.charAt(cur) == t.charAt(i)) {
                cur++;
            }
        }
        return cur == s.length();
    }
}