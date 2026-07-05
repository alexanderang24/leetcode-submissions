class Solution {
    public String reverseWords(String s) {
        s = new StringBuilder(s).reverse().toString();
        String[] words = s.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isBlank()) {
                result += new StringBuilder(words[i]).reverse().toString() + " ";
            }
        }
        return result.trim();
    }
}

/**
the sky is blue
eulb si yks eht
blue is sky the
 */