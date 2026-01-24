class Solution {
    public void moveZeroes(int[] nums) {
        // two pointers, fast and slow
        // the fast pointer +1 every iteration (i)
        // the slow pointer stuck on 0 and only iterate when 0 is replaced by num on the fast pointer
        // this will result in all 0 is replaced
        // then we replaced n elements of nums to 0 according to index of slow pointer
        
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[slow] = nums[i];
                slow++;
            }
        }
        for (int i = slow; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}