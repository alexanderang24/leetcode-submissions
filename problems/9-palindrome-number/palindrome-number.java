class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int reversed = 0;
        int temp = x;
        while (temp != 0) {
            int last = temp % 10;
            reversed = reversed * 10 + last;
            temp = temp / 10;
        }
        System.out.println("reversed: " + reversed);

        return (reversed - x == 0);
    }
}