class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int repeat = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                repeat++;
                if (repeat > max) {
                    max = repeat;
                }
            } else {
                repeat = 0;
            }
        }
        return max;
    }
}