class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0, j = 0;
        String direction = "right";
        int moveHrz = matrix[0].length - 1; // move left / right
        int moveVrt = matrix.length - 1; // move up / down
        int move = moveHrz;
        List<Integer> res = new ArrayList<>();

        for (int k = 0; k < m * n; k++, move--) {
            res.add(matrix[i][j]);
            // System.out.println("res: " + res.toString()); 
            if (direction.equals("right")) {
                if (move > 0) {
                    j++;
                } else { // on move 0
                    if (i != 0) {
                        // System.out.println("reduce moveHrz");
                        moveHrz--;
                    }
                    move = moveVrt;
                    i++;
                    direction = "down";
                }
            } else if (direction.equals("down")) {
                if (move > 0) {
                    i++;
                } else { // on move 0
                    j--;
                    direction = "left";
                    moveVrt--;
                    move = moveHrz;
                    // System.out.println("reduce moveVrt");
                }
            } else if (direction.equals("left")) {
                if (move > 0) {
                    j--;
                } else { // on move 0
                    i--;
                    direction = "up";
                    moveHrz--;
                    move = moveVrt;
                    // System.out.println("reduce moveHrz");
                }
            } else if (direction.equals("up")) {
                if (move > 0) {
                    i--;
                } else { // on move 0
                    j++;
                    direction = "right";
                    moveVrt--;
                    move = moveHrz;
                    // System.out.println("reduce moveVrt");
                }
            }
        }
        return res;
    }
}