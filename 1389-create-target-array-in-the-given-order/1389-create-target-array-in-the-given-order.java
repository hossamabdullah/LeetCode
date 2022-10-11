class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> data = new LinkedList<>();
        for(int i=0; i<nums.length; i++){
            data.add(index[i], nums[i]);
        }
        int[] res = new int[data.size()];
        for(int i=0; i<data.size(); i++){
            res[i] = data.get(i);
        }
        return res;
    }
}