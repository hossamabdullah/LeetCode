class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int[] data = new int[201];
        for(int i=0; i<nums.length; i++){
            data[nums[i]] = 1;
        }
        int tripletsCount = 0;
        for(int i=0; i<data.length; i++){
            int count = 0;
            int index = i;
            while(count !=3 && index<data.length && data[index]==1){
                index += diff;
                count++;
            }
            
            if(count == 3)
                tripletsCount++;
        }
        return tripletsCount;
    }
}