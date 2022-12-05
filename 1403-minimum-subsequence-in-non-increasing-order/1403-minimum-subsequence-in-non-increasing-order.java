class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum+= nums[i];
        }
        
        int start = 0;
        for(int i=nums.length-1; i>=0; i--){
            sum -= nums[i];
            sum -= nums[i];
            if(sum < 0){
                start = i;
                break;
            }
        }
        
        List<Integer> res = new ArrayList<>();
        for(int i=nums.length-1; i>=start; i--){
            res.add(nums[i]);
        }
        
        return res;
    }
}