class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        // System.out.println("nums: " + Arrays.toString(nums));
        
        List<Integer> missing = new ArrayList<>();
        int counter = 1; // count from 1 to n (nums length)

        // count will match from 1 to n
        for (int i = 0; i < nums.length; i++) {
            // System.out.println("nums["+i+"]: " + nums[i]);
            // System.out.println("counter: " + counter);
            // System.out.println("missing: " + missing);
            
            // if num is lower, means repeating number, continue to next num
            if (nums[i] < counter) {
                // System.out.println("continue");
                continue;
            }
            // if num is greater, add missing number
            if (nums[i] > counter) {
                for (int j = counter; j < nums[i]; j++) { 
                    // System.out.println("add to missing: " + j);
                    missing.add(j);
                    counter++;
                }
            }                
            counter++;
        }

        // if biggest num is lower than length, add all the missing number
        if (nums[nums.length - 1] < nums.length) {
            for (int i = nums[nums.length-1] + 1; i <= nums.length; i++) {
                // System.out.println("add " + i);
                missing.add(i);
            }
        }
        return missing;
    }
}