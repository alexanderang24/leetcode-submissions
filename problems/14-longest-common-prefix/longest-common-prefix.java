class Solution {
    public String longestCommonPrefix(String[] strs) {
        int commonIdx = 0;
        for (int i = 0; i < strs[0].length(); i++) { // loop each char on all strs
            char letter = strs[0].charAt(i);
            boolean allLetterSame = true;
            for (int j = 1; j < strs.length; j++) { // loop each string
                if (i == strs[j].length()) {
                    allLetterSame = false;
                    break;
                }
                // System.out.println("char to compare: " + letter + " >< " + strs[j].charAt(i));
                if (letter != strs[j].charAt(i)) {
                    allLetterSame = false;
                    break;
                }
            }
            if (allLetterSame) {
                commonIdx++;
                // System.out.println("commonIdx added to " + commonIdx);
            } else {
                break;
            }
        }
        
        if (commonIdx == 0) {
            return "";
        } else {
            return strs[0].substring(0, commonIdx);
        }
    }
}