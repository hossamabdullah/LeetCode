class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> digitToCountMap = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            if(!digitToCountMap.containsKey(nums[i])){
                digitToCountMap.put(nums[i],1);
            }else{
                int c = digitToCountMap.get(nums[i]);
                if(c == nums.length/2){
                    return nums[i];
                }
                digitToCountMap.put(nums[i],c+1);
            }
        }
        
        return nums[0];
    }
}