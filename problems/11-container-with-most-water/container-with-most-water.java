class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            // System.out.println("left: " + left + " right: " + right);
            int minHeight = Math.min(height[left], height[right]);
            int area = minHeight * (right - left);
            // System.out.println("area " + area);;
            max = Math.max(max, area);

            while (left < right && height[left] <= minHeight) left++;
            while (left < right && height[right] <= minHeight) right--;
        }
        return max;
    }
}