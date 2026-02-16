class Solution {
    public int strStr(String haystack, String needle) {
        int counter, idx;
        int hlen = haystack.length();
        int nlen = needle.length();
        
        for (int i = 0; i < hlen && i + nlen <= hlen; i++) {
            idx = i;
            counter = 0;
            
            for (int j = 0; j < nlen  && idx < hlen; j++, idx++) {
                // System.out.println("idx" + idx + " " + haystack.charAt(idx) + ", j" + j + " " + needle.charAt(j));
                // System.out.println("counter " + counter);

                if (haystack.charAt(idx) != needle.charAt(j)) {
                    // System.out.println("break");
                    break;
                }

                counter++;
                if (counter == nlen) {
                    // System.out.println("match, return");
                    return i;
                }
            }
        }
        return -1;
    }
}