//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while(true) {
            if (num == 0) {
                break;
            } else if (num % 2 == 1) {
                num = num - 1;
            } else if (num % 2 == 0) {
                num = num / 2;
            }
            steps++;
        }
        return steps;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
