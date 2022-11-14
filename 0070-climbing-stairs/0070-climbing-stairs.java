class Solution {
    public int climbStairs(int n) {
        int[] data = new int[n+1];
        return solve(n, data);
    }
    
    public int solve(int n, int[] data){
        if(n==0)
            return 1;
        if(n<0)
            return 0;
        if(data[n] > 0)
            return data[n];
        
        
        int count = 0;
        count += solve(n-1, data);
        count += solve(n-2, data);
        
        data[n] = count;
        return count;
    }
}