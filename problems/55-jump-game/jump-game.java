class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            } else {
                int reach = i + nums[i];
                // System.out.println("reach: " + reach);
                if (reach > nums.length - 1) {
                    return true;
                } else if (reach > maxReach) {
                    maxReach = reach;
                    // System.out.println("maxReach: " + maxReach);
                }
            }
        }
        return true;
    }
}