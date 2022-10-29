class Solution {
    public int removeDuplicates(int[] nums) {
        int[] distinct = new int[201];
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int index = nums[i] + 100;
            if(distinct[index] == 1){
                continue;
            }else{
                distinct[index] = 1;
                count++;
            }
        }
        
        // for(int i=0, j=0; i<distinct.length; i++){
            // System.out.print(distinct[i]+",");
        // }
        
        // System.out.println();
        for(int i=0, j=0; i<distinct.length; i++){
            if(distinct[i] == 0)
                continue;
            // System.out.println(i);
            int value = i - 100;
            nums[j++] = value;
        }
        return count;
    }
}