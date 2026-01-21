//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean validMountainArray(int[] arr) {
        // if array is only 2 elements or less, it's not a valid mountain
        if (arr.length < 3) {
            return false;
        }

        // loop from the left, stop if next index is equal or lower
        int l = 0;
        while (l + 1 < arr.length - 1 && arr[l + 1] > arr[l]) {
            l++;
        }

        // loop from the right, stop if previous index is equal or lower
        int r = arr.length - 1;
        while (r - 1 > 0 && arr[r - 1] > arr[r]) {
            r--;
        }

        // check if both pointer stop at the same index (the top)
        // if top is flat (equal value) it's not considered a valid mountain
        return l == r;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
