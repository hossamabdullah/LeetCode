class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i=0; 2*i < nums.length; i++){
            int freq = nums[2*i];
            int val  = nums[2*i+1];
            
            for(int j=0; j<freq; j++){
                res.add(val);
            }
            
        }
        
        int[] resAsArray = new int[res.size()];
        for(int i=0; i<res.size(); i++){
            resAsArray[i] = res.get(i);
        }
        return resAsArray;
    }
}