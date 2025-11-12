class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        //To create boolean arr
        boolean[] zeroRow = new boolean[m];
        boolean[] zeroCol = new boolean[n];

        //Mark zero'th position
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    zeroRow[i] = true;
                    zeroCol[j] = true;
                }
            }
        }

        //Convert that entire row into zero
        for(int i = 0; i < m; i++) {
            if(zeroRow[i]) {
                for(int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        //Convert that entire col into zero
        for(int j = 0; j < n; j++) {
            if(zeroCol[j]) {
                for(int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}