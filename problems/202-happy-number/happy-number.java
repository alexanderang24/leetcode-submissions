class Solution {
    public boolean isHappy(int n) {        
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            // System.out.println("n: " + n);
            if (set.contains(n)) {
                // System.out.println("set contains n");
                return false;
            } else {
                set.add(n);
            }
            String s = String.valueOf(n);
            Integer calc = 0;
            for (int i = 0; i < s.length(); i++) {
                double digit = Character.digit(s.charAt(i), 10);
                // System.out.println("digit " + digit);
                calc += (int) Math.pow(digit, 2);
            }
            n = calc;
        }
        return true;
    }
}