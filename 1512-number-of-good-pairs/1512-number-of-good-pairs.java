class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] occurences = new int[101];
        for(int i=0; i<nums.length; i++){
            occurences[nums[i]] = occurences[nums[i]] + 1;
        }
        
        int sum = 0;
        for(int i=0; i<occurences.length; i++){
            if(occurences[i] <= 1)
                continue;
            occurences[i] = summation(occurences[i]-1);
            sum = sum + occurences[i];
        }
        return sum;
    }
    
    public int summation(int n){
        return (int)(Math.pow(n,2)+ n)/2;
    }
}