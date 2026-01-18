import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        List<Integer> removeIndex = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (nums[i] == val) {
                removeIndex.add(i);
            }
        }
//        System.out.println("remove index: " + removeIndex.toString());

        int modifier = 0; // to correct index after removing
        for (Integer r : removeIndex) {
//            System.out.println("nums: " + Arrays.toString(nums));
            for (int i = r + 1 - modifier; i < length; i++) {
//                System.out.println("nums["+(i-1)+"] ("+nums[i-1]+") will be replaced with nums["+i+"] (" + nums[i] + ")");
                nums[i-1] = nums[i];
            }
            length--;
            modifier++;
        }
        return length;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
