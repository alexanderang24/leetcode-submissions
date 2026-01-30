class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // get corect index of nums[i]
            if (nums[index] > 0) { // ignore if already marked to avoid unmarking
                nums[index] = nums[index] * -1; // mark that index by turning it into negative value, while preserving the number
            }
        }

        List<Integer> missing = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) { // if index not marked, it means i+1 is missing
                missing.add(i+1);
            }
        }
        return missing;
    }
}