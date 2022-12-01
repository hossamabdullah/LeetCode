class Solution {
    public int maxProductDifference(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            int min = i;
            
            for(int j=i+1; j<nums.length; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
                
            }
            
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
        
        int min1 = nums[0];
        int min2 = nums[1];
        
        int max1 = nums[nums.length-1];
        int max2 = nums[nums.length-2];
        
        return (max1*max2)-(min1*min2);
    }
}