//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        int temp = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.println("arr["+i+"]: " + arr[i] + " will be replaced by " + max);
            temp = arr[i]; // need temp to store the original arr[i] value to be compared
            arr[i] = max;
            if (temp > max) {
                max = temp;
//                System.out.println("new max " + max);
            }
        }
        return arr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
