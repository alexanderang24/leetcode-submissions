class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 1;
        int k = nums.length;
        boolean isTwice = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                System.out.println("different");
                nums[slow] = nums[i];
                slow++;
                isTwice = false;
            } else if (!isTwice) {
                System.out.println("twice");
                nums[slow] = nums[i];
                slow++;
                isTwice = true;
            } else {
                k--;
                System.out.println("k: " + k);
            }
        }
        System.out.println("k: " + k);
        return k;
    }
}