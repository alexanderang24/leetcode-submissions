class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int maxRow = mat.length;
        int maxColumn = mat[0].length;
        int[] result = new int[maxRow * maxColumn];
        int i = 0, j = 0;
        boolean goingUpRight = true;

        for (int k = 0; k < maxRow * maxColumn; k++) {
            // System.out.println("k,i,j " + k + " " + i + " " + j + " mat: " + mat[i][j] + " goingUpRight: " + goingUpRight);
            result[k] = mat[i][j];
            
            if (goingUpRight) {
                if (j == maxColumn - 1) {
                    i++;
                    goingUpRight = false;
                } else if (i == 0) {
                    j++;
                    goingUpRight = false;
                } else {
                    i--;
                    j++;
                }
            } else { // going downleft
                if (i == maxRow - 1) {
                    j++;
                    goingUpRight = true;
                } else if (j == 0) {
                    i++;
                    goingUpRight = true;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
}