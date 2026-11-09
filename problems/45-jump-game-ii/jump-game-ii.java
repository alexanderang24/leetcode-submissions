class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        for (int i = 0; i < nums.length - 1; jump++) {
            int reach = nums[i];
            // System.out.println("jump: " + jump);
            // System.out.println("reach: " + reach);
            if (i + reach >= nums.length - 1) {
                jump++;
                break;
            }

            int jumpTo = i+1;
            int max = nums[jumpTo] + jumpTo;
            for (int j = jumpTo+1; j <= i+reach; j++) {
                if (nums[j] + j >= max) {
                    max = nums[j] + j;
                    jumpTo = j;
                }
                // System.out.println("max: " + max);
            }
            i = jumpTo;
            // System.out.println("jumpTo index: " + i);
        }
        return jump;
    }
}