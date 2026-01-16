//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void duplicateZeros(int[] arr) {
        int noOfZero = 0;
        int l = arr.length - 1; // length
        // loop only element that will not be elimated
        for (int i = 0; i <= l - noOfZero; i++) {
            if (arr[i] == 0) {
                // if new last element is zero
                if (i == l - noOfZero) {
                    arr[l] = 0; // copy it to the last element without duplicating as no space left
                    l--; // reduce the length we need to loop later as we already set the last index
                    break;
                }
                noOfZero++;
            }
        }

        // index of value that will be the new last element
        int newLast = l - noOfZero;
        for (int i = newLast; i >= 0; i--) {
            // if zero copy twice, else copy once
            if (arr[i] == 0) {
                arr[i+noOfZero] = arr[i];
                noOfZero--;
            }
            arr[i+noOfZero] = arr[i];
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
