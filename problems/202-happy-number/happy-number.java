class Solution {
    public boolean isHappy(int n) {        
        Set<Integer> set = new HashSet<>();
        while (!set.contains(n)) {
            set.add(n);
            int temp = 0;
            while(n > 0) {
                int calc = n % 10;
                temp = temp + (calc * calc);
                n = n / 10;
            }
            n = temp;
            if (n == 1) {
                return true;
            }
        }
        return false;
    }
}