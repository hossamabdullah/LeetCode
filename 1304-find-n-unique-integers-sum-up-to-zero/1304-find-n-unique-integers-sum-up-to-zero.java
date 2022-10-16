class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int increment = 1;
        for(int i=0; i<n/2; i++){
            res[i] = increment;
            res[n-i-1] = -1*increment;
            
            increment++;
        }
        
        return res;
    }
}