class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int fullLength = mat.length * mat[0].length;
        int[] result = new int[fullLength];
        int i = 0, j = 0;
        String direction = "upright";

        for (int k = 0; k < fullLength; k++) {
            // System.out.println("k,i,j " + k + " " + i + " " + j + " mat: " + mat[i][j] + " direction: " + direction);
            result[k] = mat[i][j];
            
            if (direction.equals("upright")) {
                if (j == mat[0].length - 1) {
                    i++;
                    direction = "downleft";
                } else if (i == 0) {
                    j++;
                    direction = "downleft";
                } else {
                    i--;
                    j++;
                }
            } else { // downleft
                if (i == mat.length - 1) {
                    j++;
                    direction = "upright";
                } else if (j == 0) {
                    i++;
                    direction = "upright";
                } else {
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
}