class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] d = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(obstacleGrid[i][j] == 1){
                    d[i][j] = 0;
                }
                else if(i==0 && j==0){
                    d[i][j] = 1;
                }
                else if(i==0){
                    d[i][j] = d[i][j-1];
                }
                else if(j==0){
                    d[i][j] = d[i-1][j];
                }
                else{
                    d[i][j] = d[i-1][j] + d[i][j-1];
                }
            }
        }
        return d[m-1][n-1];
    }
}