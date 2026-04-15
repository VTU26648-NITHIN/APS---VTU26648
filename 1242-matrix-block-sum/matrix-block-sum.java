class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] prefixSum = new int[m + 1][n + 1];

        // 1. Build the prefix sum matrix
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefixSum[i][j] = mat[i - 1][j - 1] + prefixSum[i - 1][j] 
                                  + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1];
            }
        }

        int[][] ans = new int[m][n];
        
        // 2. Calculate the sum for each block using the prefix sum
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int r1 = Math.max(0, i - k);
                int c1 = Math.max(0, j - k);
                int r2 = Math.min(m - 1, i + k);
                int c2 = Math.min(n - 1, j + k);
                
                // Use the formula (adjusting for 1-based prefixSum indexing)
                ans[i][j] = prefixSum[r2 + 1][c2 + 1] - prefixSum[r1][c2 + 1] 
                            - prefixSum[r2 + 1][c1] + prefixSum[r1][c1];
            }
        }
        
        return ans;
    }
}