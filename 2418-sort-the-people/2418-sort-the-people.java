class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       String[] sorted = new String[names.length];
        for(int i=0; i<heights.length; i++){
            int maxIndex = 0;
            
            for(int j=1; j<heights.length; j++){
                // System.out.println(heights[j]);
                if(heights[j] > heights[maxIndex]){
                    maxIndex = j; 
                }
            }
            
            System.out.println("maxIndex = "+maxIndex+", with value = "+heights[maxIndex]);
            heights[maxIndex] = 0;
            sorted[i] = names[maxIndex];
        }
        return sorted;
    }
}