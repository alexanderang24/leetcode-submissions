class Solution {
    public int strStr(String haystack, String needle) {
        int counter, idx;
        
        for (int i = 0; i < haystack.length() && i + needle.length() <= haystack.length(); i++) {
            idx = i;
            counter = 0;
            
            for (int j = 0; j < needle.length()  && idx < haystack.length(); j++, idx++) {
                // System.out.println("idx" + idx + " " + haystack.charAt(idx) + ", j" + j + " " + needle.charAt(j));
                // System.out.println("counter " + counter);

                if (haystack.charAt(idx) != needle.charAt(j)) {
                    // System.out.println("break");
                    break;
                }

                counter++;
                if (counter == needle.length()) {
                    // System.out.println("match, return");
                    return i;
                }
            }
        }
        return -1;
    }
}