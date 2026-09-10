class Solution {
    public boolean isHappy(int n) {        
        Set<Integer> set = new HashSet<>();
        while (!set.contains(n)) {
            set.add(n);
            int temp = 0;
            while(n > 0) {
                int calc = n % 10;
                temp += calc * calc;
                n /= 10;
            }
            if (temp == 1) return true;
            n = temp;
        }
        return false;
    }
}