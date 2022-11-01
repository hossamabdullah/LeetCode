class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] res = new int[grid.length-2][grid[0].length-2];
        for(int i=0; i<grid.length-2; i++){
            for(int j=0; j<grid[i].length-2; j++){
                int max = 0;
                for(int a=i; a<i+3; a++){
                    for(int b=j; b<j+3; b++){
                        if(grid[a][b] > max)
                            max = grid[a][b];
                    }
                }
                res[i][j] = max;
            }
        }
        return res;
    }
}