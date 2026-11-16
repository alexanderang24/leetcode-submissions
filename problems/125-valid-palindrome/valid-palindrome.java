class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        if (s.length() < 2) {
            return true;
        }

        for (int left = 0, right = s.length() - 1; left < right;) {
            // System.out.println("comparing " + s.charAt(left) + " and " + s.charAt(right));
            if (s.charAt(left) != s.charAt(right)) {
                // System.out.println("not the same");
                return false;
            }
            // System.out.println("same");
            left++;
            right--;
        }
        return true;
    }

    // private boolean isAlphanumeric(char c) {
    //     return (c >= 48 && c <= 57) || (c >= 97 && c <= 122);
    // }
}