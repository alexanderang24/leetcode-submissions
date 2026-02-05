class Solution {
    public int dominantIndex(int[] nums) {
        int maxIdx = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIdx]) {
                // System.out.println("replace max");
                maxIdx = i;
            }
        }
        // System.out.println("maxIdx: " + maxIdx);
        
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIdx && nums[i] * 2 > nums[maxIdx]) {
                // System.out.println("nums["+i+"]: " + nums[i] + " x 2 is bigger than max");
                return -1;
            }
        }
        return maxIdx;
    }
}