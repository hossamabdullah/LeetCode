class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] data = new int[nums.length*2];
        for(int i=0; i<nums.length; i++){
            data[i] = nums[i];
            data[i+nums.length] = nums[i];
        }
        return data;
    }
}