class Solution {

    public int uniquePaths(int[][] grid) {
        final int MOD = 1000000007;
        int m = grid.length;
        int n = grid[0].length;

        // f[i][j][0]: enter (i, j) by moving down
        // f[i][j][1]: enter (i, j) by moving right
        int[][][] fun = new int[m][n][2];
        fun[0][0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0) {
                    if (grid[i - 1][j] == 0) {
                        fun[i][j][0] = (fun[i - 1][j][0] + fun[i - 1][j][1]) % MOD;
                    } else {
                        fun[i][j][0] = fun[i - 1][j][1];
                    }
                }

                if (j > 0) {
                    if (grid[i][j - 1] == 0) {
                        fun[i][j][1] = (fun[i][j - 1][0] + fun[i][j - 1][1]) % MOD;
                    } else {
                        fun[i][j][1] = fun[i][j - 1][0];
                    }
                }
            }
        }

        return (fun[m - 1][n - 1][0] + fun[m - 1][n - 1][1]) % MOD;
    }
}