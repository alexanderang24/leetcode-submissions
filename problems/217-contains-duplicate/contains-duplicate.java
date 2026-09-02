class Solution {
    public boolean containsDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        HashSet<Integer> set = new HashSet<>();
        set.addAll(list);

        return list.size() != set.size();
    }
}