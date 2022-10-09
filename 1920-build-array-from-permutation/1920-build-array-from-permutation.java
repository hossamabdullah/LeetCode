class Solution {
    public int[] buildArray(int[] nums) {
        int[] data = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            data[i] = nums[nums[i]];
        }
        return data;
    }
}