class Solution {
    public int minOperations(int[] nums) {
        int total = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] <= nums[i-1]){
                int diff = nums[i-1] - nums[i] + 1;
                total += diff;
                nums[i] = nums[i] + diff;
            }
        }
        return total;
    }
}