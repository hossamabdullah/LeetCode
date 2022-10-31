class Solution {
    public int heightChecker(int[] heights) {
        int[] sorted = new int[heights.length];
        for(int i=0; i<sorted.length; i++){
            sorted[i] = heights[i];
        }
        
        Arrays.sort(sorted);
        
        int diff = 0;
        for(int i=0; i<sorted.length; i++){
            if(sorted[i] != heights[i])
                diff++;
        }
        return diff;
    }
}