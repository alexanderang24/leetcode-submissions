class Solution {
    public void reverseString(char[] s) {
        int j = s.length-1;
        // System.out.println("j: " + j);
        for (int i = 0; i < j; i++) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            // System.out.println("char: " + s);
            j--;
        }
    }
}