//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = -1;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }

            if (sum > result) {
                result = sum;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
