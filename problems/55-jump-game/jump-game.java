class Solution {
    public boolean canJump(int[] nums) {
        boolean result = true;
        for (int i = 0; i < nums.length - 1;) {
            int n = nums[i]; // 2; choice: 1, 2
            // System.out.println("n: " + n);
            if (n == 0) {
                return false;
            } else if (i + n >= nums.length - 1) {
                return true;
            }

            int val = i+1 + nums[i+1];
            int jumpToIndex = i+1;
            // System.out.println("val: " + val);
            for (int j = i+2; j <= i+n && j < nums.length - 1; j++) {
                // System.out.println("j: " + j + " numsj: " + nums[j]);
                // System.out.println("jumpToIndex: " + jumpToIndex + " jti num: " + nums[jumpToIndex]);
                int valJ = j + nums[j];
                // System.out.println("valJ: " + valJ);
                if (valJ >= val) {
                    jumpToIndex = j;
                    val = valJ;
                }
            }
            i = jumpToIndex;
            // System.out.println("i: " + i);
        }
        return result;
    }
}