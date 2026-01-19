//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1; // number of unique elements, move only when elements is diferent (stay if duplicates)
//        System.out.println("nums: " + Arrays.toString(nums));

        for (int i = 1; i < nums.length; i++) {
//            System.out.println("nums["+i+"] " + nums[i] + " compare to " + nums[i-1]);
            if (nums[i] != nums[i-1]) {
//                System.out.println("replace " + nums[slow] + " with " + nums[i]);
                nums[j] = nums[i];
                j++;
            }
//            System.out.println("nums: " + Arrays.toString(nums));
        }
        return j;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
