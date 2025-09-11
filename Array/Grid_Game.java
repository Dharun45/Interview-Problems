class Solution {
    public long gridGame(int[][] grid) 
    {
        long minRes = Long.MAX_VALUE;
        
        // for row1
        long row1Sum = 0;
        for(int i = 0; i < grid[0].length; i++)
        {
            row1Sum += grid[0][i];
        }

        // for row2
        long row2Sum = 0;
        for(int i = 0; i < grid[0].length; i++)
        {
           row1Sum -= grid[0][i];
           minRes = Math.min(minRes , Math.max(row1Sum , row2Sum)); 
           row2Sum += grid[1][i];
        }
    return minRes;
    }
}