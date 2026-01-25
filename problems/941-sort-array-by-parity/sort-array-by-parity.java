class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int swap = 0; // to track index to be swapped
        int temp = -1;
        for (int i = 0; i < nums.length; i++) {
            // if value is even, throw it to the front
            if (nums[i] % 2 == 0) {
                temp = nums[i];
                nums[i] = nums[swap];
                nums[swap] = temp;
                swap++;
            }
        }
        return nums;
    }
}