//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    if (i != j && arr[i] == 2 * arr[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
