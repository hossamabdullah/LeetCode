class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] even = new int[nums.length];
        int evenIndex = 0;
        int[] odd = new int[nums.length];
        int oddIndex = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                even[evenIndex] = nums[i];
                evenIndex++;
            }else{
                odd[oddIndex] = nums[i];
                oddIndex++;
            }
        }
        
        oddIndex = 0;
        while(evenIndex != nums.length){
            even[evenIndex++] = odd[oddIndex++];
        }
        
        return even;
    }
}