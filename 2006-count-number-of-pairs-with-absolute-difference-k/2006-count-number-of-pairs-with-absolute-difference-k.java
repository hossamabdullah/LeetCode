class Solution {
    public int countKDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int[] data = new int[101];
        for(int i=0; i<nums.length; i++){
            data[nums[i]] = data[nums[i]] + 1;
        }
        
        int count = 0;
        for(int i=0; i<data.length-k; i++){
            if(data[i] == 0 || data[i+k]==0)
                continue;
            int c1 = data[i];
            int c2 = data[i+k];
            
            count += c1*c2;
        }
        return count;
    }
}