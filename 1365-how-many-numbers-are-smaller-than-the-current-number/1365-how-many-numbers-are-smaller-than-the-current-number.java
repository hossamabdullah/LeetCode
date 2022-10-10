class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> sortedList = Arrays.stream(nums)
                                            .boxed()
                                            .collect(Collectors.toList());
        Collections.sort(sortedList);
        for(int i=0; i<nums.length; i++){
            int indexInSortedArray = sortedList.indexOf(nums[i]);
            nums[i] = indexInSortedArray;
        }
        return nums;
    }
}