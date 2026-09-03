class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        // If total elements are different, reshape is not possible
        if (m * n != r * c) {
            return mat;
        }

        int[][] ans = new int[r][c];

        int row = 0;
        int col = 0;

        // Traverse original matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                ans[row][col] = mat[i][j];

                col++;

                // Move to next row when current row is full
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }

        return ans;
    }
}