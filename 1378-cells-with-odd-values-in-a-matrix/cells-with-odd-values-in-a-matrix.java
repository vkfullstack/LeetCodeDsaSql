class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        
        int k = 0;

        int[][] ans = new int[m][n];

        for (int i = 0; i < indices.length; i++) {

            // Increase the entire row
            for (int j = 0; j < n; j++) {
                ans[indices[i][0]][j]++;
            }

            // Increase the entire column
            for (int j = 0; j < m; j++) {
                ans[j][indices[i][1]]++;
            }
        }

        // Count odd cells
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i][j] % 2 != 0) {
                    k++;
                }
            }
        }

        return k;
    }
}