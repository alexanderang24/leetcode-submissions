class Solution {
    public int majorityElement(int[] nums) {
        int res = -1;
        int majority = 0;

        for (int num : nums) {
            if (majority == 0) {
                res = num;
            }
            if (num == res) {
                majority++;
            } else {
                majority--;
            }
        }
        return res;
    }
}