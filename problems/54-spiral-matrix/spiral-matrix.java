class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length; // number of row
        int n = matrix[0].length; // number of column
        int i = 0, j = 0; // coordinate, to add value to res
        String direction = "right";
        int moveHrz = n - 1; // move horizontal (left/right)
        int moveVrt = m - 1; // move vertical (up/down)
        // number of movement, reduce every iteration, change direction if reach zero.
        int move = moveHrz; // start from horizontal because we are moving to the right

        for (int k = 0; k < m * n; k++, move--) {
            res.add(matrix[i][j]);
            if (direction.equals("right")) {
                if (move > 0) {
                    j++; // move right
                } else { // on move 0
                    if (i != 0) { // except for the first corner,
                        moveHrz--; // reduce horizontal movement
                    }
                    move = moveVrt; // change number of move to vertical
                    i++; // move down
                    direction = "down";
                }
            } else if (direction.equals("down")) {
                if (move > 0) {
                    i++; // move down
                } else { // on move 0
                    moveVrt--; // reduce vertical movement
                    move = moveHrz; // change number of move to horizontal
                    j--; // move left
                    direction = "left";
                }
            } else if (direction.equals("left")) {
                if (move > 0) {
                    j--; // move left
                } else { // on move 0
                    moveHrz--; // reduce horizontal movement
                    move = moveVrt; // change number of move to vertical
                    i--; // move up
                    direction = "up";
                }
            } else if (direction.equals("up")) {
                if (move > 0) {
                    i--; // move up
                } else { // on move 0
                    moveVrt--; // reduce vertical movement
                    move = moveHrz; // change number of move to horizontal
                    j++; // move right
                    direction = "right";
                }
            }
        }
        return res;
    }
}