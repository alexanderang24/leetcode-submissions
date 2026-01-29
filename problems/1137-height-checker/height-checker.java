class Solution {
    public int heightChecker(int[] heights) {
        // intuition 1
        // initiate a new array, sort it
        // then compare how many different index with heights
        int diff = 0;
        int[] sorted = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sorted);
//        System.out.println("sorted: " + Arrays.toString(sorted));

        for (int i = 0; i < heights.length; i++) {
//            System.out.println("heights["+i+"]: " + heights[i]);
//            System.out.println("sorted["+i+"]: " + sorted[i]);
            if (heights[i] != sorted[i]) {
                diff++;
            }
        }
        return diff;
    }
}