//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) { // no elements to be merged
            return;
        }

        int target = nums1.length - 1; // insert comparison result at this index
        int tail1 = m - 1; // index of nums1 tail
        int tail2 = n - 1; // index of nums2 tail
        while (tail2 >= 0 && tail1 >= 0) {
            if (nums2[tail2] >= nums1[tail1]) { // if tail2 is greater, put on target and move tail2 to the left
                nums1[target] = nums2[tail2];
                tail2--;
            } else { // else put tail1 on target and move tail to the left
                nums1[target] = nums1[tail1];
                tail1--;
            }
            target--; // move target to the left
        }

        while (tail2 >= 0) { // loop remaining nums2 if there are any unmerged elements
            nums1[target] = nums2[tail2];
            tail2--;
            target--;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
