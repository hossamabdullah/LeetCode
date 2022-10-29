class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        Integer[] before = new Integer[nums.length];
        Integer[] after = new Integer[nums.length];
        int countOfPivot = 0;
        
        
        for(int i=0, j=0, k=0; i<nums.length; i++){
            if(nums[i] > pivot){
                //greater than pivot
                after[k++] = nums[i];
            }else if(nums[i] < pivot){
                //less than pivot
                before[j++] = nums[i];
            }else{
                //equal to pivot
                countOfPivot++;
            }
        }
        
        int[] res = new int[nums.length];
        int i=0;
        for(; i<nums.length&&before[i]!=null; i++){
            res[i] = before[i];
        }
        while(countOfPivot!=0){
            res[i++] = pivot;
            countOfPivot--;
        }
        for(int j=0; i<nums.length && after[j]!=null; i++, j++){
            res[i] = after[j];
        }
        return res;
    }
}