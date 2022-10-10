class Solution {
    public int countKDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int[] data = new int[101];
        for(int i=0; i<nums.length; i++){
            data[nums[i]] = data[nums[i]] + 1;
        }
        
        int count = 0;
        for(int i=0; i<data.length-k; i++){
            count += data[i]*data[i+k];
        }
        return count;
    }
}