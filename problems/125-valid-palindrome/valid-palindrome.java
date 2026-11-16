class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim().toLowerCase();
        if (s.length() < 2) {
            return true;
        }

        for (int left = 0, right = s.length() - 1; left <= right;) {
            // System.out.println("comparing " + s.charAt(left) + " and " + s.charAt(right));
            if (!isAlphanumeric(s.charAt(left))) {
                // System.out.println("left not alpha");
                left++;
                continue;
            }
            if (!isAlphanumeric(s.charAt(right))) {
                // System.out.println("right not alpha");
                right--;
                continue;
            }

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

    private boolean isAlphanumeric(char c) {
        return (c >= 48 && c <= 57) || (c >= 97 && c <= 122);
    }
}