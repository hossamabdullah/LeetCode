class Solution {
    
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i=0; i<=n; i++){
            res[i] = countBits(i, 16);
        }
        return res;
    }
    
    public int countBits(int n, int twosPower){
        int increment = 0;
        if(n >= (int)Math.pow(2, twosPower)){
            n  = n % (int)Math.pow(2, twosPower);
            increment = 1;
        }
        
        if(twosPower == 0)
            return increment;
        return countBits(n, twosPower-1) + increment; 
    } 
}