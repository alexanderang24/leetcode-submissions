import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> pool = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char letter = magazine.charAt(i);
            int count = pool.getOrDefault(letter, 0);
            pool.put(letter, count + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char letter = ransomNote.charAt(i);
            int count = pool.getOrDefault(letter, 0);
            if (count == 0) {
                return false;
            } else {
                pool.put(letter, count - 1);
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
