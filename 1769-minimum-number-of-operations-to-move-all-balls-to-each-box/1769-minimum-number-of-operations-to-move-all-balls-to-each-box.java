class Solution {
    public int[] minOperations(String boxes) {
        char[] data = boxes.toCharArray();
        int[] effort = new int[data.length];
        for(int i=0; i<data.length; i++){
            for(int j=0; j<data.length; j++){
                if(i == j) continue;
                
                if(data[j] == '1')
                    effort[i] += Math.abs(j-i);
            }
        }
        return effort;
    }
}