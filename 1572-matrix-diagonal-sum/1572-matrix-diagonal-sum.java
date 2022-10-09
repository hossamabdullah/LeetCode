class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i =0; i <mat.length; i++){
            for(int j=0; j<mat.length; j++){
                if(i == j){
                    sum += mat[i][j];
                    mat[i][j] = 0;
                }
                
                if(j==(mat.length-i-1)){
                    sum += mat[i][j];
                    mat[i][j] = 0;
                }
                    
            }
        }
        return sum;
    }
}