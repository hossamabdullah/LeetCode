class Solution {
    public int searchInsert(int[] nums, int target) {
        return searchInsert(nums, target, 0, nums.length);
    }
    
    public int searchInsert(int[] nums, int target, int start, int end){
        if(start == end)
            return -1;
        int length = end - start;
        int mid = start + length / 2 ;
            
        System.out.println(start +","+ mid+","+end);
        if(target == nums[mid]){
            return mid;
        }
        if(target < nums[mid]){
            if(mid == 0)
                return 0;
            if(mid == end)
                return mid + 1;
            return searchInsert(nums, target, start, mid);
        }
        if(target > nums[mid]){
            
            if(mid == start)
                return mid + 1;
            return searchInsert(nums, target, mid, end);    
        }
        
        return 0;
    }
}