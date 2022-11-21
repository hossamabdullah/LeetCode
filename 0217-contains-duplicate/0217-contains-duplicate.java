class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> data = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(data.contains(nums[i]))
                return true;
            else
                data.add(nums[i]);
        }
        return false;
    }
}