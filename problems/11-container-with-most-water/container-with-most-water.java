class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            // System.out.println("left: " + left + " right: " + right);
            int area = Math.min(height[left], height[right]) * (right - left);
            // System.out.println("area " + area);;
            max = Math.max(max, area);

            if (height[left] < height[right]) {
                // System.out.println("move left");
                left++;
            } else {
                // System.out.println("move right");
                right--;
            }
        }
        return max;
    }
}