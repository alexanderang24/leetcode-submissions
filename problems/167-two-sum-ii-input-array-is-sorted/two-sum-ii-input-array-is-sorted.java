class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            // System.out.println("numbers["+i+"]: " + numbers[i]);
            // if (numbers[i] > target) {
            //     continue;
            // }
            for (int j = i - 1; j >= 0; j--) {
                // System.out.println("n["+i+"]: " + numbers[i] + " n["+j+"]: " + numbers[j]);
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{j+1, i+1};
                }
            }
        }
        return new int[]{-1, -1};
    }
}