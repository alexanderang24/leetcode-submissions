class Solution {
    public String reverseWords(String s) {
        char[] chars = reverseAll(s);
        reverseWords(chars);
        return cleanSpaces(chars, chars.length);
    }

    public char[] reverseAll(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        // System.out.println("reversed string: " + new String(chars));
        return chars;
    }

    public void reverseWords(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            while (i < chars.length && chars[i] == ' ') {
                i++;
            }

            int left = i;
            int right = i;
            while (right < chars.length && chars[right] != ' ') {
                right++;
            }
            int wordEnd = right - 1;
            System.out.println("i=" + i + " left=" + left + " wordEnd=" + wordEnd);
            i = right;

            while (left < wordEnd) {
                char temp = chars[left];
                chars[left] = chars[wordEnd];
                chars[wordEnd] = temp;
                left++;
                wordEnd--;
            }
            // System.out.println("after loop: " + new String(chars));
        }
    }

    public String cleanSpaces(char[] a, int n) {
        int i = 0, j = 0;

        while (j < n) {
            while (j < n && a[j] == ' ')
                j++; // skip spaces
            while (j < n && a[j] != ' ')
                a[i++] = a[j++]; // keep non spaces
            while (j < n && a[j] == ' ')
                j++; // skip spaces
            if (j < n)
                a[i++] = ' '; // keep only one space
        }

        return new String(a).substring(0, i);
    }
}