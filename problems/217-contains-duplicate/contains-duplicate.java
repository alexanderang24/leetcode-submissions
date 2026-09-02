class Solution {
    public boolean containsDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        Collections.sort(list);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i-1).equals(list.get(i))) {
                return true;
            }
        }
        return false;
    }
}