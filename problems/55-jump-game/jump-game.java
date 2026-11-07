class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (i > maxReach) return false;
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= len - 1) {
                return true;
            }
        }
        return true;
    }
}