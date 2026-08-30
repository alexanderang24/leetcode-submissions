class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        return s.substring(s.lastIndexOf(" ") + 1).length();

        // System.out.println(s);
        // s = s.trim();
        // System.out.println(s);
        // s = s.substring(s.lastIndexOf(" ") + 1);
        // System.out.println(s);
        // int res = s.length();
        // System.out.println(res);
        // return res; 
    }
}