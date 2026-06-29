class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        if (k == 0) return;
        reverse(nums, 0, length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, length-1);
    }

    public void reverse(int[] nums, int from, int to) {
        // System.out.println("reverse from " + from + " to " + to);
        int temp;
        while (from < to) {
            temp = nums[from];
            nums[from] = nums[to];
            nums[to] = temp;
            to--;
            from++;
        }
    }
}