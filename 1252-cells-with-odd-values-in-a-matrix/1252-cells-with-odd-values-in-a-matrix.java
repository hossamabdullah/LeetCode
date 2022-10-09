class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int[][] mn = new int[m][n];
        for(int i=0; i<indices.length; i++){
            
            int rowsToBeUpdated = indices[i][0];
            int colsToBeUpdated = indices[i][1];
            
            for(int j=0; j<n; j++){
                mn[rowsToBeUpdated][j] = mn[rowsToBeUpdated][j] + 1;
            }
            
            for(int j=0; j<m; j++){
                mn[j][colsToBeUpdated] = mn[j][colsToBeUpdated] + 1;
            }
        }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                // System.out.println(mn[i][j]+"==="+isOdd(mn[i][j]));
                if(isOdd(mn[i][j]))
                    count = count + 1;
            }
        }
        return count;
    }
    
    public static boolean isOdd(int num){
        return num % 2 != 0;
    }
    
    // public static boolean isPrime(int num) { 
    //     if (num < 0) 
    //         return false;
    //     if (num == 0 || num == 1) 
    //         return false;
    //     if (num == 2 || num == 3) 
    //         return true;
    //     if ((num * num - 1) % 24 == 0) 
    //         return true;
    //     else 
    //         return false; 
    // }
}