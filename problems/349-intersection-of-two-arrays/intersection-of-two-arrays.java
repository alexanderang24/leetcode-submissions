class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (Integer num1 : nums1) {
            set1.add(num1);
        }
        
        Set<Integer> set2 = new HashSet<>();
        for (Integer num2 : nums2) {
            if (set1.contains(num2)) {
                set2.add(num2);
            }
        }
        
        return set2.stream().mapToInt(Integer::intValue).toArray();
    }
}