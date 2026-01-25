class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int odd = 0; // to track odd value index to be swapped
        int temp = -1;
        for (int i = 0; i < nums.length; i++) {
            // if value is even and odd is found, swap
            if (nums[i] % 2 == 0) {
                temp = nums[i];
                nums[i] = nums[odd];
                nums[odd] = temp;
                odd++;
            }
        }
        return nums;
    }
}