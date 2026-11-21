class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        int minHeight = 0;
        int area = 0;

        while (left < right) {
            minHeight = Math.min(height[left], height[right]);
            area = minHeight * (right - left);
            max = Math.max(max, area);

            while (left < right && height[left] <= minHeight) left++;
            while (left < right && height[right] <= minHeight) right--;
        }
        return max;
    }
}