class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0;
        int size = citations.length;

        for (int i = size - 1; i >= 0; i--) {
            int k = size - i;
            if (citations[i] < k) {
                return h;
            }
            h++;
        }
        return h;
    }
}