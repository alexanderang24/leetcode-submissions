class Solution {
    public String reverseWords(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.println("i" + i);
            while (c[i] == ' ') {
                // System.out.println("skip space");
                i++;
            }
            if (i > c.length) {
                // System.out.println("reached end");
                break;
            }

            int left = i;
            int right = i;
            while (c[right] != ' ' && right < c.length - 1) right++;
            i = right;
            // System.out.println("left right nexti " + left + " " + right + " " + i);

            int wordEnd = c[right] == ' ' ? right -1 : right;
            while (left < wordEnd) {
                char temp = c[left];
                c[left] = c[wordEnd];
                c[wordEnd] = temp;
                left++;
                wordEnd--;
            }
            // System.out.println(new String(c));
        }
        return new String(c).trim();
    }
}